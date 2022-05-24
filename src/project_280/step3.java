package project_280;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author انغام
 */
public class step3 extends javax.swing.JFrame {

    /**
     * Creates new form step3
     */
    public step3() {
        initComponents();
        hint.setVisible(false);
        Invalid.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tall = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        front = new javax.swing.JLabel();
        Invalid = new javax.swing.JLabel();
        hint = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tall, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, 50));

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 40));

        front.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frontMouseClicked(evt);
            }
        });
        getContentPane().add(front, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 730, 140, 90));

        Invalid.setForeground(new java.awt.Color(255, 51, 51));
        Invalid.setText("invalid entry");
        getContentPane().add(Invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        hint.setForeground(new java.awt.Color(255, 51, 51));
        hint.setText("Hint :must be 3 digit");
        getContentPane().add(hint, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen3.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new step2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void frontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frontMouseClicked
        if (tall.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill the field.");
        } else if (!tall.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Wrong! It must be Digits");
        } else if (tall.getText().length() < 3 || tall.getText().length() > 3) {
            hint.setVisible(true);
            Invalid.setVisible(true);
        } else {
            new step4().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_frontMouseClicked

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
            java.util.logging.Logger.getLogger(step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(step3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new step3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Invalid;
    private javax.swing.JLabel back;
    private javax.swing.JLabel front;
    private javax.swing.JLabel hint;
    private javax.swing.JLabel pic;
    public static javax.swing.JTextField tall;
    // End of variables declaration//GEN-END:variables
}