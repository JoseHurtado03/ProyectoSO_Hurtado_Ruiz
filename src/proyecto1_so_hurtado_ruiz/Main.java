
package proyecto1_so_hurtado_ruiz;
/**
 *
 * @authors José Hurtado y Joseph Ruiz
 */
public class Main {

    public static void main(String[] args) {
        //EMPRESA HP
        int[] storageHP = new int[5];     //ALMACÉN   [|0 motherBoard| 1 CPU | 2 RAM | 3 Fuente A | 4 GPU |]
        int compuNHP = 0;
        int compuGPU_HP = 0;
        
        
        Productor motherBoard = new Productor(storageHP, 25, 0, 20, 1, 2000);
        Productor CPU = new Productor(storageHP, 20, 1, 26, 1, 2000);
        Productor RAM = new Productor(storageHP, 55, 2, 40, 3, 1000);
        Productor powerSupply = new Productor(storageHP, 35, 3, 16, 3, 1000);
        Productor GPU = new Productor(storageHP, 10, 4, 34, 1, 3000);
        
        Assembler assemblerHP = new Assembler(storageHP, compuNHP, compuGPU_HP, 1, 1, 2, 4, 3, 2);
        
        assemblerHP.start();
        motherBoard.start();
        CPU.start();
        RAM.start();
        powerSupply.start();
        GPU.start();
    }
}
