
package hospitalmanagement;

public class MainForm extends javax.swing.JFrame {

   
    public MainForm() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainDesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        PnStatusbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblServer = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        lblDatabase = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        lblSysdate = new javax.swing.JLabel();
        MyDeskTop = new javax.swing.JDesktopPane();
        TopMenubar = new javax.swing.JMenuBar();
        JmenuLogout = new javax.swing.JMenu();
        JmenuFile = new javax.swing.JMenu();
        JmImport = new javax.swing.JMenuItem();
        JmPrintsetup = new javax.swing.JMenuItem();
        JmExit = new javax.swing.JMenuItem();
        JmenuFuction = new javax.swing.JMenu();
        JmNew = new javax.swing.JMenuItem();
        JmDelete = new javax.swing.JMenuItem();
        JmReverse = new javax.swing.JMenuItem();
        JmRefresh = new javax.swing.JMenuItem();
        JmSearch = new javax.swing.JMenuItem();
        JmPrint = new javax.swing.JMenuItem();
        JmenuAdmin = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        JmenuTool = new javax.swing.JMenu();
        JmenuWindow = new javax.swing.JMenu();
        JmChangePwd = new javax.swing.JMenuItem();
        JmUsersetup = new javax.swing.JMenuItem();
        JmPermission = new javax.swing.JMenuItem();
        JmenuHelp = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        JmCloseall = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Management");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        MainDesktop.setBackground(new java.awt.Color(204, 204, 204));
        MainDesktop.setLayout(new java.awt.BorderLayout());

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PnStatusbar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Server:");
        PnStatusbar.add(jLabel1);

        lblServer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblServer.setText("                              ");
        lblServer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PnStatusbar.add(lblServer);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("Database:");
        PnStatusbar.add(jLabel54);

        lblDatabase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDatabase.setText("                                ");
        lblDatabase.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PnStatusbar.add(lblDatabase);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("   User:  ");
        PnStatusbar.add(jLabel56);

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUser.setText("                                  ");
        lblUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PnStatusbar.add(lblUser);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText("System Date:");
        PnStatusbar.add(jLabel58);

        lblSysdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSysdate.setText("                                   ");
        lblSysdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PnStatusbar.add(lblSysdate);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(PnStatusbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(PnStatusbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainDesktop.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        MyDeskTop.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout MyDeskTopLayout = new javax.swing.GroupLayout(MyDeskTop);
        MyDeskTop.setLayout(MyDeskTopLayout);
        MyDeskTopLayout.setHorizontalGroup(
            MyDeskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        MyDeskTopLayout.setVerticalGroup(
            MyDeskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        MainDesktop.add(MyDeskTop, java.awt.BorderLayout.CENTER);

        getContentPane().add(MainDesktop, java.awt.BorderLayout.CENTER);

        TopMenubar.setForeground(new java.awt.Color(102, 102, 102));
        TopMenubar.setFocusable(false);
        TopMenubar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        JmenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/key-16.png"))); // NOI18N
        TopMenubar.add(JmenuLogout);

        JmenuFile.setText("File");
        JmenuFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JmImport.setText("Import Data");
        JmenuFile.add(JmImport);

        JmPrintsetup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/printer.png"))); // NOI18N
        JmPrintsetup.setText("Print Setup");
        JmenuFile.add(JmPrintsetup);

        JmExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagement/Exit1.png"))); // NOI18N
        JmExit.setText("Exit");
        JmenuFile.add(JmExit);

        TopMenubar.add(JmenuFile);

        JmenuFuction.setBorder(null);
        JmenuFuction.setText("Function");
        JmenuFuction.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JmNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        JmNew.setText("   New   ");
        JmenuFuction.add(JmNew);

        JmDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JmDelete.setText("   Delete   ");
        JmenuFuction.add(JmDelete);

        JmReverse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        JmReverse.setText("   Reverse");
        JmenuFuction.add(JmReverse);

        JmRefresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JmRefresh.setText("   Refresh");
        JmenuFuction.add(JmRefresh);

        JmSearch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        JmSearch.setText("   Search");
        JmenuFuction.add(JmSearch);

        JmPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        JmPrint.setText("   Print");
        JmenuFuction.add(JmPrint);

        TopMenubar.add(JmenuFuction);

        JmenuAdmin.setText("View");
        JmenuAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("ToolBar");
        JmenuAdmin.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Status Bar");
        JmenuAdmin.add(jCheckBoxMenuItem2);

        TopMenubar.add(JmenuAdmin);

        JmenuTool.setText("Booking");
        JmenuTool.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TopMenubar.add(JmenuTool);

        JmenuWindow.setText("Tool");
        JmenuWindow.setBorderPainted(true);
        JmenuWindow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        JmChangePwd.setBackground(new java.awt.Color(0, 0, 0));
        JmChangePwd.setText("   Change Password");
        JmChangePwd.setRolloverEnabled(true);
        JmChangePwd.setSelected(true);
        JmChangePwd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JmChangePwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmChangePwdActionPerformed(evt);
            }
        });
        JmenuWindow.add(JmChangePwd);

        JmUsersetup.setText("   User Setup");
        JmenuWindow.add(JmUsersetup);

        JmPermission.setText("   Permission Setup");
        JmenuWindow.add(JmPermission);

        TopMenubar.add(JmenuWindow);

        JmenuHelp.setText("Report");
        JmenuHelp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TopMenubar.add(JmenuHelp);

        jMenu1.setText("Window");

        JmCloseall.setText("   Close All");
        JmCloseall.setSelected(true);
        jMenu1.add(JmCloseall);

        TopMenubar.add(jMenu1);

        jMenu2.setText("About");
        TopMenubar.add(jMenu2);

        jMenu3.setText("Help");
        TopMenubar.add(jMenu3);

        setJMenuBar(TopMenubar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MainForm.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setUndecorated(true);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      FrmPartient emp=new FrmPartient();
      MyDeskTop.add(emp);
      emp.setVisible(true);
      emp.moveToFront();
      emp.show();
      
      
    }//GEN-LAST:event_jButton1MouseClicked

    private void JmChangePwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmChangePwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmChangePwdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JmChangePwd;
    private javax.swing.JMenuItem JmCloseall;
    private javax.swing.JMenuItem JmDelete;
    private javax.swing.JMenuItem JmExit;
    private javax.swing.JMenuItem JmImport;
    private javax.swing.JMenuItem JmNew;
    private javax.swing.JMenuItem JmPermission;
    private javax.swing.JMenuItem JmPrint;
    private javax.swing.JMenuItem JmPrintsetup;
    private javax.swing.JMenuItem JmRefresh;
    private javax.swing.JMenuItem JmReverse;
    private javax.swing.JMenuItem JmSearch;
    private javax.swing.JMenuItem JmUsersetup;
    private javax.swing.JMenu JmenuAdmin;
    private javax.swing.JMenu JmenuFile;
    private javax.swing.JMenu JmenuFuction;
    private javax.swing.JMenu JmenuHelp;
    private javax.swing.JMenu JmenuLogout;
    private javax.swing.JMenu JmenuTool;
    private javax.swing.JMenu JmenuWindow;
    private javax.swing.JDesktopPane MainDesktop;
    private javax.swing.JDesktopPane MyDeskTop;
    private javax.swing.JPanel PnStatusbar;
    private javax.swing.JMenuBar TopMenubar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblServer;
    private javax.swing.JLabel lblSysdate;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
