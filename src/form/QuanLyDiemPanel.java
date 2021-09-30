/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import database.DateValidator;
import database.MessageDialogHelper;
import dulieu.BangDiem;
import dulieu.BangDiemDAO;
import dulieu.ChuyenNganh;
import dulieu.ChuyenNganhDAO;
import dulieu.SinhVien;
import dulieu.SinhVienDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyDiemPanel extends javax.swing.JPanel {

    private MainForm parentForm;
    private DefaultTableModel tblModel;
   
    
    
    public QuanLyDiemPanel() throws Exception {
        initComponents();
        //txtName.setEditable(false);// ko cho nhap du lieu
        inTable();
        loadBangDiem();
        
    }
    //dat ten cot trong bang
    private void inTable(){
        tblModel= new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{
            "Mã Sinh Viên: ", "Toán : ","Tiếng Anh: ","Lập trình: ","ĐTB: ","Xếp Loại:"
        });
        tblGpa.setModel(tblModel);    
    }
    //in tt ra bàng
    private void loadBangDiem() throws Exception{
//        try {
//            
            BangDiemDAO dao = new BangDiemDAO();
//            List<BangDiem> list = dao.findAll();
//            tblModel.setRowCount(0);
//            for(BangDiem bd : list){
//                tblModel.addRow(new Object[]{
//                    bd.getMaSinhVien(), 
//                    bd.getdToan(), bd.getdTiengAnh() , bd.getdLapTrinh(),
//                    ((bd.getdToan() + bd.getdTiengAnh() + bd.getdLapTrinh())/3) ,                                  
//                });             
//            }
//            tblModel.fireTableDataChanged();         
//        } catch (Exception e) {
//            e.printStackTrace();
//            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),"Lỗi ");
//        }
        DefaultTableModel tblModel = (DefaultTableModel)tblGpa.getModel();
        tblModel.setRowCount(0);
        for(BangDiem bd : dao.findAll() ){
            Object rowData[] = new Object[6];
            rowData[0] = bd.getMaSinhVien();
            rowData[1] = bd.getdToan();
            rowData[2] = bd.getdTiengAnh();
            rowData[3] = bd.getdLapTrinh();
            rowData[4] = bd.getDTB();
            rowData[5] = bd.getXepLoai();
            tblModel.addRow(rowData);
            
            
        }
    }
    
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentIdSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGpa = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtMath = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEnglish = new javax.swing.JTextField();
        txtIT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 251, 230));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 3, true));
        setForeground(new java.awt.Color(204, 204, 255));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMathFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Điểm Sinh Viên");

        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(253, 236, 236));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Mã Sinh Viên:");

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Search.png"))); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        tblGpa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGpa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGpaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGpa);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Mã Sinh Viên:");

        txtStudentId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStudentIdFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Họ Tên:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtMath.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMathFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Toán:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Tiếng Anh");

        txtEnglish.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMathFocusLost(evt);
            }
        });
        txtEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnglishActionPerformed(evt);
            }
        });

        txtIT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMathFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Lập trình:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMath, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIT, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMath, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtStudentIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentIdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(0, 0, 0)));

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Refresh.png"))); // NOI18N
        btnNew.setText("Nhập mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Save.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Delete.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Edit.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnUpdateFocusLost(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNew))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 909, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtStudentId.setText("");
        txtName.setText("");
        txtMath.setText("");
        txtEnglish.setText("");
        txtIT.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb= new StringBuilder();
        DateValidator.validateEmpty(txtStudentId,sb,"Mã Sinh Viên không được để trống !");
        DateValidator.validateEmpty(txtMath, sb,"Điểm không được để trống !");
        DateValidator.validateEmpty(txtEnglish, sb,"Điểm không được để trống !");
        DateValidator.validateEmpty(txtIT, sb,"Điểm không được để trống !");
        
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm,sb.toString() ,"Lỗi" );
            return ;
        }
        try {
            BangDiem bd = new BangDiem();
            bd.setMaSinhVien(txtStudentId.getText());
            bd.setdToan(Float.parseFloat(txtMath.getText()));
            bd.setdTiengAnh(Float.parseFloat(txtEnglish.getText()));
            bd.setdLapTrinh(Float.parseFloat(txtIT.getText()));
            
            BangDiemDAO dao = new BangDiemDAO();
            if(dao.findByMaSinhVien(txtStudentId.getText())!=null){
                if(MessageDialogHelper.showConfirmDialog(parentForm,
                        "Bạn có muốn cập nhật điểm không ", "Hỏi") == JOptionPane.NO_OPTION){
                    return ;
                }
                if(dao.update(bd)){
                    MessageDialogHelper.showMessageDialog(parentForm,"Đã cập nhật Điểm !", "Thông báo ");
                }else{
                    MessageDialogHelper.showMessageDialog(parentForm," Lỗi ! Không cập nhật  được điểm " ,"Cảnh báo " );
                }
            }else{
                if(dao.insert(bd) ){
                    MessageDialogHelper.showMessageDialog(parentForm,"ĐÃ lưu", "Thông báo");
                }
                else{
                    MessageDialogHelper.showConfirmDialog(parentForm,"Lỗi ! Không lưu được", "Thông báo ");
                }                                      
            } 
            //lay lai du lieu
            loadBangDiem();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),"Lỗi ");
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed
//nhap msv  ra ho ten
    private void txtStudentIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStudentIdFocusLost
        try {
            SinhVienDAO dao = new SinhVienDAO();
            SinhVien sv = dao.findByID(txtStudentId.getText());
            if(sv != null){
                txtName.setText(sv.getHoTen());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtStudentIdFocusLost

    private void txtMathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMathFocusLost
        if(txtEnglish.getText().equals("") || 
        txtMath.getText().equals("") ||
                txtIT.getText().equals("") ){//ktra nguoi dung nhajp tt
            return ;       
        }  
        //txtStudentIdFocusLost(null);
        //txtMathFocusLost(null);
        float toan = Float.parseFloat(txtMath.getText());
        float tienganh = Float.parseFloat(txtEnglish.getText());
        float laptrinh = Float.parseFloat(txtIT.getText());
        
        float dtb=(toan + tienganh + laptrinh)/3; //tinh dtb
        
//        String st = String.format("%.2f", dtb);//hien thi dtb
//        lblGpa.setText(st);
        
        
        
    }//GEN-LAST:event_txtMathFocusLost

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            BangDiemDAO dao = new BangDiemDAO();
            BangDiem bd = dao.findByMaSinhVien(txtStudentIdSearch.getText());
            
            if(bd != null){//neu 
                txtStudentId.setText(bd.getMaSinhVien());
                txtMath.setText(String.format("%.2f", bd.getdToan()));
                txtEnglish.setText(String.format("%.2f", bd.getdTiengAnh()));
                txtIT.setText(String.format("%.2f", bd.getdLapTrinh()));
                
                txtStudentIdFocusLost(null); //lay ten sv hien thi ra truong hotensv
                txtMathFocusLost(null);//hiern thi dtb
                
            }else{
                MessageDialogHelper.showMessageDialog(parentForm, "Không tìm thấy mã sinh viên !", "Thông báo ");
            }
        } catch (Exception e) {
             e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),"Lỗi ");
        
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnUpdateFocusLost
        
    }//GEN-LAST:event_btnUpdateFocusLost

    private void txtEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnglishActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnSaveActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(txtStudentId.getText().equals("")){//ktra nhap msv
                MessageDialogHelper.showMessageDialog(parentForm, "Chưa nhập mã sinh viên","Lỗi");
                return;
            }
            BangDiemDAO dao = new BangDiemDAO();
            BangDiem bd= dao.findByMaSinhVien(txtStudentId.getText());//ktra sv co trong bang diem ko
            if(bd ==  null){
                MessageDialogHelper.showMessageDialog(parentForm, "Không có mã sinh viên", "Lỗi");
                return ;
            }
            if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xóa điểm sinh viên không ?", "Hỏi ") == JOptionPane.NO_OPTION){
                return ;            
            }
            if(dao.deleteByMaSinhVien(txtStudentId.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Đã xóa điểm sinh viên !", "Thông báo");
            }else{
                MessageDialogHelper.showMessageDialog(parentForm,"Không xóa được điểm sinh viên ", "Thông báo");
            } 
            //lay lai du lieu khi thuc hien btn
            loadBangDiem();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),"Lỗi ");
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
//khi kich vao bang se hien thi ra 
    private void tblGpaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGpaMouseClicked
        try {
            int row = tblGpa.getSelectedRow();
            
            if(row >= 0){
                String id = (String) tblGpa.getValueAt(row, 0);
                //khi co id hien thi len cac txt
                BangDiemDAO dao = new BangDiemDAO();
               BangDiem bd = dao.findByID(id);
                
                if(bd != null){
                    
                    txtStudentId.setText(bd.getMaSinhVien());                  
                    txtMath.setText(String.valueOf(bd.getdToan()));  
                    txtEnglish.setText(String.valueOf(bd.getdTiengAnh())); 
                    txtIT.setText(String.valueOf(bd.getdLapTrinh())); 
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();//in ra loi
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(),            "Lỗi");//hien thi thong bao loi
                                                     //truy cập thông báo lỗi
        }
    }//GEN-LAST:event_tblGpaMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblGpa;
    private javax.swing.JTextField txtEnglish;
    private javax.swing.JTextField txtIT;
    private javax.swing.JTextField txtMath;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtStudentIdSearch;
    // End of variables declaration//GEN-END:variables


}
