package project_280;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author انغام
 */
public class step5 extends javax.swing.JFrame {

    /**
     * Creates new form step5
     */
    public step5() {
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

        Levels = new javax.swing.ButtonGroup();
        back = new javax.swing.JLabel();
        click = new javax.swing.JLabel();
        reraly_never = new javax.swing.JRadioButton();
        Times1_3 = new javax.swing.JRadioButton();
        Times4_5 = new javax.swing.JRadioButton();
        Times6_7 = new javax.swing.JRadioButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 50));

        click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMouseClicked(evt);
            }
        });
        getContentPane().add(click, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 730, 130, 100));

        Levels.add(reraly_never);
        reraly_never.setSelected(true);
        getContentPane().add(reraly_never, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        Levels.add(Times1_3);
        getContentPane().add(Times1_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        Levels.add(Times4_5);
        getContentPane().add(Times4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        Levels.add(Times6_7);
        getContentPane().add(Times6_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen5.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new step4().setVisible(true);
        this.dispose();


    }//GEN-LAST:event_backMouseClicked

    private void clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseClicked
        new step6().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clickMouseClicked

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
            java.util.logging.Logger.getLogger(step5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(step5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(step5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(step5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new step5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Levels;
    public static javax.swing.JRadioButton Times1_3;
    public static javax.swing.JRadioButton Times4_5;
    public static javax.swing.JRadioButton Times6_7;
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel click;
    public static javax.swing.JRadioButton reraly_never;
    // End of variables declaration//GEN-END:variables

}