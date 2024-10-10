package proyecto1_so_hurtado_ruiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextField;

public class FileManager {

    private String fileName;
    private JTextField daysMS;
    private JTextField deadline;
    private JTextField nMB_HP;
    private JTextField nCPU_HP;
    private JTextField nRAM_HP;
    private JTextField nPSU_HP;
    private JTextField nGPU_HP;
    private JTextField nAssemb_HP;
    private JTextField nMB_DELL;
    private JTextField nCPU_DELL;
    private JTextField nRAM_DELL;
    private JTextField nPSU_DELL;
    private JTextField nGPU_DELL;
    private JTextField nAssemb_DELL;

    // Constructor que recibe todos los JTextField
    public FileManager(JTextField daysMS, JTextField deadline, JTextField nMB_HP, JTextField nCPU_HP, JTextField nRAM_HP, JTextField nPSU_HP, JTextField nGPU_HP, JTextField nAssemb_HP, JTextField nMB_DELL, JTextField nCPU_DELL, JTextField nRAM_DELL, JTextField nPSU_DELL, JTextField nGPU_DELL, JTextField nAssemb_DELL) {
        this.fileName = "simulationData.txt";
        this.daysMS = daysMS;
        this.deadline = deadline;
        this.nMB_HP = nMB_HP;
        this.nCPU_HP = nCPU_HP;
        this.nRAM_HP = nRAM_HP;
        this.nPSU_HP = nPSU_HP;
        this.nGPU_HP = nGPU_HP;
        this.nAssemb_HP = nAssemb_HP;
        this.nMB_DELL = nMB_DELL;
        this.nCPU_DELL = nCPU_DELL;
        this.nRAM_DELL = nRAM_DELL;
        this.nPSU_DELL = nPSU_DELL;
        this.nGPU_DELL = nGPU_DELL;
        this.nAssemb_DELL = nAssemb_DELL;
    }

    // Escribe los datos en un archivo .txt
    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Primera línea: duración del día y deadline de entrega
            writer.write(daysMS.getText() + "," + deadline.getText() + "/\n");

            // Segunda línea: trabajadores de HP
            writer.write(nMB_HP.getText() + "," + nCPU_HP.getText() + "," + nRAM_HP.getText() + "," + nPSU_HP.getText() + "," + nGPU_HP.getText() + "," + nAssemb_HP.getText() + "/\n");

            // Tercera línea: trabajadores de DELL
            writer.write(nMB_DELL.getText() + "," + nCPU_DELL.getText() + "," + nRAM_DELL.getText() + "," + nPSU_DELL.getText() + "," + nGPU_DELL.getText() + "," + nAssemb_DELL.getText() + "/\n");

            System.out.println("Datos guardados exitosamente en " + fileName);
        } catch (IOException e) {
            System.out.println("Error escribiendo en el archivo: " + e.getMessage());
        }
    }

    // Lee los datos desde un archivo .txt
    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Leer primera línea: duración del día y deadline
            String[] firstLine = reader.readLine().split(",");
            daysMS.setText(firstLine[0]);  // Duración del día en milisegundos
            deadline.setText(firstLine[1].replace("/", ""));  // Deadline de entrega

            // Leer segunda línea: trabajadores de HP
            String[] hpLine = reader.readLine().replace("/", "").split(",");
            nMB_HP.setText(hpLine[0]);
            nCPU_HP.setText(hpLine[1]);
            nRAM_HP.setText(hpLine[2]);
            nPSU_HP.setText(hpLine[3]);
            nGPU_HP.setText(hpLine[4]);
            nAssemb_HP.setText(hpLine[5]);

            // Leer tercera línea: trabajadores de DELL
            String[] dellLine = reader.readLine().replace("/", "").split(",");
            nMB_DELL.setText(dellLine[0]);
            nCPU_DELL.setText(dellLine[1]);
            nRAM_DELL.setText(dellLine[2]);
            nPSU_DELL.setText(dellLine[3]);
            nGPU_DELL.setText(dellLine[4]);
            nAssemb_DELL.setText(dellLine[5]);

            System.out.println("Datos leídos exitosamente desde " + fileName);
        } catch (IOException e) {
            System.out.println("Error leyendo del archivo: " + e.getMessage());
        }
    }
}
