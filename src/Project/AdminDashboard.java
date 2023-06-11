package Project;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class AdminDashboard extends javax.swing.JFrame {

    Administrator admin ;
    public AdminDashboard() {
        initComponents();
      
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logout = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Display_Lib = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Manage_Stud = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Manage_Categories = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        Manage_book2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Manage_Lib = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Display_Stud1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Show_borr = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        stats = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Manage_book3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Manage_book4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        rSCalendar1 = new rojeru_san.componentes.RSCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_menu_48px_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrator Dashboard");

        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 997, Short.MAX_VALUE)
                .addComponent(close)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(close)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(153, 0, 102));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Exit_26px.png"))); // NOI18N
        jLabel4.setText("Logout");
        logout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel4.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 210, 40));

        jPanel6.setBackground(new java.awt.Color(153, 0, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_26px_2.png"))); // NOI18N
        jLabel5.setText("   Home ");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 50));
        jPanel6.getAccessibleContext().setAccessibleParent(jPanel4);

        Display_Lib.setBackground(new java.awt.Color(102, 0, 102));
        Display_Lib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_LibMouseClicked(evt);
            }
        });
        Display_Lib.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_View_Details_26px.png"))); // NOI18N
        jLabel9.setText(" Display Librarians");
        Display_Lib.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        jPanel4.add(Display_Lib, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 50));
        Display_Lib.getAccessibleContext().setAccessibleParent(jPanel4);

        Manage_Stud.setBackground(new java.awt.Color(102, 0, 102));
        Manage_Stud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Manage_StudMouseClicked(evt);
            }
        });
        Manage_Stud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Read_Online_26px.png"))); // NOI18N
        jLabel8.setText(" Manage Students");
        Manage_Stud.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jPanel4.add(Manage_Stud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 50));

        Manage_Categories.setBackground(new java.awt.Color(102, 0, 102));
        Manage_Categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Manage_CategoriesMouseClicked(evt);
            }
        });
        Manage_Categories.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(new java.awt.Color(204, 204, 204));
        label.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label.setForeground(new java.awt.Color(204, 204, 204));
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/category.png"))); // NOI18N
        label.setText(" Manage Categories");
        Manage_Categories.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        Manage_book2.setBackground(new java.awt.Color(102, 0, 102));
        Manage_book2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Manage_book2MouseClicked(evt);
            }
        });
        Manage_book2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Book_26px.png"))); // NOI18N
        jLabel15.setText(" Manage Books");
        Manage_book2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        Manage_Categories.add(Manage_book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        jPanel4.add(Manage_Categories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 50));

        Manage_Lib.setBackground(new java.awt.Color(102, 0, 102));
        Manage_Lib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Manage_LibMouseClicked(evt);
            }
        });
        Manage_Lib.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Conference_26px.png"))); // NOI18N
        jLabel11.setText(" Manage Librarians");
        Manage_Lib.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        jPanel4.add(Manage_Lib, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 50));

        Display_Stud1.setBackground(new java.awt.Color(102, 0, 102));
        Display_Stud1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_Stud1MouseClicked(evt);
            }
        });
        Display_Stud1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Conference_26px.png"))); // NOI18N
        jLabel12.setText(" Dispaly Students");
        Display_Stud1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jPanel4.add(Display_Stud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 210, 50));

        Show_borr.setBackground(new java.awt.Color(102, 0, 102));
        Show_borr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Show_borrMouseClicked(evt);
            }
        });
        Show_borr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Sell_26px.png"))); // NOI18N
        jLabel13.setText("Show Borrowing History");
        Show_borr.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jPanel4.add(Show_borr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 210, 50));

        stats.setBackground(new java.awt.Color(102, 0, 102));
        stats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statsMouseClicked(evt);
            }
        });
        stats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_View_Details_26px.png"))); // NOI18N
        jLabel14.setText(" Display Statistics");
        stats.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel4.add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 210, 50));

        Manage_book3.setBackground(new java.awt.Color(102, 0, 102));
        Manage_book3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Manage_book3MouseClicked(evt);
            }
        });
        Manage_book3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Book_26px.png"))); // NOI18N
        jLabel16.setText(" Manage Books");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        Manage_book3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        Manage_book4.setBackground(new java.awt.Color(102, 0, 102));
        Manage_book4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Manage_book4MouseClicked(evt);
            }
        });
        Manage_book4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Book_26px.png"))); // NOI18N
        jLabel17.setText(" Manage Books");
        Manage_book4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        Manage_book3.add(Manage_book4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        jPanel4.add(Manage_book3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(30, 1, 1, 1, new java.awt.Color(102, 0, 102)));

        rSCalendar1.setColorBackground(new java.awt.Color(102, 0, 102));
        rSCalendar1.setColorButtonHover(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(rSCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       System.exit(0); 
    }//GEN-LAST:event_closeMouseClicked

    private void Manage_LibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Manage_LibMouseClicked
        Manage_Librarians Frame = new Manage_Librarians() ;
        Frame.setVisible(true);
    }//GEN-LAST:event_Manage_LibMouseClicked

    private void Manage_StudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Manage_StudMouseClicked
        Manage_Student Frame = new Manage_Student();
        Frame.setVisible(true);
        
    }//GEN-LAST:event_Manage_StudMouseClicked

    private void Manage_CategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Manage_CategoriesMouseClicked
        Manage_Categories Frame = new Manage_Categories() ;
        Frame.setVisible(true);
    }//GEN-LAST:event_Manage_CategoriesMouseClicked

    private void Display_LibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Display_LibMouseClicked
        Display_Librarians Frame = new Display_Librarians() ;
        Frame.setVisible(true);
    }//GEN-LAST:event_Display_LibMouseClicked

    private void Display_Stud1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Display_Stud1MouseClicked
        Display_Students Frame = new Display_Students() ;
        Frame.setVisible(true);
    }//GEN-LAST:event_Display_Stud1MouseClicked

    private void Manage_book2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Manage_book2MouseClicked
            }//GEN-LAST:event_Manage_book2MouseClicked

    private void Manage_book4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Manage_book4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Manage_book4MouseClicked

    private void Manage_book3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Manage_book3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Manage_book3MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Manage_Books Frame = new Manage_Books() ;
        Frame.setVisible(true);    }//GEN-LAST:event_jLabel16MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked

                 SignIn_Page Frame = new SignIn_Page();
                 Frame.setVisible(true);
                 dispose();

    }//GEN-LAST:event_logoutMouseClicked

    private void Show_borrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Show_borrMouseClicked
        
        Show_History Frame = new Show_History() ;
        Frame.setVisible(true); 
        
        
    }//GEN-LAST:event_Show_borrMouseClicked

    private void statsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statsMouseClicked
       Statsistics Frame = new Statsistics() ;
        Frame.setVisible(true); 
    }//GEN-LAST:event_statsMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display_Lib;
    private javax.swing.JPanel Display_Stud1;
    private javax.swing.JPanel Manage_Categories;
    private javax.swing.JPanel Manage_Lib;
    private javax.swing.JPanel Manage_Stud;
    private javax.swing.JPanel Manage_book2;
    private javax.swing.JPanel Manage_book3;
    private javax.swing.JPanel Manage_book4;
    private javax.swing.JPanel Show_borr;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label;
    private javax.swing.JPanel logout;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private javax.swing.JPanel stats;
    // End of variables declaration//GEN-END:variables
}
