/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalizacija;

import static Personalizacija.Bolnica.patientList;
import static Personalizacija.Bolnica.doctorList;

/**
 *
 * @author Ivan
 */
public class UpisPacijenata extends javax.swing.JFrame {

    Pacijent p=new Pacijent(null, "", "", "");
    public UpisPacijenata() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        srdjan = new javax.swing.JCheckBox();
        gruja = new javax.swing.JCheckBox();
        house = new javax.swing.JCheckBox();
        imeP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prezimeP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JMBGp = new javax.swing.JTextField();
        potvrdiP = new javax.swing.JButton();
        box = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        srdjan.setText("Dr. Srdjan Cvetkovic");
        srdjan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srdjanActionPerformed(evt);
            }
        });

        gruja.setText("Dr. Gruja");

        house.setText("Dr. Gregory House");
        house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imePActionPerformed(evt);
            }
        });

        jLabel1.setText("Prijem pacijenta");

        jLabel2.setText("Ime");

        jLabel3.setText("Prezime");

        jLabel4.setText("Izabrani lekar");

        jLabel5.setText("JMBG");

        potvrdiP.setText("Potvrdi");
        potvrdiP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrdiPActionPerformed(evt);
            }
        });

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gregory House", "Gruja Petrovic", "Srdjan Cvetkovic" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(imeP, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(prezimeP)
                                .addComponent(jLabel5))
                            .addComponent(JMBGp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potvrdiP)
                            .addComponent(jLabel4)
                            .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(193, 249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prezimeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JMBGp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(potvrdiP)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imePActionPerformed
        p.setIme(imeP.getText());
    }//GEN-LAST:event_imePActionPerformed

    private void potvrdiPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrdiPActionPerformed
                p.setIme(imeP.getText());
                p.setPrezime(prezimeP.getText());
                p.setJMBG(JMBGp.getText());
          
                p.setMyDoctor(Bolnica.vratiDoktoraNaOsnovuImena(box.getSelectedItem().toString()));
                
              
                System.out.println(p);
                Bolnica.patientList.add(p);
//              System.out.println("Ime pacijenta: "+ p.getIme());
//              System.out.println("Prezime pacijenta: "+ p.getPrezime());
//              System.out.println("Izabrani lekar: " + p.getMyDoctor().getIme());
//              System.out.println("JMBG: " + p.getJMBG());
//               System.out.println(patientList);
    }//GEN-LAST:event_potvrdiPActionPerformed

    private void houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActionPerformed

    private void srdjanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srdjanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srdjanActionPerformed

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
            java.util.logging.Logger.getLogger(UpisPacijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpisPacijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpisPacijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpisPacijenata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpisPacijenata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JMBGp;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JCheckBox gruja;
    private javax.swing.JCheckBox house;
    private javax.swing.JTextField imeP;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton potvrdiP;
    private javax.swing.JTextField prezimeP;
    private javax.swing.JCheckBox srdjan;
    // End of variables declaration//GEN-END:variables
}
