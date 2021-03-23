/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import sn.isi.dao.DB;
import sn.isi.entities.Client;


/**
 *
 * @author Malick di
 */
public class Acceuil extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil
     */


    public Acceuil() {
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

        jPanel1 = new javax.swing.JPanel();
        panel_acceuil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCreation = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_rech = new javax.swing.JButton();
        btn_list = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 0));

        panel_acceuil.setBackground(new java.awt.Color(153, 153, 0));
        panel_acceuil.setForeground(new java.awt.Color(153, 153, 0));
        panel_acceuil.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENUE !!!");

        btnCreation.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnCreation.setForeground(new java.awt.Color(153, 153, 0));
        btnCreation.setText("Creation");
        btnCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreationActionPerformed(evt);
            }
        });

        btn_edit.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(153, 153, 0));
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_rech.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btn_rech.setForeground(new java.awt.Color(153, 153, 0));
        btn_rech.setText("Rechercher");
        btn_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechActionPerformed(evt);
            }
        });

        btn_list.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btn_list.setForeground(new java.awt.Color(102, 102, 0));
        btn_list.setText("Liste Client");
        btn_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_acceuilLayout = new javax.swing.GroupLayout(panel_acceuil);
        panel_acceuil.setLayout(panel_acceuilLayout);
        panel_acceuilLayout.setHorizontalGroup(
            panel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_acceuilLayout.createSequentialGroup()
                .addGroup(panel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_acceuilLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnCreation))
                    .addGroup(panel_acceuilLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btn_edit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_acceuilLayout.createSequentialGroup()
                        .addComponent(btn_list)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_acceuilLayout.createSequentialGroup()
                        .addComponent(btn_rech)
                        .addGap(124, 124, 124))))
            .addGroup(panel_acceuilLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        panel_acceuilLayout.setVerticalGroup(
            panel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_acceuilLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(panel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreation)
                    .addComponent(btn_list))
                .addGap(49, 49, 49)
                .addGroup(panel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_rech)
                    .addComponent(btn_edit))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechActionPerformed
        // TODO add your handling code here:
        Recherche rech = new Recherche();
        rech.setVisible(true);
            dispose();
    }//GEN-LAST:event_btn_rechActionPerformed

    private void btnCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreationActionPerformed
        // TODO add your handling code here:
     Creation_Client frame = new Creation_Client();
     frame.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnCreationActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        Edit edit = new Edit();
        edit.setVisible(true);
            dispose();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listActionPerformed
        // TODO add your handling code here:
        Liste_Client_1 listcli = new Liste_Client_1();
        listcli.setVisible(true);
            dispose();
            

  
    

        
    }//GEN-LAST:event_btn_listActionPerformed

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
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(Acceuil.class.gebtn_creation.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreation;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_list;
    private javax.swing.JButton btn_rech;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_acceuil;
    // End of variables declaration//GEN-END:variables

 
}
