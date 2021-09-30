/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import database.DateValidator;
import database.MessageDialogHelper;
import dulieu.ChuyenNganh;
import dulieu.ChuyenNganhDAO;
import dulieu.SinhVien;
import dulieu.SinhVienDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author son
 */
public class ChuyenNganhPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;
    
    
    public ChuyenNganhPanel() {
        initComponents();
        inTable();
        loadBangChuyenNganh();
        
    }
    //dat ten cho cac cot trong bang
    public void inTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{
            "Mã sinh viên: ","Khoa:","Môn Hoc:","Số Tín Chỉ: ","Ghi Chú:"
        });
        tblChuyenNganh.setModel(tblModel);
    }
    //in tt ra bang
    private void loadBangChuyenNganh(){
        try {
            ChuyenNganhDAO dao = new ChuyenNganhDAO();
            List<ChuyenNganh> list = dao.finAll();
            tblModel.setRowCount(0);
            for(ChuyenNganh cn : list){
                tblModel.addRow(new Object[]{
                    cn.getMaSinhVien(),cn.getKhoa(),cn.getMonHoc(),cn.getTinChi(),cn.getGhiChu(),
                });
                tblModel.fireTableDataChanged();
            }
            
        } catch (Exception e) {
             e.printStackTrace();//in ra loi
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),            "Lỗi");//hien thi thong bao loi
                                                     //truy cập thông báo lỗi
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtKhoa = new javax.swing.JTextField();
        txtMonhoc = new javax.swing.JTextField();
        txtTinChi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChuyenNganh = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(227, 245, 249));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        setForeground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(245, 255, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Các Chuyên Ngành Học");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Mã Sinh Viên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Họ Tên:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Khoa :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Môn Học:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Số Tín Chỉ:");

        txtStudentID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStudentIDFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Ghi Chú:");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Refresh.png"))); // NOI18N
        btnNew.setText("Nhập Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Edit.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Save.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblChuyenNganh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblChuyenNganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChuyenNganhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChuyenNganh);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudentID)
                            .addComponent(txtName)
                            .addComponent(txtKhoa)
                            .addComponent(txtMonhoc)
                            .addComponent(txtTinChi)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNew)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DateValidator.validateEmpty(txtStudentID, sb, "Mã Sinh viên không được để trống ");
        DateValidator.validateEmpty(txtKhoa, sb, "Tên Khoa không được để trống ");
        DateValidator.validateEmpty(txtMonhoc, sb, "Tên môn học không được để trống ");
        DateValidator.validateEmpty(txtTinChi, sb, "Số tín chỉ không được để trống ");
        
        if(sb.length()>0){ // ktra nguoi dung nhap du lieu
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
        }
        try {
            ChuyenNganh cn = new ChuyenNganh();
            cn.setMaSinhVien(txtStudentID.getText());
            cn.setKhoa(txtKhoa.getText());
            cn.setMonHoc(txtMonhoc.getText());
            cn.setTinChi(Float.parseFloat(txtTinChi.getText()));
            cn.setGhiChu(txtGhiChu.getText());
            
            ChuyenNganhDAO dao= new ChuyenNganhDAO();
            if(dao.findByMaSinhVien(txtStudentID.getText()) != null ){ //neu ton tai ma sinh vien
                if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật dữ liệu không ?",
                        "Hỏi") ==JOptionPane.NO_OPTION){
                    return ; // khi ko chọn cập nhật thì kết thúc hành động này
                }
                if(dao.update(cn)){
                    MessageDialogHelper.showMessageDialog(parentForm, "Đã lưu sinh viên ", "Thông báo");
                }
                else{
                    MessageDialogHelper.showConfirmDialog(parentForm, "Khong lưu được ", "Cảnh báo ");
                }
            }
            
            
            if(dao.insert(cn)){
                MessageDialogHelper.showMessageDialog(parentForm, "Đã lưu sinh viên ", "Thông báo");
            }
            else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Khong lưu được ", "Cảnh báo ");
            }
            
            loadBangChuyenNganh();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),            "Lỗi");
        }                                              //truy cập thông báo lỗi
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtGhiChu.setText("");
        txtKhoa.setText("");
        txtMonhoc.setText("");
        txtName.setText("");
        txtStudentID.setText("");
        txtTinChi.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        StringBuilder sb = new StringBuilder();
        DateValidator.validateEmpty(txtStudentID, sb, "Mã Sinh viên không được để trống ");
        DateValidator.validateEmpty(txtKhoa, sb, "Tên Khoa không được để trống ");
        DateValidator.validateEmpty(txtMonhoc, sb, "Tên môn học không được để trống ");
        DateValidator.validateEmpty(txtTinChi, sb, "Số tín chỉ không được để trống ");
        
        if(sb.length()>0){ // ktra nguoi dung nhap du lieu co hop le ko
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn sửa thông tin không ?"
                , "Hỏi ") == JOptionPane.NO_OPTION){
            return ;
        }
        try {
            ChuyenNganh cn = new ChuyenNganh(); //tao ra doi tuong cn = chuyen nganh
            cn.setMaSinhVien(txtStudentID.getText()); //thiet lap cac gia tri cua du lieu do nguoi dung nhap vao
            cn.setKhoa(txtKhoa.getText()); //thiet lap cac gia tri cua du lieu do nguoi dung nhap
            cn.setMonHoc(txtMonhoc.getText()); //thiet lap cac gia tri cua du lieu do nguoi dung nhap
            cn.setTinChi(Float.parseFloat(txtTinChi.getText())); //thiet lap cac gia tri cua du lieu do nguoi dung nhap
            cn.setGhiChu(txtGhiChu.getText()); //thiet lap cac gia tri cua du lieu do nguoi dung nhap
            
            ChuyenNganhDAO dao= new ChuyenNganhDAO(); //tao ra doi tuong dao
            if(dao.update(cn)){ //goi thuc hien cap nhat truyen vao doi tuong cn
                MessageDialogHelper.showMessageDialog(parentForm, "Đã cập nhật thông tin sinh viên ", "Thông báo");//neu cap nhat thanh cong
            }
            else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Không cập nhật  được ", "Cảnh báo "); //cap nhat that bai
            }  
            loadBangChuyenNganh();
        } catch (Exception e) {
            e.printStackTrace();//in ra loi
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),            "Lỗi");//hien thi thong bao loi
        }                                              //truy cập thông báo lỗi
    }//GEN-LAST:event_btnEditActionPerformed
