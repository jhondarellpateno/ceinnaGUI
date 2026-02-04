/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import config.config;

/**
 *
 * @author jhond
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
    public Users(String names, String emails, String types) {
        initComponents();
        user.setText(names);
        email.setText(emails);
        type.setText(types);
        dbut();
    }

    private Users() {
         initComponents();
    }

    void dbut(){
        config conf = new config ();
        String sql = "SELECT * FROM account";
        conf.displayData(sql, jTable1);
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Dashboard = new javax.swing.JLabel();
        Orders = new javax.swing.JLabel();
        Products = new javax.swing.JLabel();
        Users = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        Dashboard4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard.setText("Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        jPanel2.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 188, -1));

        Orders.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Orders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Orders.setText("Orders");
        jPanel2.add(Orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 188, -1));

        Products.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Products.setText("Products");
        jPanel2.add(Products, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 188, -1));

        Users.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Users.setText("Users");
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersMouseClicked(evt);
            }
        });
        jPanel2.add(Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 270, 188, -1));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 350, 188, -1));

        user.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("USER");
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 168, -1));

        type.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type.setText("type");
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 168, -1));

        email.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("email");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 168, -1));

        Dashboard4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Dashboard4.setForeground(new java.awt.Color(0, 102, 204));
        Dashboard4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dashboard4.setText("------------------------------------------");
        jPanel2.add(Dashboard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 420));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setText("Twist & Tangle");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jLabel2.setText("\"Made With Love\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Users");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 380, 190));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/logo-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseClicked

    }//GEN-LAST:event_UsersMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        landing logout = new landing();
        logout.setLocationRelativeTo(null);
        logout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked

    }//GEN-LAST:event_DashboardMouseClicked

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Dashboard4;
    private javax.swing.JLabel Orders;
    private javax.swing.JLabel Products;
    private javax.swing.JLabel Users;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel type;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
