/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_so_hurtado_ruiz;

import EDD.List;
import GUI.DELL;
import GUI.HP;
import java.util.concurrent.Semaphore;
import javax.swing.JLabel;

/**
 *
 * @author Joseph
 */
public class Company {
    private String name;
    private int dayMS;
    
    private int[] starterList; //Array de nros de empleados para contratar
    private Semaphore mutex; 
    private int producedPC;
    private int producedGPU_PC;
    //Array de listas de empleados contratados por tipo
//    private List pMBList;
//    private List pCPUList;
//    private List pRAMList;
//    private List pPSUList;
//    private List pGPUList;
//    private List assemblerList;
    private List[] workersList; //[| 0 motherBoard | 1 CPU | 2 RAM | 3 PSU | 4 GPU | 5 assembler |]
    
    private ProjectManager pm;
    private Director director;
    private int[] storage;
    private int maxManufacturers;
    private long startTime;
    
    private HP hpUX;
    private DELL dellUX;

    public Company(String name, int dayMS, int[] starterList, int[] storage, int maxManufacturers, HP hpUX, DELL dellUX) {
        this.name = name;
        this.dayMS= dayMS;
        this.starterList = starterList;
        this.mutex = new Semaphore(1);
//        this.pMBList = new List();
//        this.pCPUList = new List();
//        this.pRAMList = new List();
//        this.pPSUList = new List();
//        this.pGPUList = new List();
//        this.assemblerList = new List();
        this.storage = new int[5];
        this.workersList = new List[8]; //[| 0 motherBoard | 1 CPU | 2 RAM | 3 PSU | 4 GPU | 5 assembler |]
        for (int i = 0; i < workersList.length; i++) {
            workersList[i] = new List(); // Inicializa cada List
        }
        this.maxManufacturers = maxManufacturers;
        this.producedPC = 0;
        this.producedGPU_PC = 0;
        this.startTime = System.currentTimeMillis();
        this.hpUX = hpUX;
        this.dellUX = dellUX;
    }
    
    public void hireSomeEmployees(int companyID, int dayMS) {
        for (int typeWorker = 0 ; typeWorker < getStarterList().length; typeWorker++) { //Itera por la cantidad de empleados distintos que existen
            for (int workerQuantity = 0; workerQuantity < getStarterList()[typeWorker]; workerQuantity++) { //Itera por la cantidad de empleados de x tipo
                Thread employee=findEmployee(companyID, typeWorker, dayMS); //Contrata un nuevo empleado
                
                workersList[typeWorker].addEnd(employee); //[| 0 motherBoard | 1 CPU | 2 RAM | 3 PSU | 4 GPU | 5 assembler | 6 pm |7 director]
            }
        }
    }
    public void hireEmployee(int companyID, int typeWorker, int dayMS) {
        Thread employee=findEmployee(companyID, typeWorker, dayMS); //Contrata un nuevo empleado
        workersList[typeWorker].addEnd(employee); //[| 0 motherBoard | 1 CPU | 2 RAM | 3 PSU | 4 GPU | 5 assembler |]
    }
    

