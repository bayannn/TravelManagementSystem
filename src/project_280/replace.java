package project_280;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bayan
 */
public class replace extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public replace() {
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

        back = new javax.swing.JLabel();
        repalce1 = new javax.swing.JRadioButton();
        repalce2 = new javax.swing.JRadioButton();
        repalce3 = new javax.swing.JRadioButton();
        profile = new javax.swing.JLabel();
        prog = new javax.swing.JLabel();
        meal = new javax.swing.JLabel();
        Workouts = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 80));

        repalce1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repalce1MouseClicked(evt);
            }
        });
        getContentPane().add(repalce1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        repalce2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repalce2MouseClicked(evt);
            }
        });
        getContentPane().add(repalce2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        repalce3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repalce3MouseClicked(evt);
            }
        });
        getContentPane().add(repalce3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, -1, -1));

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 816, 30, 30));

        prog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progMouseClicked(evt);
            }
        });
        getContentPane().add(prog, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 810, 50, 40));

        meal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mealMouseClicked(evt);
            }
        });
        getContentPane().add(meal, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 810, 40, 50));

        Workouts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkoutsMouseClicked(evt);
            }
        });
        getContentPane().add(Workouts, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 810, 30, 30));

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, 40, 50));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen_ReplaceWorkout.png"))); // NOI18N
        pic.setText("jLabel1");
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void repalce1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repalce1MouseClicked
        if (repalce1.isSelected()) {
            JOptionPane.showMessageDialog(null, "Workout has been replaced");
        }
    }//GEN-LAST:event_repalce1MouseClicked

    private void repalce2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repalce2MouseClicked
        if (repalce2.isSelected()) {
            JOptionPane.showMessageDialog(null, "Workout has been replaced");
        }
    }//GEN-LAST:event_repalce2MouseClicked

    private void repalce3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repalce3MouseClicked
        if (repalce3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Workout has been replaced");
        }
    }//GEN-LAST:event_repalce3MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new workouts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void progMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progMouseClicked
        new prograss().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_progMouseClicked

    private void mealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealMouseClicked
        new meals().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mealMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void WorkoutsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkoutsMouseClicked
        new workouts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WorkoutsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new replace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Workouts;
    private javax.swing.JLabel back;
    private javax.swing.JLabel home;
    private javax.swing.JLabel meal;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel prog;
    private javax.swing.JRadioButton repalce1;
    private javax.swing.JRadioButton repalce2;
    private javax.swing.JRadioButton repalce3;
    // End of variables declaration//GEN-END:variables
}