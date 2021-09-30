/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author son
 */
public class MainForm extends javax.swing.JFrame {

    private QuanLySinhVienPanel mStudentPanel;
    private QuanLyDiemPanel mGPAPanel;
    private ChuyenNganhPanel mChuyenNganhPanel;
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);//hien thi giua man hinh
        
        //setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH );//phong to main foem     
        LoginDialog dialog = new LoginDialog(this, true);//hien thi dang nhap
        dialog.setVisible(true);//hien thi dang nhap
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tbrLogout = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnQLSV = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnQLD = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnCN = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnexit = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương  Trình Quản Lý Sinh Viên");
        setBackground(new java.awt.Color(203, 243, 248));

        jToolBar1.setBackground(new java.awt.Color(204, 255, 244));
        jToolBar1.setForeground(new java.awt.Color(251, 220, 246));
        jToolBar1.setRollover(true);

        tbrLogout.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/logout-icon-48.png"))); // NOI18N
        tbrLogout.setText("Đăng Xuất");
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator2);

        btnQLSV.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Users.png"))); // NOI18N
        btnQLSV.setText("Quản Lý Thông Tin Sinh Viên");
        btnQLSV.setFocusable(false);
        btnQLSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSV);
        jToolBar1.add(jSeparator1);

        btnQLD.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnQLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Statistics.png"))); // NOI18N
        btnQLD.setText("Quản Lý Điểm Sinh viên");
        btnQLD.setFocusable(false);
        btnQLD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLD);
        jToolBar1.add(jSeparator3);

        btnCN.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Tasklist.png"))); // NOI18N
        btnCN.setText("Các Chuyên Ngành Học");
        btnCN.setFocusable(false);
        btnCN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCNActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCN);
        jToolBar1.add(jSeparator4);

        btnexit.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Exit.png"))); // NOI18N
        btnexit.setText("Thoát Chương Trình");
        btnexit.setFocusable(false);
        btnexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnexit);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/anh nen.png"))); // NOI18N
        tplMainBoard.addTab("", jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 1379, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 788, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//chọn quản lý điểm
    
    private void btnQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDActionPerformed
        if(mGPAPanel == null){
            try {
                mGPAPanel  =  new QuanLyDiemPanel();
            } catch (Exception ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon icon = new ImageIcon(getClass().getResource("/anh/Statistics.png"));//truyen du lieu hinh anh 
            tplMainBoard.addTab("Quản Lý Điểm Sinh Viên", icon,mGPAPanel,"Quản Lý Điểm Sinh Viên");//thwm phuong thuc tab va ten
        }
        
        tplMainBoard.setSelectedComponent(mGPAPanel);
    }//GEN-LAST:event_btnQLDActionPerformed
//chọn quản lý sinh viên
    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        if(mStudentPanel == null){  //neu mStudentPanel == null
            mStudentPanel = new QuanLySinhVienPanel();//tao ra doi tuong mStudentPanel
            ImageIcon icon = new ImageIcon(getClass().getResource("/anh/Users.png"));//truyen du lieu hinh anh 
            tplMainBoard.addTab("Quản Lý Dữ Liệu Sinh Viên ", icon,mStudentPanel,"Quản Lý Dữ Liệu Sinh Viên");//thwm phuong thuc tab va ten
        }
              
        tplMainBoard.setSelectedComponent(mStudentPanel);//hien thi tab ra man hinh
        
    }//GEN-LAST:event_btnQLSVActionPerformed
//chọn đăng xuất
    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed
        LoginDialog loginDialog = new LoginDialog(this, true);    
        loginDialog.setVisible(true); //neu nhap dung mk thi ms vao dc main      
    }//GEN-LAST:event_tbrLogoutActionPerformed
//con chuyên ngành
    private void btnCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCNActionPerformed
        if(mChuyenNganhPanel == null){  //neu mStudentPanel == null
            mChuyenNganhPanel = new ChuyenNganhPanel();//tao ra doi tuong mStudentPanel
            ImageIcon icon = new ImageIcon(getClass().getResource("/anh/Tasklist.png"));//truyen du lieu hinh anh 
            tplMainBoard.addTab("Chuyên Ngành Học ", icon,mChuyenNganhPanel,"Chuyên Ngành Học");//thwm phuong thuc tab va ten
        }
              
        tplMainBoard.setSelectedComponent(mChuyenNganhPanel);//hien thi tab ra man hinh
    }//GEN-LAST:event_btnCNActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

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
    private javax.swing.JButton btnCN;
    private javax.swing.JButton btnQLD;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
