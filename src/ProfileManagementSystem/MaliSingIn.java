package ProfileManagementSystem;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.RenderingHints;


public class MaliSingIn extends javax.swing.JFrame {

    public MaliSingIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(15, 15);
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Draw the rounded opaque panel with borders.
                graphics.setColor(getBackground());
                // Fill the rounded rectangle to cover the entire panel
                graphics.fillRoundRect(0, 0, width, height, arcs.width, arcs.height);
                graphics.setColor(getForeground());
                graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); // Paint border
            }
        };
        hide = new javax.swing.JLabel();
        open = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField()
        ;
        Password = new javax.swing.JPasswordField()
        ;
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student-Profile Management System");
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBounds(10, 10, 100, 30);
        jPanel1.setOpaque(false);
        jPanel1.setBackground(new java.awt.Color(127, 21, 20));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/hide.png"))); // NOI18N
        hide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel1.add(hide);
        hide.setBounds(290, 390, 40, 30);

        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/openn.png"))); // NOI18N
        open.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                openFocusLost(evt);
            }
        });
        open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openMousePressed(evt);
            }
        });
        jPanel1.add(open);
        open.setBounds(370, 390, 40, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 233, 208));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 350, 130, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 233, 208));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 240, 190, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign In");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 530, 470, 50);

        jTextField3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(60, 270, 470, 50);

        Password.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Password);
        Password.setBounds(60, 380, 470, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/UPH Header -2 (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 30, 470, 150);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("No student account yet?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 590, 230, 20);

        jButton2.setForeground(new java.awt.Color(123, 21, 20));
        jButton2.setText("Sign Up");
        jButton2.setBorder(null);
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 590, 79, 17);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 590, 680));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagementSystem/STUDENT-PROFILE MANAGEMENT SYSTEM DESIGN.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 2090, 1120));

        setSize(new java.awt.Dimension(1518, 947));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMousePressed
    
    }//GEN-LAST:event_openMousePressed

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        open.setVisible(true);
        hide.setVisible(false);
        Password.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        open.setVisible(false);
        hide.setVisible(true);
        Password.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void openFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_openFocusLost
    open.setVisible(false);
    }//GEN-LAST:event_openFocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaliSingIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel open;
    // End of variables declaration//GEN-END:variables
}
