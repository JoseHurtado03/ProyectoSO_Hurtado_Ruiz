
package proyecto1_so_hurtado_ruiz;    
import EDD.List;
import java.util.concurrent.Semaphore;
import GUI.mainMenu;
/**
 *
 * @authors José Hurtado y Joseph Ruiz
 */
public class Main {
    public final static mainMenu mainGUI = new mainMenu();
    
    
//    public void main(String[] args) {
//        //EMPRESA HP
////        long startTime = System.currentTimeMillis();
////        Semaphore mutexHP= new Semaphore(1);
////        int[] storageHP = new int[5];     //ALMACÉN   [|0 motherBoard| 1 CPU | 2 RAM | 3 PSU | 4 GPU |]
////        int compuNHP = 0;
////        int compuGPU_HP = 0;
////        
////        
////        List pMBList= new List();
////        List pCPUList= new List();
////        List pRAMList= new List();
////        List pGPUList= new List();
////        List pPSUList= new List();
////        List assemblerHPList= new List();
////
////        Productor motherBoard = new Productor(storageHP, 25, 0, 20, 1, 2000, mutexHP);
////        Productor motherBoard2 = new Productor(storageHP, 25, 0, 20, 1, 2000, mutexHP);
////        Productor motherBoard3 = new Productor(storageHP, 25, 0, 20, 1, 2000, mutexHP);
////        Productor CPU = new Productor(storageHP, 20, 1, 26, 1, 2000, mutexHP);
////        Productor RAM = new Productor(storageHP, 55, 2, 40, 3, 1000, mutexHP);
////        Productor PSU = new Productor(storageHP, 35, 3, 16, 3, 1000, mutexHP);
////        Productor GPU = new Productor(storageHP, 10, 4, 34, 1, 3000, mutexHP);
////        
////        Assembler assemblerHP = new Assembler(storageHP, compuNHP, compuGPU_HP, 1, 1, 2, 4, 3, 2, 2000, mutexHP);
////        ProjectManager pmHP= new ProjectManager(20, 40, 0, startTime);
//        
////        pMBList.addEnd(motherBoard);
////        pMBList.addEnd(motherBoard2);
////        pMBList.addEnd(motherBoard3);
////        pCPUList.addEnd(CPU);
////        pPSUList.addEnd(PSU);
////        pRAMList.addEnd(RAM);
////        pGPUList.addEnd(GPU);
////        assemblerHPList.addEnd(aszsemblerHP);
////        pmHP.start();
//        
//        
//    }
}
