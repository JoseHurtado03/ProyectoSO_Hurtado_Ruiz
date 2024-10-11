/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import EDD.List;
import java.util.concurrent.Semaphore;
import proyecto1_so_hurtado_ruiz.Assembler;
import proyecto1_so_hurtado_ruiz.Main;
import proyecto1_so_hurtado_ruiz.Productor;
import proyecto1_so_hurtado_ruiz.ProjectManager;
import proyecto1_so_hurtado_ruiz.Company;

/**
 *
 * @author josep
 */
public class mainMenu extends javax.swing.JFrame {
    //GUIs
    public static HP hpWindow;
    public static DELL dellWindow;
    
    //General variables. Hp and Dell should have their own
    public long startTime;
    public int[] storageHP;       //ALMACÉN   [| 0 motherBoard | 1 CPU | 2 RAM | 3 PSU | 4 GPU |]
    public int[] storageDELL;     //ALMACÉN   [| 0 motherBoard | 1 CPU | 2 RAM | 3 PSU | 4 GPU |]
    public int dayMS;

    //Variables para iniciar la simulación
    public int[] workersHP; //Array, dice cuántos empleados contratar. [| 0 motherBoard | 1 CPU | 2 RAM | 3 PSU | 4 GPU | 5 assemblers|]
    //Workers debe ser un arreglo que se use para exportar e importar la info al txt.
    public int[] workersDell;
    
    public static Company dell;
    public  static Company hp;
    
    
    /**
     * Creates new form mainMenu1
     */
    public mainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.storageHP= new int[5];
        this.workersHP= new int[6];
        for (int i = 0; i < workersHP.length; i++) {
            workersHP[i]=1;
        }
        this.workersDell=workersHP;
        this.dayMS= Integer.parseInt(fieldDaysMS.getText());
        
        hpWindow = new HP();
        dellWindow = new DELL(dell);
        
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
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        HP = new javax.swing.JButton();
        Dell = new javax.swing.JButton();
        importTXT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldDaysMS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldDeadlineMS = new javax.swing.JTextField();
        exportTXT = new javax.swing.JButton();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(50, 39, 84));
        jPanel2.setForeground(new java.awt.Color(51, 68, 255));

        jTextField1.setBackground(new java.awt.Color(50, 39, 84));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Computer Manufacturer Comparisson");
        jTextField1.setBorder(null);
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        HP.setBackground(new java.awt.Color(87, 59, 48));
        HP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HP.setForeground(new java.awt.Color(255, 255, 255));
        HP.setText("Watch HP info");
        HP.setBorderPainted(false);
        HP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HPActionPerformed(evt);
            }
        });

        Dell.setBackground(new java.awt.Color(87, 59, 48));
        Dell.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dell.setForeground(new java.awt.Color(255, 255, 255));
        Dell.setText("Watch Dell info");
        Dell.setBorderPainted(false);
        Dell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DellActionPerformed(evt);
            }
        });

        importTXT.setBackground(new java.awt.Color(87, 59, 48));
        importTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        importTXT.setForeground(new java.awt.Color(255, 255, 255));
        importTXT.setText("Import txt");
        importTXT.setBorderPainted(false);
        importTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importTXTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(220, 223, 219));
        jLabel1.setText("Made by Hurtado, José & Ruiz, Joseph ");

        fieldDaysMS.setText("1000");
        fieldDaysMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDaysMSActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Day in ms");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Days for Deadline (ms)");

        fieldDeadlineMS.setText("1000");
        fieldDeadlineMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDeadlineMSActionPerformed(evt);
            }
        });

        exportTXT.setBackground(new java.awt.Color(87, 59, 48));
        exportTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exportTXT.setForeground(new java.awt.Color(255, 255, 255));
        exportTXT.setText("Export txt");
        exportTXT.setBorderPainted(false);
        exportTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportTXTActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(69, 16, 57));
        start.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        start.setForeground(new java.awt.Color(255, 255, 255));
        start.setText("Initiate Simulation");
        start.setBorderPainted(false);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(HP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(importTXT)
                                .addGap(30, 30, 30)
                                .addComponent(exportTXT))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Dell, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fieldDaysMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fieldDeadlineMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldDaysMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldDeadlineMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Dell, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void HPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HPActionPerformed
        this.setVisible(false);
        if (hpWindow!=null && hp!=null) {
//            hpWindow=new HP(hp);
            hpWindow.initiateSimulation();
            hpWindow.setVisible(true);
        } else {
            System.out.println("errors");
        }
    }//GEN-LAST:event_HPActionPerformed

    private void DellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DellActionPerformed
        this.setVisible(false);
        if (dellWindow==null || dell==null) {
            //dellWindow=new DELL(dell);
            dellWindow.setVisible(true);
        } else {
            dellWindow.setVisible(true);
        }
    }//GEN-LAST:event_DellActionPerformed

    private void importTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importTXTActionPerformed

    private void fieldDeadlineMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDeadlineMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDeadlineMSActionPerformed

    private void exportTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportTXTActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        start.setVisible(false);
//        dell= new Company("Dell", dayMS,  workersDell, storageDELL, 15);
//        dell.hireEmployee(1, dayMS);
        hp= new Company("HP", dayMS, workersHP, storageHP, 12, hpWindow, dellWindow); 
        hp.hireSomeEmployees(0, dayMS);
       
    }//GEN-LAST:event_startActionPerformed

    private void fieldDaysMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDaysMSActionPerformed
        //dayMS=Integer.parseInt(fieldDaysMS.getText());
    }//GEN-LAST:event_fieldDaysMSActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dell;
    private javax.swing.JButton HP;
    private javax.swing.JButton exportTXT;
    private javax.swing.JTextField fieldDaysMS;
    private javax.swing.JTextField fieldDeadlineMS;
    private javax.swing.JButton importTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
