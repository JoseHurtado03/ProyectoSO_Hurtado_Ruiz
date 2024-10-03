
package proyecto1_so_hurtado_ruiz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread{
    private int[] storage;                //Array del almacén
    private int storageLimit;             //Capacidad máxima del almacén
    private int index;                    //Índice que le corresponde del array
    private int salary;                   //Monto que cobra
    private int productsQuantity;         //Cantidad de producto x que produce en...
    private int days;                     //days días. (1día = 1segundo = 1000ms)

    private static final Logger logger = Logger.getLogger(Productor.class.getName());

    public Productor(int[] storage, int storageLimit, int index, int salary, int productsQuantity, int days) {
        this.storage = storage;
        this.storageLimit = storageLimit;
        this.index = index;
        this.salary = salary;
        this.productsQuantity = productsQuantity;
        this.days = days;
    }
    
    @Override
    public void run(){
        while(true){
            if (storage[index] < storageLimit) {
                try {
                    sleep(days);
                    storage[index] += productsQuantity;
                    System.out.println("Producto añadido correctamente");       //Solo para debug
                    for (int i = 0; i < storage.length; i++) {                  //Solo para debug
                        System.out.println(storage[i]);
                    }
                } catch (InterruptedException e) {
                    logger.log(Level.SEVERE, "Thread interrupted", e);
                }
            }else{
                try{
                    sleep(days);
                    System.out.println("Almacén lleno");                        //Solo para debug
                }catch(InterruptedException e){
                    logger.log(Level.SEVERE, "Thread interrupted", e);
                }
            }
        }
    }
}
