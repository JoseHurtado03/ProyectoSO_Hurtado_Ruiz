/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.JOptionPane;
import proyecto1_so_hurtado_ruiz.Main;
import proyecto1_so_hurtado_ruiz.Company;
/**
 *
 * @author hvjos
 */
public class DELL extends javax.swing.JFrame {
    static Company dell;
    /**
     * Creates new form DELL
     * @param dell
     */
    public DELL(Company dell) {
        initComponents();
        this.setLocationRelativeTo(null);
        //this.dell = dell;
        //fieldTotalWorkers.setText(String.valueOf(dell.getWorkersList()[0].getSize()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fieldTotalWorkers1 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        numMBM = new javax.swing.JTextField();
        numCPU = new javax.swing.JTextField();
        numRAM = new javax.swing.JTextField();
        numPSU = new javax.swing.JTextField();
        numGPU = new javax.swing.JTextField();
        numAssembler = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LoadingBarMB = new javax.swing.JProgressBar();
        LoadingBarCPU = new javax.swing.JProgressBar();
        LoadingBarPSU = new javax.swing.JProgressBar();
        LoadingBarRAM = new javax.swing.JProgressBar();
        LoadingBarGPU = new javax.swing.JProgressBar();
        QuantityMB = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        QuantityCPU = new javax.swing.JLabel();
        QuantityRAM = new javax.swing.JLabel();
        QuantityPSU = new javax.swing.JLabel();
        QuantityGPU = new javax.swing.JLabel();
        ManufacturedGPUPCs = new javax.swing.JLabel();
        ManufacturedNormalPCs = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        QuantityMB1 = new javax.swing.JLabel();
        QuantityCPU1 = new javax.swing.JLabel();
        QuantityRAM1 = new javax.swing.JLabel();
        QuantityPSU1 = new javax.swing.JLabel();
        QuantityGPU1 = new javax.swing.JLabel();
        ManufacturedGPUPCs1 = new javax.swing.JLabel();
        ManufacturedNormalPCs1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 39, 84));
        jPanel1.setForeground(new java.awt.Color(51, 68, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(50, 39, 84));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("DELL Data");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 223, 219));
        jLabel1.setText("Made by Hurtado, José & Ruiz, Joseph ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jPanel2.setBackground(new java.awt.Color(87, 59, 48));
        jPanel2.setToolTipText("-");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Workers");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MotherBoard Manufacturers");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPU Manufacturers");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RAM Manufacturers");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PSU Manufacturers");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GPU Manufacturers");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Assemblers");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        fieldTotalWorkers1.setText("15");
        fieldTotalWorkers1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(fieldTotalWorkers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 35, 30));

        jButton27.setText("+");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 30));

        numMBM.setText("0");
        numMBM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(numMBM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 35, 30));

        numCPU.setText("0");
        numCPU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(numCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 35, 30));

        numRAM.setText("0");
        numRAM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(numRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 35, 30));

        numPSU.setText("0");
        numPSU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(numPSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 35, 30));

        numGPU.setText("0");
        numGPU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(numGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 35, 30));

        numAssembler.setText("0");
        numAssembler.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(numAssembler, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 35, 30));

        jButton28.setText("-");
        jButton28.setToolTipText("-");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 30));

        jButton21.setText("-");
        jButton21.setToolTipText("-");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 30));

        jButton22.setText("-");
        jButton22.setToolTipText("-");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 30));

        jButton23.setText("-");
        jButton23.setToolTipText("-");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 30));

        jButton24.setText("-");
        jButton24.setToolTipText("-");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 30));

        jButton25.setText("-");
        jButton25.setToolTipText("-");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, 30));

        jButton26.setText("-");
        jButton26.setToolTipText("-");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 30));

        jButton16.setText("+");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 30));

        jButton19.setText("+");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, 30));

        jButton20.setText("+");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, 30));

        jButton17.setText("+");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 30));

        jButton18.setText("+");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, 30));

        jButton15.setText("+");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 44, 360, 370));

        jPanel3.setBackground(new java.awt.Color(87, 59, 48));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Components in Storage");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MotherBoards");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CPUs");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RAMs");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PSUs");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 139, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("GPUs");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 165, -1, -1));
        jPanel3.add(LoadingBarMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 61, 111, 20));
        jPanel3.add(LoadingBarCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 87, 111, 20));
        jPanel3.add(LoadingBarPSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 139, 111, 20));
        jPanel3.add(LoadingBarRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 113, 111, 20));
        jPanel3.add(LoadingBarGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 165, 111, 20));

        QuantityMB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityMB.setForeground(new java.awt.Color(255, 255, 255));
        QuantityMB.setText("15");
        jPanel3.add(QuantityMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 61, 47, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Normal Computers");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 226, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("GPU Computers");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 252, -1, -1));

        QuantityCPU.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityCPU.setForeground(new java.awt.Color(255, 255, 255));
        QuantityCPU.setText("15");
        jPanel3.add(QuantityCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 87, 47, -1));

        QuantityRAM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityRAM.setForeground(new java.awt.Color(255, 255, 255));
        QuantityRAM.setText("15");
        jPanel3.add(QuantityRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 113, 47, -1));

        QuantityPSU.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityPSU.setForeground(new java.awt.Color(255, 255, 255));
        QuantityPSU.setText("15");
        jPanel3.add(QuantityPSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 139, 47, -1));

        QuantityGPU.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityGPU.setForeground(new java.awt.Color(255, 255, 255));
        QuantityGPU.setText("15");
        jPanel3.add(QuantityGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 165, 47, -1));

        ManufacturedGPUPCs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManufacturedGPUPCs.setForeground(new java.awt.Color(255, 255, 255));
        ManufacturedGPUPCs.setText("15");
        jPanel3.add(ManufacturedGPUPCs, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 252, 47, -1));

        ManufacturedNormalPCs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManufacturedNormalPCs.setForeground(new java.awt.Color(255, 255, 255));
        ManufacturedNormalPCs.setText("15");
        jPanel3.add(ManufacturedNormalPCs, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 226, 47, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Total Manufactured Computers ");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 191, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 44, -1, 280));

        jPanel4.setBackground(new java.awt.Color(87, 59, 48));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Status ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("PM");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 61, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Director");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Days until Deadline");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Days passed");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, -1, -1));

        QuantityMB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityMB1.setForeground(new java.awt.Color(255, 255, 255));
        QuantityMB1.setText("Working");
        jPanel4.add(QuantityMB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 61, 69, -1));

        QuantityCPU1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityCPU1.setForeground(new java.awt.Color(255, 255, 255));
        QuantityCPU1.setText("Working");
        jPanel4.add(QuantityCPU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 87, 69, -1));

        QuantityRAM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityRAM1.setForeground(new java.awt.Color(255, 255, 255));
        QuantityRAM1.setText("15");
        jPanel4.add(QuantityRAM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 119, 47, -1));

        QuantityPSU1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityPSU1.setForeground(new java.awt.Color(255, 255, 255));
        QuantityPSU1.setText("15");
        jPanel4.add(QuantityPSU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 145, 47, -1));

        QuantityGPU1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuantityGPU1.setForeground(new java.awt.Color(255, 255, 255));
        QuantityGPU1.setText("15");
        jPanel4.add(QuantityGPU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 165, 47, -1));

        ManufacturedGPUPCs1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManufacturedGPUPCs1.setForeground(new java.awt.Color(255, 255, 255));
        ManufacturedGPUPCs1.setText("15");
        jPanel4.add(ManufacturedGPUPCs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 217, 47, -1));

        ManufacturedNormalPCs1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManufacturedNormalPCs1.setForeground(new java.awt.Color(255, 255, 255));
        ManufacturedNormalPCs1.setText("15");
        jPanel4.add(ManufacturedNormalPCs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 191, 47, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 44, -1, 240));

        backButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        backButton.setText("🔙");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        Main.mainGUI.setVisible(true);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        int num = Integer.parseInt(fieldTotalWorkers1.getText());
        num++;
        fieldTotalWorkers1.setText(Integer.toString(num));
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int num = Integer.parseInt(numMBM.getText());
        if (num > 1){
            num--;
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe haber al menos 1 empleado de cada tipo.");
        }
        numMBM.setText(Integer.toString(num));
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        int num = Integer.parseInt(numCPU.getText());
        if (num > 1){
            num--;
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe haber al menos 1 empleado de cada tipo.");
        }
        numCPU.setText(Integer.toString(num));
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        int num = Integer.parseInt(numRAM.getText());
        if (num > 1){
            num--;
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe haber al menos 1 empleado de cada tipo.");
        }
        numRAM.setText(Integer.toString(num));
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int num = Integer.parseInt(numPSU.getText());
        if (num > 1){
            num--;
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe haber al menos 1 empleado de cada tipo.");
        }
        numPSU.setText(Integer.toString(num));
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        int num = Integer.parseInt(numGPU.getText());
        if (num > 1){
            num--;
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe haber al menos 1 empleado de cada tipo.");
        }
        numGPU.setText(Integer.toString(num));
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        int num = Integer.parseInt(numAssembler.getText());
        if (num > 1){
            num--;
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe haber al menos 1 empleado de cada tipo.");
        }
        numAssembler.setText(Integer.toString(num));
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int nMBM = Integer.parseInt(numMBM.getText());
        int nCPU = Integer.parseInt(numCPU.getText());
        int nRAM = Integer.parseInt(numRAM.getText());
        int nPSU = Integer.parseInt(numPSU.getText());
        int nGPU = Integer.parseInt(numGPU.getText());
        int nAssemb = Integer.parseInt(numAssembler.getText());
        int maxWorkers = Integer.parseInt(fieldTotalWorkers1.getText());
        int currentQWorkers = nMBM + nCPU + nRAM + nPSU + nGPU + nAssemb;
        if (currentQWorkers < maxWorkers){
            int num = Integer.parseInt(numCPU.getText());
            num++;
            numCPU.setText(Integer.toString(num));
        } else{
            JOptionPane.showMessageDialog(null, "No se debe sobrepasar la máxima cantidad de empleados");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        int nMBM = Integer.parseInt(numMBM.getText());
        int nCPU = Integer.parseInt(numCPU.getText());
        int nRAM = Integer.parseInt(numRAM.getText());
        int nPSU = Integer.parseInt(numPSU.getText());
        int nGPU = Integer.parseInt(numGPU.getText());
        int nAssemb = Integer.parseInt(numAssembler.getText());
        int maxWorkers = Integer.parseInt(fieldTotalWorkers1.getText());
        int currentQWorkers = nMBM + nCPU + nRAM + nPSU + nGPU + nAssemb;
        if (currentQWorkers < maxWorkers){
            int num = Integer.parseInt(numAssembler.getText());
            num++;
            numAssembler.setText(Integer.toString(num));
        } else{
            JOptionPane.showMessageDialog(null, "No se debe sobrepasar la máxima cantidad de empleados");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int nMBM = Integer.parseInt(numMBM.getText());
        int nCPU = Integer.parseInt(numCPU.getText());
        int nRAM = Integer.parseInt(numRAM.getText());
        int nPSU = Integer.parseInt(numPSU.getText());
        int nGPU = Integer.parseInt(numGPU.getText());
        int nAssemb = Integer.parseInt(numAssembler.getText());
        int maxWorkers = Integer.parseInt(fieldTotalWorkers1.getText());
        int currentQWorkers = nMBM + nCPU + nRAM + nPSU + nGPU + nAssemb;
        if (currentQWorkers < maxWorkers){
            int num = Integer.parseInt(numGPU.getText());
            num++;
            numGPU.setText(Integer.toString(num));
        } else{
            JOptionPane.showMessageDialog(null, "No se debe sobrepasar la máxima cantidad de empleados");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int nMBM = Integer.parseInt(numMBM.getText());
        int nCPU = Integer.parseInt(numCPU.getText());
        int nRAM = Integer.parseInt(numRAM.getText());
        int nPSU = Integer.parseInt(numPSU.getText());
        int nGPU = Integer.parseInt(numGPU.getText());
        int nAssemb = Integer.parseInt(numAssembler.getText());
        int maxWorkers = Integer.parseInt(fieldTotalWorkers1.getText());
        int currentQWorkers = nMBM + nCPU + nRAM + nPSU + nGPU + nAssemb;
        if (currentQWorkers < maxWorkers){
            int num = Integer.parseInt(numPSU.getText());
            num++;
            numPSU.setText(Integer.toString(num));
        } else{
            JOptionPane.showMessageDialog(null, "No se debe sobrepasar la máxima cantidad de empleados");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int nMBM = Integer.parseInt(numMBM.getText());
        int nCPU = Integer.parseInt(numCPU.getText());
        int nRAM = Integer.parseInt(numRAM.getText());
        int nPSU = Integer.parseInt(numPSU.getText());
        int nGPU = Integer.parseInt(numGPU.getText());
        int nAssemb = Integer.parseInt(numAssembler.getText());
        int maxWorkers = Integer.parseInt(fieldTotalWorkers1.getText());
        int currentQWorkers = nMBM + nCPU + nRAM + nPSU + nGPU + nAssemb;
        if (currentQWorkers < maxWorkers){
            int num = Integer.parseInt(numRAM.getText());
            num++;
            numRAM.setText(Integer.toString(num));
        } else{
            JOptionPane.showMessageDialog(null, "No se debe sobrepasar la máxima cantidad de empleados");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int nMBM = Integer.parseInt(numMBM.getText());
        int nCPU = Integer.parseInt(numCPU.getText());
        int nRAM = Integer.parseInt(numRAM.getText());
        int nPSU = Integer.parseInt(numPSU.getText());
        int nGPU = Integer.parseInt(numGPU.getText());
        int nAssemb = Integer.parseInt(numAssembler.getText());
        int maxWorkers = Integer.parseInt(fieldTotalWorkers1.getText());
        int currentQWorkers = nMBM + nCPU + nRAM + nPSU + nGPU + nAssemb;
        if (currentQWorkers < maxWorkers){
            int num = Integer.parseInt(numMBM.getText());
            num++;
            numMBM.setText(Integer.toString(num));
        } else{
            JOptionPane.showMessageDialog(null, "No se debe sobrepasar la máxima cantidad de empleados");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELL(dell).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadingBarCPU;
    private javax.swing.JProgressBar LoadingBarGPU;
    private javax.swing.JProgressBar LoadingBarMB;
    private javax.swing.JProgressBar LoadingBarPSU;
    private javax.swing.JProgressBar LoadingBarRAM;
    private javax.swing.JLabel ManufacturedGPUPCs;
    private javax.swing.JLabel ManufacturedGPUPCs1;
    private javax.swing.JLabel ManufacturedNormalPCs;
    private javax.swing.JLabel ManufacturedNormalPCs1;
    private javax.swing.JLabel QuantityCPU;
    private javax.swing.JLabel QuantityCPU1;
    private javax.swing.JLabel QuantityGPU;
    private javax.swing.JLabel QuantityGPU1;
    private javax.swing.JLabel QuantityMB;
    private javax.swing.JLabel QuantityMB1;
    private javax.swing.JLabel QuantityPSU;
    private javax.swing.JLabel QuantityPSU1;
    private javax.swing.JLabel QuantityRAM;
    private javax.swing.JLabel QuantityRAM1;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField fieldTotalWorkers1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField numAssembler;
    private javax.swing.JTextField numCPU;
    private javax.swing.JTextField numGPU;
    private javax.swing.JTextField numMBM;
    private javax.swing.JTextField numPSU;
    private javax.swing.JTextField numRAM;
    // End of variables declaration//GEN-END:variables
}
