package project_280;

/**
 * @author Galawi
 */

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public signUp() {
        initComponents();
        good.setVisible(false);
        Strong.setVisible(false);
        week.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agree = new java.awt.Checkbox();
        front = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        week = new javax.swing.JLabel();
        good = new javax.swing.JLabel();
        Strong = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agree.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 20, -1));

        front.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frontMouseClicked(evt);
            }
        });
        getContentPane().add(front, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 720, 130, 120));

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 70));

        Password.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                PasswordCaretUpdate(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 180, 30));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 180, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 180, -1));

        week.setForeground(new java.awt.Color(204, 0, 0));
        week.setText(" week");
        week.setToolTipText("");
        week.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(week, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 50, -1));

        good.setForeground(new java.awt.Color(255, 204, 51));
        good.setText("good");
        good.setToolTipText("");
        getContentPane().add(good, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 40, -1));

        Strong.setForeground(new java.awt.Color(51, 204, 0));
        Strong.setText("Strong");
        Strong.setToolTipText("");
        getContentPane().add(Strong, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 50, -1));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen_Login_1.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frontMouseClicked
        String em = email.getText();
        if (em.isEmpty() || Password.getText().isEmpty() || name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        } else if (isValid(em) == false) {
            JOptionPane.showMessageDialog(this, "InValid Email try anothr one");
        } else if (Password.getText().length() < 5) {
            JOptionPane.showMessageDialog(this, "Wrong password it must be at least 5 digit");
        } else if (Agree.getState() == false) {
            JOptionPane.showMessageDialog(this, "Please Agree");
        } else {
            welcome.here = "signUp";
            new step1().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_frontMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void PasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_PasswordCaretUpdate
        if (Password.getText().length() <= 3) {
            week.setVisible(true);
            good.setVisible(false);
            Strong.setVisible(false);
        }
        if (Password.getText().length() > 3 && Password.getText().length() <= 8) {
            good.setVisible(true);
            week.setVisible(false);
            Strong.setVisible(false);

        }
        if (Password.getText().length() > 8) {
            Strong.setVisible(true);
            week.setVisible(false);
            good.setVisible(false);

        }
    }//GEN-LAST:event_PasswordCaretUpdate
    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox Agree;
    public static javax.swing.JPasswordField Password;
    private javax.swing.JLabel Strong;
    private javax.swing.JLabel back;
    public static javax.swing.JTextField email;
    private javax.swing.JLabel front;
    private javax.swing.JLabel good;
    public static javax.swing.JTextField name;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel week;
    // End of variables declaration//GEN-END:variables
}