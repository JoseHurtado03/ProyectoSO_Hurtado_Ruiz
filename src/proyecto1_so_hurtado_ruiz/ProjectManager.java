
package proyecto1_so_hurtado_ruiz;

import java.util.logging.Logger;

public class ProjectManager extends Thread{
    int daysCounter;                //Contador de los días que faltan para entregar las computadoras
    boolean isWatchingAnime;        //Booleano que indica si el PM está viendo anime
    int salary;                     //Salario del PM (no sé como calcularlo)
    int discount;                   //Cantidad de salario que se le descuenta cuando lo ven viendo anime

    private static final Logger logger = Logger.getLogger(Productor.class.getName());
    
    public ProjectManager(int daysCounter, int salary, int discount) {
        this.daysCounter = daysCounter;
        this.isWatchingAnime = false;
        this.salary = salary;
        this.discount = discount;
    }
    
    @Override
    public void run(){
        long startTime = System.currentTimeMillis(); //Contador del tiempo. 
        while(true){
            try {
                long countTime = System.currentTimeMillis();
                if ((countTime-startTime)%30==0) {
                    if (isWatchingAnime) {
                        isWatchingAnime=false;
                    }else{
                        isWatchingAnime=true;
                    }
                }
            } catch (Exception e) {
            }
            //Si el tiempo del día es menor a 667ms{
            //    Cada 20.833ms cambia el estado de isWatchingAnime
            //}Sino{
            //    Actualiza el daysCounter;
            //}
        }
    }
}
