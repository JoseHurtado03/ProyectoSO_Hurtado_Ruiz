
package proyecto1_so_hurtado_ruiz;

import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JLabel;


public class ProjectManager extends Thread{
    private int daysCounter;                //Contador de los días que faltan para entregar las computadoras
    private boolean isWatchingAnime;        //Booleano que indica si el PM está viendo anime
    private int salary;                     //Salario del PM (no sé como calcularlo)
    private int discount;                   //Cantidad de salario que se le descuenta cuando lo ven viendo anime
    private long hoursCounter;
    private int dayMS;
    private JLabel status;
    private JLabel counter;

    private static final Logger logger = Logger.getLogger(Productor.class.getName());
    
    public ProjectManager(int daysCounter, int salary, int discount, long hoursCounter, int dayMS, JLabel status, JLabel counter) {
        this.daysCounter = daysCounter;
        this.isWatchingAnime = false;
        this.salary = salary;
        this.discount = discount;
        this.hoursCounter = hoursCounter;
        this.dayMS = dayMS;
        this.status = status;
        this.counter = counter;
    }
    
    @Override
    public void run(){
        while(true){
            long currentTime = System.currentTimeMillis();     //Guarda el tiempo actual y va aumentando cada vez que se ejecuta run(). 
            try {
                if (currentTime-getHoursCounter() < 0.667*dayMS){      //667ms es el equivalente a 16hrs (Si consideramos que 24hrs son 1000ms)
                    if (isIsWatchingAnime()){
                        this.setIsWatchingAnime(false);
                        status.setText("Working");
                    }else{
                        this.setIsWatchingAnime(true);
                        status.setText("Anime");
                    }
                    //System.out.println(currentTime-getHoursCounter());
                    int halfHour = ((21*dayMS)/1000);
                    sleep(halfHour);                                 //20,833ms es el equivalente a 30min (Si consideramos que 24hrs son 1000ms)
                } else{
                    this.setIsWatchingAnime(false);
                    status.setText("Working");
                    this.setHoursCounter(System.currentTimeMillis());
                    //System.out.println("PASÓ UN DÍA");
                    daysCounter--;
                    int days = Integer.parseInt(counter.getText())-1;
                    counter.setText(Integer.toString(days));
                    int eightHours = ((332*dayMS)/1000);
                    sleep(eightHours);                                //333ms es el equivalente a 8hrs (Si consideramos que 24hrs son 1000ms)
                }
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "Thread interrupted", e);
            }
        }
    }

    /**
     * @return the daysCounter
     */
    public int getDaysCounter() {
        return daysCounter;
    }

    /**
     * @param daysCounter the daysCounter to set
     */
    public void setDaysCounter(int daysCounter) {
        this.daysCounter = daysCounter;
    }

    /**
     * @return the isWatchingAnime
     */
    public boolean isIsWatchingAnime() {
        return isWatchingAnime;
    }

    /**
     * @param isWatchingAnime the isWatchingAnime to set
     */
    public void setIsWatchingAnime(boolean isWatchingAnime) {
        this.isWatchingAnime = isWatchingAnime;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * @return the hoursCounter
     */
    public long getHoursCounter() {
        return hoursCounter;
    }

    /**
     * @param hoursCounter the hoursCounter to set
     */
    public void setHoursCounter(long hoursCounter) {
        this.hoursCounter = hoursCounter;
    }
    
    
}
