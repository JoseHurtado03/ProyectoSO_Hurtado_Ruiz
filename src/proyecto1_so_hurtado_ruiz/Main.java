
package proyecto1_so_hurtado_ruiz;
/**
 *
 * @authors José Hurtado y Joseph Ruiz
 */
public class Main {

    public static void main(String[] args) {
        
        int[] storage = new int[5];     //ALMACÉN   |0 motherBoard| 1 CPU | 2 RAM | 3 Fuente A | 4 GPU |
        Productor motherBoard = new Productor(storage, 8, 0, 20, 1, 2000);
        Productor CPU = new Productor(storage, 10, 1, 26, 1, 2000);
        motherBoard.start();
        CPU.start(); 
    }
}
