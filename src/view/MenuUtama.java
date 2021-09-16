/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import panelForm.AddCar;
import panelForm.AddUser;
import panelForm.RentAdmin;
import panelForm.Info;
import panelForm.AdminReturn;
/**
 *
 * @author lenovo
 */
public class MenuUtama extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    Info fo;
    RentAdmin RA;
    AddCar add;
    AddUser user;
    AdminReturn Ar;
    GridBagConstraints c = new GridBagConstraints();

   
    public MenuUtama(){
       initComponents();
       fo = new Info();
       add = new AddCar();
       user = new AddUser();
       RA = new RentAdmin(); 
       Ar = new AdminReturn(); 
       LblShow.setLayout(layout);
       c.gridx = 0;
       c.gridy = 0;
        
        LblShow.add(RA,c);
        LblShow.add(fo,c);
        LblShow.add(add,c);
        LblShow.add(user,c);
        LblShow.add(Ar,c);
        Ar.setVisible(false);
        user.setVisible(false);
        add.setVisible(false);
        RA.setVisible(false);
        fo.setVisible(false);
        this.setLocationRelativeTo(null);
        getAccessFrame();
       //peminjam.setVisible(false);
    }  
    
    
 public JFrame getAccessFrame(){
        return this;
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnrent = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        Show = new javax.swing.JPanel();
        LblShow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1230, 680));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrent.setBackground(new java.awt.Color(0, 0, 0));
        btnrent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrent.setForeground(new java.awt.Color(255, 255, 255));
        btnrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rentcar.png"))); // NOI18N
        btnrent.setText("Rent Car");
        btnrent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrentActionPerformed(evt);
            }
        });
        jPanel1.add(btnrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/returncar.png"))); // NOI18N
        jButton2.setText("Return Car");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 70));

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnadd.setText("Add Car");
        btnadd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, 70));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adduser.png"))); // NOI18N
        jButton4.setText("Add User");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 70));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info.png"))); // NOI18N
        jButton5.setText("About");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 70));

        btnLog.setBackground(new java.awt.Color(0, 0, 0));
        btnLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        btnLog.setText("Logout");
        btnLog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel1.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 140, 70));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout2.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, 720));

        Show.setBackground(new java.awt.Color(51, 51, 51));
        Show.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgRental2.jpg"))); // NOI18N
        Show.add(LblShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        getContentPane().add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 1040, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgRental2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1300, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
            new Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrentActionPerformed
        // TODO add your handling code here:        
        RA.setVisible(true);
        fo.setVisible(false);
        user.setVisible(false);
        add.setVisible(false);
        Ar.setVisible(false);
        LblShow.add(RA,c);
    
    }//GEN-LAST:event_btnrentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RA.setVisible(false);
        fo.setVisible(false);
        user.setVisible(false);
        add.setVisible(false); 
        Ar.setVisible(true);
        LblShow.add(Ar,c);        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        
        add.setVisible(true);
        user.setVisible(false);
        RA.setVisible(false);
        fo.setVisible(false);
        Ar.setVisible(false);
        LblShow.add(add,c);
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        user.setVisible(true);
        add.setVisible(false);
        RA.setVisible(false);
        fo.setVisible(false);
        Ar.setVisible(false);
        LblShow.add(user,c);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        fo.setVisible(true);
        LblShow.add(fo,c);
        user.setVisible(false);
        add.setVisible(false);
        RA.setVisible(false);
        Ar.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LblShow;
    private javax.swing.JPanel Show;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnrent;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
