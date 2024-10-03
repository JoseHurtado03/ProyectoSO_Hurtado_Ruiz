
package proyecto1_so_hurtado_ruiz;
/**
 *
 * @authors José Hurtado y Joseph Ruiz
 */
public class Main {

    public static void main(String[] args) {
        
        int[] storage = new int[5];     //ALMACÉN 
        Productor motherBoard = new Productor(storage, 0, 20, 1, 2000);
        motherBoard.run();
        
    }
}
