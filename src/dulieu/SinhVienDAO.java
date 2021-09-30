
package dulieu;
import database.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {
    //them
    public boolean insert(SinhVien sv) throws Exception{
         String sql="insert SinhVien (MaSinhVien,HoTen,Email,SoDT,GioiTinh,DiaChi) values "
         +"(?,?,?,?,?,?) ";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
             sttm.setString(1, sv.getMaSinhVien());
             sttm.setString(2, sv.getHoTen());
             sttm.setString(3, sv.getEmail());
             sttm.setString(4, sv.getSoDT());
             sttm.setInt(5, sv.getGioiTinh());
             sttm.setString(6, sv.getDiaChi());
              return sttm.executeUpdate()>0;
            }
    }
    //update
    public boolean update(SinhVien sv) throws Exception{
         String sql="update SinhVien  set HoTen=?, Email=? , SoDT=?  , GioiTinh=? , DiaChi=? where MaSinhVien=? ";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
             sttm.setString(6, sv.getMaSinhVien());
             sttm.setString(1, sv.getHoTen());
             sttm.setString(2, sv.getEmail());
             sttm.setString(3, sv.getSoDT());
             sttm.setInt(4,sv.getGioiTinh());
             sttm.setString(5, sv.getDiaChi());
             return sttm.executeUpdate()>0;
         }
         
    }
    
    //xoa
     public boolean delete(String maSinhVien) throws Exception{
         String sql="delete from sinhvien where MaSinhVien=? ";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
             sttm.setString(1, maSinhVien);     
            return sttm.executeUpdate()>0;
         }
    }
    // lay danh sach sinh vien
    public List<SinhVien> findAll() throws Exception{
        String sql="select * from SinhVien";
        try (
                Connection con= DatabaseHelper.openConnection();
                PreparedStatement sttm = con.prepareStatement(sql);
        ){
            try(ResultSet rs = sttm.executeQuery();){
                List<SinhVien> list = new ArrayList<>();
                while(rs.next()){
                    SinhVien sv= createSinhVien(rs);
                    list.add(sv);
                }
                return list;
            } 
        }
    }
    //tim kiem theo ID
    public SinhVien findByID(String maSinhVien) throws Exception{
        String sql="select * from SinhVien where MaSinhVien =? ";
        
        try (
                Connection con= DatabaseHelper.openConnection();
                PreparedStatement sttm = con.prepareStatement(sql);
        ){ 
            sttm.setString(1, maSinhVien);
            try(ResultSet rs = sttm.executeQuery();){
                if (rs.next()){
                    SinhVien sv= createSinhVien(rs);
                    return sv;
                }
            }
        return null;
    }  
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv= new SinhVien();
        sv.setMaSinhVien(rs.getString("maSinhVien"));
        sv.setHoTen(rs.getString("hoTen"));
        sv.setEmail(rs.getString("Email"));
        sv.setSoDT(rs.getString("SoDT"));
        sv.setGioiTinh(rs.getInt("GioiTinh"));
        sv.setDiaChi(rs.getString("DiaChi"));
        return sv;
    }

    

 
}    

