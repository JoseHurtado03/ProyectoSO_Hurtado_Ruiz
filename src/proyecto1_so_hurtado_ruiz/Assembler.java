
package proyecto1_so_hurtado_ruiz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Assembler extends Thread{
    int[] storage;            //Almacén en el que debe buscar los componentes
    int computerStorage;      //Almacén donde colocará las computadoras normales listas
    int computerGPUStorage;   //Almacén donde colocará las computadoras con GPU listas
    int nMotherBoard;         //Cantidad que debe tomar de motherboards
    int nCPU;                 //Cantidad que debe tomar de CPUs
    int nRAM;                 //Cantidad que debe tomar de memorias RAM
    int nPowerSupply;         //Cantidad que debe tomar de power supplies
    int nGPU;                 //Cantidad que debe tomar de tarjetas gráficas
    int counter;              //Contador para hacer una compu. con GPU por cada counter compu. normal
    int compuCounter;         //Contador de cuantas compu. normales se deben hacer para luego hacer una con GPU
    int salary;
    int days;                 //Días que tarda en hacer una computadora

    private static final Logger logger = Logger.getLogger(Productor.class.getName());
    
    public Assembler(int[] storage, int computerStorage, int computerGPUStorage, int nMotherBoard, int nCPU, int nRAM, int nPowerSupply, int nGPU, int compuCounter) {
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
        this.days = 2000;
    }
    
    @Override
    public void run(){
        while (true) {
            if (counter < compuCounter) {
                if (this.isPossibleCompuN()) {
                    try {
                        this.buildCompuN();
                        counter++;
                        System.out.println("Hay "+computerStorage+" computadoras normales");
                        sleep(days);
                    } catch (InterruptedException e) {
                        logger.log(Level.SEVERE, "Thread interrupted", e);
                    }
                }else{
                    try{
                        System.out.println("No hay suficientes componentes");
                        sleep(1000);
                    }catch(InterruptedException e) {
                        logger.log(Level.SEVERE, "Thread interrupted", e);
                    }
                }
            } else {
                if (this.isPossibleCompuGPU()) {
                    try {
                        this.buildCompuGPU();
                        counter = 0;
                        System.out.println("Hay "+computerGPUStorage+" computadoras con GPU");
                        sleep(days);
                    } catch (InterruptedException e) {
                        logger.log(Level.SEVERE, "Thread interrupted", e);
                    }
                } else {
                    try{
                        System.out.println("No hay suficientes componentes para GPU");
                        sleep(1000);
                    }catch(InterruptedException e) {
                        logger.log(Level.SEVERE, "Thread interrupted", e);
                    }
                }
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
        storage[1] -= nCPU;
        storage[2] -= nRAM;
        storage[3] -= nPowerSupply;
        computerStorage++;
    }
    
    public void buildCompuGPU(){
        storage[0] -= nMotherBoard;
        storage[1] -= nCPU;
        storage[2] -= nRAM;
        storage[3] -= nPowerSupply;
        storage[4] -= nGPU;
        computerGPUStorage ++;
    }
}
