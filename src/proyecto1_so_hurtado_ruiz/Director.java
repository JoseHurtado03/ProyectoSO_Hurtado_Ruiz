
package proyecto1_so_hurtado_ruiz;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Director extends Thread{
    private int daysCounter;               //Contador de los días faltantes para entregar las computadoras.
    private int compuN;                    //Almacén de las computadoras normales.
    private int compuGPU;                  //Almacén de las computadoras con GPU.
    private int priceCompuN;               //Precio de las computadoras normales.
    private int priceCompuGPU;             //Precio de las computadoras con GPU.
    private int income;                    //Ingresos por venta de computadoras.
    private ProjectManager PM;             //PM de la empresa.
    private int salary;
    private int dayMS;
    private JLabel status;
    private JLabel nCompuI;
    private JLabel gpuCompuI;

    private static final Logger logger = Logger.getLogger(Productor.class.getName());

    public Director(int daysCounter, int compuN, int compuGPU, int priceCompuN, int priceCompuGPU, ProjectManager PM, int salary, int dayMS, JLabel status, JLabel nCompuI, JLabel gpuCompuI) {
        this.daysCounter = daysCounter;
        this.compuN = compuN;
        this.compuGPU = compuGPU;
        this.priceCompuN = priceCompuN;
        this.priceCompuGPU = priceCompuGPU;
        this.PM = PM;
        this.income = 0;
        this.salary = salary;
        this.dayMS = dayMS;
        this.status = status;
        this.nCompuI = nCompuI;
        this.gpuCompuI = gpuCompuI;
    }
    
    
    @Override
    public void run(){
        while(true){
            if (daysCounter != 0){
                try {
                    int random = this.generateRandomNum();
                    sleep(random);
                    long startTime = System.currentTimeMillis();
                    long currentTime = System.currentTimeMillis();
                    this.supervisePM(startTime, currentTime);           //Supervisa al PM
                    sleep(dayMS-(random+((25*dayMS)/1000)));            //Duerme el código por el tiempo restante del día
                } catch (InterruptedException e) {
                    logger.log(Level.SEVERE, "Thread interrupted", e);
                }
                
            } else {
                try {
                    this.deliverComputers();             //Entrega las computadoras listas y actualiza la ganancia.
                    daysCounter = 20;                    //Reinicia el contador de días para la entrega.
                    sleep(dayMS);                        //Todo lo anterior lo hace en un día = 1000ms.
                } catch (InterruptedException e) {
                    logger.log(Level.SEVERE, "Thread interrupted", e);
                }
            }
        }
    }
    
    public int generateRandomNum(){
        Random random = new Random();
        int revisionTime = (25*dayMS)/1000;
        return random.nextInt(dayMS-revisionTime);
    }
    
    public void supervisePM(long startTime, long currentTime){
        status.setText("Supervising");
        while (currentTime - startTime < ((25*dayMS)/1000)) {              //25ms es el equivalente a 35min, si consideramos 24hrs = 1000ms
            if (PM.isIsWatchingAnime()) {
                PM.setDiscount(PM.getDiscount() + 100);
            }
        }
        status.setText("Working");
    }
        
    public void deliverComputers(){
        this.income += compuN * priceCompuN;
        this.income += compuGPU * priceCompuGPU;
        compuN = 0;                                         //Vacía el almacén de computadoras normales.
        compuGPU = 0;                                       //Vacía el almacén de computadoras con GPU.
        nCompuI.setText("0");
        gpuCompuI.setText("0");
    }
}