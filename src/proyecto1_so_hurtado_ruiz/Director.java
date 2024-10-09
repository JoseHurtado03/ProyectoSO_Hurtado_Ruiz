
package proyecto1_so_hurtado_ruiz;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Director extends Thread{
    private int daysCounter;               //Contador de los días faltantes para entregar las computadoras.
    private int compuN;                    //Almacén de las computadoras normales.
    private int compuGPU;                  //Almacén de las computadoras con GPU.
    private int priceCompuN;               //Precio de las computadoras normales.
    private int priceCompuGPU;             //Precio de las computadoras con GPU.
    private int income;                    //Ingresos por venta de computadoras.
    private ProjectManager PM;             //PM de la empresa.
    private int salary;

    private static final Logger logger = Logger.getLogger(Productor.class.getName());

    public Director(int daysCounter, int compuN, int compuGPU, int priceCompuN, int priceCompuGPU, ProjectManager PM, int salary) {
        this.daysCounter = daysCounter;
        this.compuN = compuN;
        this.compuGPU = compuGPU;
        this.priceCompuN = priceCompuN;
        this.priceCompuGPU = priceCompuGPU;
        this.PM = PM;
        this.income = 0;
        this.salary = salary;
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
                    sleep(1000-(random+25));                            //Duerme el código por el tiempo restante del día
                } catch (InterruptedException e) {
                    logger.log(Level.SEVERE, "Thread interrupted", e);
                }
                
            } else {
                try {
                    this.deliverComputers();             //Entrega las computadoras listas y actualiza la ganancia.
                    daysCounter = 20;                    //Reinicia el contador de días para la entrega.
                    sleep(998);                          //Todo lo anterior lo hace en un día = 1000ms.
                } catch (InterruptedException e) {
                    logger.log(Level.SEVERE, "Thread interrupted", e);
                }
            }
        }
    }
    
    public int generateRandomNum(){
        Random random = new Random();
        return random.nextInt(976);
    }
    
    public void supervisePM(long startTime, long currentTime){
        while (currentTime - startTime < 25) {              //25ms es el equivalente a 35min, si consideramos 24hrs = 1000ms
            if (PM.isIsWatchingAnime()) {
                PM.setDiscount(PM.getDiscount() + 100);
            }
        }
    }
        
    public void deliverComputers(){
        this.income += compuN * priceCompuN;
        this.income += compuGPU * priceCompuGPU;
        compuN = 0;                                         //Vacía el almacén de computadoras normales.
        compuGPU = 0;                                       //Vacía el almacén de computadoras con GPU.
    }
}