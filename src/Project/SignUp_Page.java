/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class SignUp_Page extends javax.swing.JFrame {

    /**
     * Creates new form SignUp_Page
     */
    public SignUp_Page() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PWD = new app.bolivia.swing.JCTextField();
        Email = new app.bolivia.swing.JCTextField();
        Username = new app.bolivia.swing.JCTextField();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        ID = new app.bolivia.swing.JCTextField();
        jLabel14 = new javax.swing.JLabel();
        Age = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Signup page");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jLabel4.setText("Username");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Forgot_Password_50px_4.png"))); // NOI18N
        jLabel8.setText("Password");

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secured_Letter_50px.png"))); // NOI18N
        jLabel10.setText("Email");

        PWD.setBackground(new java.awt.Color(102, 0, 102));
        PWD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        PWD.setPlaceholder("Enter password here");

        Email.setBackground(new java.awt.Color(102, 0, 102));
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Email.setPlaceholder("Enter Email here");

        Username.setBackground(new java.awt.Color(102, 0, 102));
        Username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Username.setPlaceholder("Enter Username here");

        rSButtonHover1.setBackground(new java.awt.Color(153, 0, 153));
        rSButtonHover1.setText("SignUp");
        rSButtonHover1.setColorHover(new java.awt.Color(153, 0, 153));
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        rSButtonHover2.setText("LogIn");
        rSButtonHover2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover2MouseClicked(evt);
            }
        });

        ID.setBackground(new java.awt.Color(102, 0, 102));
        ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ID.setPlaceholder("Enter ID here");

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel14.setText("ID");

        Age.setBackground(new java.awt.Color(102, 0, 102));
        Age.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        Age.setPlaceholder("Enter Age here");
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel16.setText("Age:");

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(262, 262, 262))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(348, 348, 348))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel11))
                        .addComponent(jLabel9)
                        .addComponent(jLabel7))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(3, 3, 3))
                                .addComponent(PWD, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PWD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(105, 105, 105))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 360, 760));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel2.setText("Welcome to our Library Management System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 480, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library-2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 640, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        if (!Username.getText().isEmpty() && !ID.getText().isEmpty()&& !PWD.getText().isEmpty() &&  !Email.getText().isEmpty() && !Age.getText().isEmpty()  ){
        
        String username = Username.getText();
        int id = parseInt(ID.getText());
        String password = PWD.getText();
        String email = Email.getText();
        int age = parseInt(Age.getText());
        Librarians lib = new Librarians();
        lib.setEmail(email);
       lib.connection("SELECT * FROM  LIBRARIANS  ");

        if (lib.validateEmail(email) ){
            if ( lib.isStrongPass(password)){
           lib.update("INSERT INTO LIBRARIANS VALUES(" + id + ",'" + username + "','" + email + "','" + password +"', "+ age + " , '0', "+ 0 + ")");
                  JOptionPane.showMessageDialog(this, "Signed Up!", "Success", JOptionPane.INFORMATION_MESSAGE);

            } else {
                    JOptionPane.showMessageDialog(this, "Password is not Strong enough", "Execution Alert", JOptionPane.ERROR_MESSAGE);}

        }
        else {
                JOptionPane.showMessageDialog(this, "Email is not valid", "Execution Alert", JOptionPane.ERROR_MESSAGE);}
        }
        else {JOptionPane.showMessageDialog(this, "Fill All Fields", "Execution Alert", JOptionPane.ERROR_MESSAGE);}

          
        
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void rSButtonHover2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover2MouseClicked
       SignIn_Page Frame = new SignIn_Page();
       Frame.setVisible(true);

    }//GEN-LAST:event_rSButtonHover2MouseClicked

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
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField Age;
    private app.bolivia.swing.JCTextField Email;
    private app.bolivia.swing.JCTextField ID;
    private app.bolivia.swing.JCTextField PWD;
    private app.bolivia.swing.JCTextField Username;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    // End of variables declaration//GEN-END:variables

}