    public Thread findEmployee(int companyID, int typeWorker, int daysMS) {
        Thread employee=null;
        if (companyID==0) { //Estamos en el caso de que contrataremos empleados para HP
            
            if (typeWorker==0) { //Estamos en el caso de que contrataremos MB productores
                employee = new Productor(getStorage(), 25, 0, 20, 1, 2*daysMS, getMutex(), hpUX.pbMB);
            }
            if (typeWorker==1) { //Estamos en el caso de que contrataremos CPU productores
                employee = new Productor(getStorage(), 20, 1, 26, 1, 2*daysMS, getMutex(), hpUX.pbCPU);
            }
            if (typeWorker==2) { //Estamos en el caso de que contrataremos RAM productores
                employee = new Productor(getStorage(), 55, 2, 40, 3, daysMS, getMutex(), hpUX.pbRAM);
            }
            if (typeWorker==3) { //Estamos en el caso de que contrataremos PSU productores
                employee = new Productor(getStorage(), 35, 3, 16, 3, daysMS, getMutex(), hpUX.pbPSU);
            }
            if (typeWorker==4) { //Estamos en el caso de que contrataremos GPU productores
                employee = new Productor(getStorage(), 10, 4, 34, 1, 3*daysMS, getMutex(), hpUX.pbGPU);
            }
            if (typeWorker==5) { //Estamos en el caso de que contrataremos un ensamblador
                employee = new Assembler(getStorage(), getProducedPC(), getProducedGPU_PC(), 1, 1, 2, 4, 3, 2, 2, dayMS, getMutex(), hpUX.pbMB, hpUX.pbCPU, hpUX.pbRAM, hpUX.pbPSU, hpUX.pbGPU, hpUX.nCompuI, hpUX.gpuCompuI);
            }
            if (typeWorker==6) { //Estamos en el caso de que contrataremos un pm
                ProjectManager employeePM = new ProjectManager(20, 40, 0, this.startTime, this.dayMS, hpUX.pmStatus, hpUX.currentsDays);
                employee = employeePM;
                this.pm=employeePM;

            }
            if (typeWorker==7) { //Estamos en el caso de que contrataremos un director
                employee = new Director(20, this.producedPC, this.producedGPU_PC, 90, 140, this.pm, 60, this.dayMS, hpUX.dirStatus, hpUX.nCompuI, hpUX.gpuCompuI); //¡¡Los días restantes deben estar en una variable!!
            }
        } else if (companyID==1){ //Estamos en el caso de que contrataremos empleados para DELL
            
            if (typeWorker==0) { //Estamos en el caso de que contrataremos MB productores
                employee = new Productor(getStorage(), 25, 0, 20, 1, 3*daysMS, getMutex(), dellUX.pbMB); //int[] storage, int storageLimit, int index, int salary, int productsQuantity, int days, Semaphore mutex, JProgressBar bar
            }
            if (typeWorker==1) { //Estamos en el caso de que contrataremos CPU productores
                employee = new Productor(getStorage(), 20, 1, 26, 1, 3*daysMS, getMutex(), dellUX.pbCPU);
            }
            if (typeWorker==2) { //Estamos en el caso de que contrataremos RAM productores
                employee = new Productor(getStorage(), 55, 2, 40, 2, daysMS, getMutex(), dellUX.pbRAM);
            }
            if (typeWorker==3) { //Estamos en el caso de que contrataremos PSU productores
                employee = new Productor(getStorage(), 35, 3, 16, 3, daysMS, getMutex(), dellUX.pbPSU);
            }
            if (typeWorker==4) { //Estamos en el caso de que contrataremos GPU productores
                employee = new Productor(getStorage(), 10, 4, 34, 1, 3*daysMS, getMutex(), dellUX.pbGPU);
            }
            if (typeWorker==5) { //Estamos en el caso de que contrataremos un ensamblador
                employee = new Assembler(getStorage(), getProducedPC(), getProducedGPU_PC(), 1, 1, 2, 4, 3, 2, 2,dayMS, getMutex(), dellUX.pbMB, dellUX.pbCPU, dellUX.pbRAM, dellUX.pbPSU, dellUX.pbGPU, dellUX.nCompuI, dellUX.gpuCompuI);
            }
            if (typeWorker==6) { //Estamos en el caso de que contrataremos un ensamblador
                ProjectManager employeePM = new ProjectManager(20, 40, 0, this.startTime, this.dayMS, dellUX.pmStatus, dellUX.currentsDays);
                employee = employeePM;
                this.pm=employeePM;
            }
            if (typeWorker==7) { //Estamos en el caso de que contrataremos un ensamblador
                employee = new Director(20, this.producedPC, this.producedGPU_PC, 90, 140, this.pm, 60, this.dayMS, dellUX.dirStatus, dellUX.nCompuI, dellUX.gpuCompuI); //¡¡Los días restantes deben estar en una variable!!
            }
        } 
        return employee;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getStarterList() {
        return starterList;
    }

    public void setStarterList(int[] starterList) {
        this.starterList = starterList;
    }

    public List[] getWorkersList() {
        return workersList;
    }

    public void setWorkersList(List[] workersList) {
        this.workersList = workersList;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public List getpMBList() {
        return getWorkersList()[0];
    }

    public void setpMBList(List pMBList) {
        this.getWorkersList()[0] = pMBList;
    }

    public List getpCPUList() {
        return getWorkersList()[1];
    }

    public void setpCPUList(List pCPUList) {
        this.getWorkersList()[1] = pCPUList;
    }

    public List getpRAMList() {
        return getWorkersList()[2];
    }

    public void setpRAMList(List pRAMList) {
        this.getWorkersList()[2] = pRAMList;
    }

    public List getpPSUList() {
        return getWorkersList()[3];
    }

    public void setpPSUList(List pPSUList) {
        this.getWorkersList()[3] = pPSUList;
    }

    public List getpGPUList() {
        return getWorkersList()[4];
    }

    public void setpGPUList(List pGPUList) {
        this.getWorkersList()[4] = pGPUList;
    }

    public List getAssemblerList() {
        return getWorkersList()[5];
    }

    public void setAssemblerList(List assemblerList) {
        this.getWorkersList()[5] = assemblerList;
    }

    public ProjectManager getPm() {
        return pm;
    }

    public void setPm(ProjectManager pm) {
        this.pm = pm;
    }

    public int[] getStorage() {
        return storage;
    }

    public void setStorage(int[] storage) {
        this.storage = storage;
    }

    public int getMaxManufacturers() {
        return maxManufacturers;
    }

    public void setMaxManufacturers(int maxManufacturers) {
        this.maxManufacturers = maxManufacturers;
    }

    public int getProducedPC() {
        return producedPC;
    }

    public void setProducedPC(int producedPC) {
        this.producedPC = producedPC;
    }

    public int getProducedGPU_PC() {
        return producedGPU_PC;
    }

    public void setProducedGPU_PC(int producedGPU_PC) {
        this.producedGPU_PC = producedGPU_PC;
    }
    
}