// nhap msv ra ho ten
    private void txtStudentIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStudentIDFocusLost
        try {
            SinhVienDAO dao = new SinhVienDAO();
            SinhVien sv = dao.findByID(txtStudentID.getText());//tim sv theo id
            if(sv != null){ //neu sinh vien khac null ,da ton tai msv
                txtName.setText(sv.getHoTen()); //lay ra sinh vien do 
            }
            
        } catch (Exception e) {
            e.printStackTrace();//in ra loi
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),            "Lỗi");//hien thi thong bao loi
                                                     //truy cập thông báo lỗi
        }
    }//GEN-LAST:event_txtStudentIDFocusLost

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            if(txtStudentID.getText().equals("")){//ktra du lieu msv
                MessageDialogHelper.showMessageDialog(parentForm, "Chưa nhập mã sinh viên","Lỗi");
                return;
            }
            ChuyenNganhDAO dao = new ChuyenNganhDAO();
            ChuyenNganh cn = dao.findByMaSinhVien(txtStudentID.getText());//ktra sinh vien co trong bang chuyen nganh ko
            if(cn == null){
                 MessageDialogHelper.showMessageDialog(parentForm, "Không có mã sinh viên", "Lỗi");
                return ;
                
            }
            if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xóa thông tin sinh viên không ?", "Hỏi ") == JOptionPane.NO_OPTION){
                return ;            
            }
            if(dao.deleteByMaSinhVien(txtStudentID.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Đã xóa thông tin  sinh viên !", "Thông báo");
            }else{
                MessageDialogHelper.showMessageDialog(parentForm,"Không xóa được điểm sinh viên ", "Thông báo");
            } 
            //lay lai du lieu 
            loadBangChuyenNganh();
            
        } catch (Exception e) {
            e.printStackTrace();//in ra loi
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),            "Lỗi");//hien thi thong bao loi
                                                     //truy cập thông báo lỗi
            
        }
    }//GEN-LAST:event_btnXoaActionPerformed
//khi kich vao bang se hien thi ra 
    private void tblChuyenNganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChuyenNganhMouseClicked
        try {
            int row = tblChuyenNganh.getSelectedRow();           
            if(row >= 0){
                String id = (String) tblChuyenNganh.getValueAt(row, 0);
                //khi co id hien thi len cac txt
                ChuyenNganhDAO dao = new ChuyenNganhDAO();
                ChuyenNganh cn = dao.findByID(id);
                
                if(cn != null){
                    
                    txtStudentID.setText(cn.getMaSinhVien());   
                    txtKhoa.setText(cn.getKhoa());
                    txtMonhoc.setText(cn.getMonHoc());
                    txtGhiChu.setText(cn.getGhiChu());
                    txtTinChi.setText(String.valueOf(cn.getTinChi())); //chuyen float thanh string sang text: Short.toString()
                    // chuyen  int thanh string sang text:String.valueOf() ; Integer.toString()
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();//in ra loi
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),            "Lỗi");//hien thi thong bao loi
                                                     //truy cập thông báo lỗi
        }
    }//GEN-LAST:event_tblChuyenNganhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblChuyenNganh;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMonhoc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtTinChi;
    // End of variables declaration//GEN-END:variables
}
