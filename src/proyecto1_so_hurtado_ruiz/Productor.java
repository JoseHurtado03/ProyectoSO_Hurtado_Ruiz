
package proyecto1_so_hurtado_ruiz;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Productor extends Thread{
    private int[] storage;                //Array del almacén
    private int storageLimit;             //Capacidad máxima del almacén
    private int index;                    //Índice que le corresponde del array
    private int salary;                   //Monto que cobra
    private int productsQuantity;         //Cantidad de producto x que produce en...
    private int days;                     //days días. (1día = 1segundo = 1000ms)
    private Semaphore mutex;
    private JProgressBar bar;

    private static final Logger logger = Logger.getLogger(Productor.class.getName());

    public Productor(int[] storage, int storageLimit, int index, int salary, int productsQuantity, int days, Semaphore mutex, JProgressBar bar) {
        this.storage = storage;
        this.storageLimit = storageLimit;
        this.index = index;
        this.salary = salary;
        this.productsQuantity = productsQuantity;
        this.days = days;
        this.mutex = mutex;
        this.bar = bar;
    }
    
    @Override
    public void run(){
        try {
            sleep(days);
        } catch (InterruptedException e){
                logger.log(Level.SEVERE, "Thread interrupted", e);
        }
        while(true){
            try{
                if (storage[index] < storageLimit) {
                    mutex.acquire();
                    storage[index] += productsQuantity;
                    int quant = bar.getValue()+1;
                    bar.setValue(quant);
                    System.out.println("Producto añadido correctamente");       //Solo para debug
                    for (int i = 0; i < storage.length; i++) {                  //Solo para debug
                        System.out.println(storage[i]);
                    }
                    mutex.release();
                    sleep(days);
                }else{
                    System.out.println("Almacén lleno");                        //Solo para debug
                    sleep(1000);
                }
            }catch(InterruptedException e){
                logger.log(Level.SEVERE, "Thread interrupted", e);
            }
        }
    }
}
