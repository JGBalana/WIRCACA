/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfileManagementSystem;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import java.awt.RenderingHints;
/**
 *
 * @author geral
 */
public class sigin extends javax.swing.JFrame {

    /**
     * Creates new form sigin
     */
    public sigin() {
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
        jPanel2 = new javax.swing.JPanel()
        {//meron oh
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Calculate the center position of the panel
                int centerX = getWidth() / 2 ;
                int centerY = (int) (getHeight() / 3.5); // Casting to double before division

                // Calculate the diagonal distance from the center to the corner
                double diagonalLength = Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));

                // Adjust the start and end colors here
                Color color1 = Color.decode("#7B1514"); // Example start color
                Color color2 = Color.decode("#FFFFFF"); // Example end color

                // Calculate the start and end positions for the gradient based on the center
                GradientPaint gradient = new GradientPaint(
                    centerX, centerY, color1, // Start position and color
                    (float) (centerX + diagonalLength / 2), (float) (centerY + diagonalLength / 2), color2); // End position and color

                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight()); // Fill the entire panel with gradient
            }

        }
        ;
        hide1 = new javax.swing.JLabel();
        open1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SIbutton = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField()
        ;
        Password1 = new javax.swing.JPasswordField()
        ;
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(127, 21, 20));
        jPanel2.setLayout(null);

        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/hide.png"))); // NOI18N
        hide1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hide1MouseReleased(evt);
            }
        });
        jPanel2.add(hide1);
        hide1.setBounds(480, 390, 40, 30);

        open1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/openn.png"))); // NOI18N
        open1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                open1MousePressed(evt);
            }
        });
        jPanel2.add(open1);
        open1.setBounds(480, 390, 40, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 233, 208));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 350, 130, 28);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 233, 208));
        jLabel7.setText("Username");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 240, 190, 20);

        SIbutton.setBackground(new java.awt.Color(0, 0, 0));
        SIbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SIbutton.setForeground(new java.awt.Color(255, 255, 255));
        SIbutton.setText("Sign In");
        SIbutton.setBorder(null);
        SIbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SIbuttonMouseClicked(evt);
            }
        });
        jPanel2.add(SIbutton);
        SIbutton.setBounds(60, 560, 470, 50);

        jTextField4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel2.add(jTextField4);
        jTextField4.setBounds(60, 270, 470, 50);

        Password1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jPanel2.add(Password1);
        Password1.setBounds(60, 380, 470, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/UPH Header -2 (1).png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(70, 30, 470, 150);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No student account yet?");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(150, 620, 230, 20);

        signup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(123, 21, 20));
        signup.setText("Sign Up");
        signup.setBorder(null);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        jPanel2.add(signup);
        signup.setBounds(370, 620, 79, 20);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 590, 680));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/STUDENT-PROFILE MANAGEMENT SYSTEM DESIGN.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 2090, 1120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
        open1.setVisible(true);
        hide1.setVisible(false);
        Password1.setEchoChar((char)0);
    }//GEN-LAST:event_hide1MousePressed

    private void hide1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MouseReleased
        open1.setVisible(false);
        hide1.setVisible(true);
        Password1.setEchoChar('*');
    }//GEN-LAST:event_hide1MouseReleased

    private void open1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open1MousePressed

    }//GEN-LAST:event_open1MousePressed

    private void SIbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SIbuttonMouseClicked
    Homepagee x = new Homepagee();
    x.setVisible (true);
    this.dispose();
    }//GEN-LAST:event_SIbuttonMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
    Signup x = new Signup();
    x.setVisible (true);
    this.dispose();
    }//GEN-LAST:event_signupMouseClicked
        
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
            java.util.logging.Logger.getLogger(sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sigin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password1;
    private javax.swing.JButton SIbutton;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel open1;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
       private void setGradientColor(javax.swing.JPanel panel, String hexColor1, String hexColor2) {
    Color color1 = Color.decode(hexColor1);
    Color color2 = Color.decode(hexColor2);
   
    // Override the JPanel's paintComponent method to draw the gradient
    panel = new javax.swing.JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
           
            // Calculate the center position of the panel
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
           
            // Calculate the diagonal distance from the center to the corner
            double diagonalLength = Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
           
            // Calculate the start and end positions for the gradient based on the center
            GradientPaint gradient = new GradientPaint(
                    centerX, centerY, color1, // Start position and color
                    (float) (centerX + diagonalLength / 2), (float) (centerY + diagonalLength / 2), color2); // End position and color
           
            Graphics2D g2d = (Graphics2D) g;
            g2d.setPaint(gradient);
            g2d.fillRect(0, 0, getWidth(), getHeight()); // Fill the entire panel with gradient
        }
    };
 }
}

