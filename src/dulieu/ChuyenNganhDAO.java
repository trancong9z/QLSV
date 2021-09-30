
package dulieu;

import database.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ChuyenNganhDAO {
    //them
     public boolean insert(ChuyenNganh cn) throws Exception{
         String sql="insert into ChuyenNganh (MaSinhVien,Khoa,MonHoc,TinChi,GhiChu) values "
         +"(?,?,?,?,?) ";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
             sttm.setString(1,cn.getMaSinhVien());
             sttm.setString(2,cn.getKhoa());
             sttm.setString(3,cn.getMonHoc());
             sttm.setFloat(4,cn.getTinChi());
             sttm.setString(5,cn.getGhiChu());
             
             return sttm.executeUpdate()>0;
            }
    }
    //cap nhat
      public boolean update(ChuyenNganh cn) throws Exception{
         String sql="update ChuyenNganh set Khoa=?,MonHoc=?,TinChi=?,GhiChu=? where MaSinhVien =?";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
             sttm.setString(5,cn.getMaSinhVien());
             sttm.setString(1,cn.getKhoa());
             sttm.setString(2,cn.getMonHoc());
             sttm.setFloat(3,cn.getTinChi());
             sttm.setString(4,cn.getGhiChu());
             
             return sttm.executeUpdate()>0;
            }
        }
    // lay du lieu ho ten tu ma sinh vien
     public ChuyenNganh findByMaSinhVien(String maSinhVien) throws Exception{
         String sql= " Select * from ChuyenNganh where MaSinhVien = ?";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
             sttm.setString(1,maSinhVien); //thiet lap gri cho tham so ma sinh vien
              try(ResultSet rs = sttm.executeQuery();){//thuc hien truy van va tra ve ket qua
                  if(rs.next()){ //ktra neu co gia thi tra ve cac gia tri ben duoi
                      ChuyenNganh cn = new ChuyenNganh();
                      cn.setSTT(rs.getInt("STT"));//thiet lap cac gia tri
                      cn.setMaSinhVien(rs.getString("maSinhVien"));
                      cn.setKhoa(rs.getString("Khoa"));
                      cn.setMonHoc(rs.getString("MonHoc"));
                      cn.setTinChi(rs.getFloat("TinChi"));
                      cn.setGhiChu(rs.getString("GhiChu"));
                      return cn;        //tra ve doi tuong      
                  }
              }
              return null ; // ko tim thay thong tin theo ma sinh vien
            }
        }

     // lay danh sach
    public List<ChuyenNganh> finAll() throws Exception{
        String sql="select * from ChuyenNganh ";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement sttm = con.prepareStatement(sql);
            ){
            try(ResultSet rs = sttm.executeQuery();){
                List<ChuyenNganh> list = new ArrayList<>();
                while(rs.next()){
                    ChuyenNganh cn = new ChuyenNganh();
                    cn.setSTT(rs.getInt("STT"));
                    cn.setMaSinhVien(rs.getString("MaSinhVien"));
                    cn.setKhoa(rs.getString("Khoa"));
                    cn.setMonHoc(rs.getString("MonHoc"));
                    cn.setTinChi(rs.getFloat("TinChi"));
                    cn.setGhiChu(rs.getString("GhiChu"));
                    
                    list.add(cn);     
                }         
            return list;
            }   
            }
        }
    //xoa
    public boolean deleteByMaSinhVien(String maSinhVien) throws Exception{
        String sql=" delete from ChuyenNganh where MaSinhVien= ?  ";  
        try (
                Connection conn=DatabaseHelper.openConnection();
                PreparedStatement sttm=conn.prepareStatement(sql);    
            ){
            sttm.setString(1,maSinhVien);  
            return sttm.executeUpdate()>0;
            }
        } 
    //tim kiem theo id
    public ChuyenNganh findByID(String maSinhVien) throws Exception{
        String sql="select * from chuyenNganh where MaSinhVien =? ";
        
        try (
                Connection con= DatabaseHelper.openConnection();
                PreparedStatement sttm = con.prepareStatement(sql);
        ){ 
            sttm.setString(1, maSinhVien);
            try(ResultSet rs = sttm.executeQuery();){
                if (rs.next()){
                    ChuyenNganh cn= new ChuyenNganh();
                    /*sv.setMaSinhVien(rs.getString("maSinhVien"));
        sv.setHoTen(rs.getString("hoTen"));
        sv.setEmail(rs.getString("Email"));
        sv.setSoDT(rs.getString("SoDT"));
        sv.setGioiTinh(rs.getInt("GioiTinh"));
        sv.setDiaChi(rs.getString("DiaChi"));
                    */
                    cn.setMaSinhVien(rs.getString("MaSinhVien"));
                    cn.setKhoa(rs.getString("Khoa"));
                     cn.setMonHoc(rs.getString("MonHoc"));
                      cn.setTinChi(rs.getFloat("TinChi"));
                      cn.setGhiChu(rs.getString("GhiChu"));
                    
                    
                    return cn;
                }
            }
        return null;
    }  
    }

     
}
