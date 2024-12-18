
package proyecto1_so_hurtado_ruiz;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Assembler extends Thread{
    private int[] storage;            //Almacén en el que debe buscar los componentes
    private int computerStorage;      //Almacén donde colocará las computadoras normales listas
    private int computerGPUStorage;   //Almacén donde colocará las computadoras con GPU listas
    private int nMotherBoard;         //Cantidad que debe tomar de motherboards
    private int nCPU;                 //Cantidad que debe tomar de CPUs
    private int nRAM;                 //Cantidad que debe tomar de memorias RAM
    private int nPowerSupply;         //Cantidad que debe tomar de power supplies
    private int nGPU;                 //Cantidad que debe tomar de tarjetas gráficas
    private int counter;              //Contador para hacer una compu. con GPU por cada counter compu. normal
    private int compuCounter;         //Contador de cuantas compu. normales se deben hacer para luego hacer una con GPU
    private int salary;
    private int days;                 //Días que tarda en hacer una computadora
    private int daysMS;
    private Semaphore mutex;
    private JProgressBar bMB;
    private JProgressBar bCPU;
    private JProgressBar bRAM;
    private JProgressBar bPSU;
    private JProgressBar bGPU;
    private JLabel nCompuI;
    private JLabel gpuCompuI;


    private static final Logger logger = Logger.getLogger(Productor.class.getName());

    public Assembler(int[] storage, int computerStorage, int computerGPUStorage, int nMotherBoard, int nCPU, int nRAM, int nPowerSupply, int nGPU, int compuCounter, int days, int daysMS, Semaphore mutex, JProgressBar bMB, JProgressBar bCPU, JProgressBar bRAM, JProgressBar bPSU, JProgressBar bGPU, JLabel nCompuI, JLabel gpuCompuI) {
        this.storage = storage;
        this.computerStorage = computerStorage;
        this.computerGPUStorage = computerGPUStorage;
        this.nMotherBoard = nMotherBoard;
        this.nCPU = nCPU;
        this.nRAM = nRAM;
        this.nPowerSupply = nPowerSupply;
        this.nGPU = nGPU;
        this.counter = 0;
        this.compuCounter = compuCounter;
        this.salary = 50;
        this.days = days;
        this.daysMS = daysMS;
        this.mutex = mutex;
        this.bMB = bMB;
        this.bCPU = bCPU;
        this.bRAM = bRAM;
        this.bPSU = bPSU;
        this.bGPU = bGPU;
        this.nCompuI = nCompuI;
        this.gpuCompuI = gpuCompuI;
    }
    
    
    
    @Override
    public void run(){
        while (true) {
            try{
                if (counter < compuCounter) {
                    if (this.isPossibleCompuN()) {
                        mutex.acquire();
                        this.buildCompuN();
                        counter++;
                        //System.out.println("Hay "+computerStorage+" computadoras normales");
                        sleep(days*daysMS);
                        mutex.release();
                    }else{
                        //System.out.println("No hay suficientes componentes");
                        sleep(daysMS);
                    }
                } else {
                    if (this.isPossibleCompuGPU()) {
                        mutex.acquire();
                        this.buildCompuGPU();
                        counter = 0;
                        //System.out.println("Hay "+computerGPUStorage+" computadoras con GPU");
                        sleep(days*daysMS);
                        mutex.release();
                    } else {
//                        System.out.println("No hay suficientes componentes para GPU");
                        sleep(daysMS);
                    }
                }
            }catch(InterruptedException e) {
                        logger.log(Level.SEVERE, "Thread interrupted", e);
                }
            }
        }

    
    public boolean isPossibleCompuN(){
        return storage[0] >= nMotherBoard && storage[1] >= nCPU && storage[2] >= nRAM && storage[3] >= nPowerSupply;
    }
    
    public boolean isPossibleCompuGPU(){
        return storage[0] >= nMotherBoard && storage[1] >= nCPU && storage[2] >= nRAM && storage[3] >= nPowerSupply && storage[4] >= nGPU;
    }
    
    public void buildCompuN(){
        storage[0] -= nMotherBoard;
        bMB.setValue(storage[0]);
        
        storage[1] -= nCPU;
        bCPU.setValue(storage[1]);
        
        storage[2] -= nRAM;
        bRAM.setValue(storage[2]);
        
        storage[3] -= nPowerSupply;
        bPSU.setValue(storage[3]);
        
        computerStorage++;
        int aux = Integer.parseInt(nCompuI.getText())+1;
        nCompuI.setText(Integer.toString(aux));
    }
    
    public void buildCompuGPU(){
        storage[0] -= nMotherBoard;
        bMB.setValue(storage[0]);
        
        storage[1] -= nCPU;
        bCPU.setValue(storage[1]);
        
        storage[2] -= nRAM;
        bRAM.setValue(storage[2]);
        
        storage[3] -= nPowerSupply;
        bPSU.setValue(storage[3]);
        
        storage[4] -= nGPU;
        bGPU.setValue(storage[4]);
        
        computerGPUStorage ++;
        int aux = Integer.parseInt(gpuCompuI.getText())+1;
        gpuCompuI.setText(Integer.toString(aux));
    }
}
