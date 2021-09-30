
package dulieu;
import database.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BangDiemDAO {
    //them
    public boolean insert(BangDiem bd) throws Exception{
         String sql="insert into Diem (MaSinhVien,Toan,TiengAnh,LapTrinh) values "
         +"(?,?,?,?) ";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
             sttm.setString(1,bd.getMaSinhVien());
             sttm.setFloat(2,bd.getdToan());
             sttm.setFloat(3,bd.getdTiengAnh());
             sttm.setFloat(4,bd.getdLapTrinh());
             return sttm.executeUpdate()>0;
            }
    }
    //update
    public boolean update(BangDiem bd) throws Exception{
         String sql="update Diem  set Toan=?,TiengAnh=?, LapTrinh=? where MaSinhVien=? ";
         try(
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement sttm = con.prepareStatement(sql);
            ){
            sttm.setString(4, bd.getMaSinhVien());
            sttm.setFloat(1,bd.getdToan());
            sttm.setFloat(2,bd.getdTiengAnh());
            sttm.setFloat(3,bd.getdLapTrinh() );
            return sttm.executeUpdate()>0;
            }        
    }
    //xoa
    public boolean deleteByMaSinhVien(String maSinhVien) throws Exception{
        String sql=" delete from Diem where MaSinhVien= ?  ";  
        try (
                Connection conn=DatabaseHelper.openConnection();
                PreparedStatement sttm=conn.prepareStatement(sql);    
            ){
            sttm.setString(1,maSinhVien);  
            return sttm.executeUpdate()>0;
            }
        } 
    // lay danh sach sinh vien
    public List<BangDiem> findAll() throws Exception{
        String sql="select * from Diem";
        try(
                Connection conn = DatabaseHelper.openConnection();
                PreparedStatement sttm  =conn.prepareStatement(sql);             
            ){
           
            try(ResultSet rs = sttm.executeQuery();){
                List<BangDiem> list = new ArrayList<>();
                while(rs.next()){   
                    BangDiem bd= createBangDiem(rs);
                       
                    list.add(bd);
                }
            return list;
            }
            
            } 
    }

    private BangDiem createBangDiem(final ResultSet rs) throws SQLException {
        BangDiem bd= new BangDiem();
        bd.setMa(rs.getInt("Ma"));
        bd.setMaSinhVien(rs.getString("MaSinhVien"));
        bd.setdToan(rs.getFloat("Toan"));
        bd.setdTiengAnh(rs.getFloat("TiengAnh"));
        bd.setdLapTrinh(rs.getFloat("LapTrinh"));
        return bd;
    }
    //tim kiem theo máinhvien
    public BangDiem findByMaSinhVien(String maSinhVien) throws Exception{ 
        String sql=" select * from Diem where MaSinhVien= ?  ";  
        try (
                Connection conn=DatabaseHelper.openConnection();
                PreparedStatement sttm=conn.prepareStatement(sql);    
            ){
            sttm.setString(1,maSinhVien);  
            
            try(ResultSet rs= sttm.executeQuery();){
                if(rs.next()){
                      BangDiem bd= createBangDiem(rs);
//                    BangDiem bd = new BangDiem();
//                    bd.setMa(rs.getInt("Ma"));
//                    bd.setMaSinhVien(rs.getString("maSinhVien"));                   
//                    bd.setdToan(rs.getFloat("Toan"));
//                    bd.setdTiengAnh(rs.getFloat("TiengAnh"));
//                    bd.setdLapTrinh(rs.getFloat("LapTrinh"));
                    
                    return bd;
                }
                
            }
            return null;
            }
        
    }
    //ontop
//     public List<BangDiem> findTop(int top ) throws Exception{
//        String sql="select top " + top + "*,(Toan + TiengAnh + LapTrinh)/3 as DTB"
//                + " from Diem order by dtb desc";
//        try(
//                Connection conn = DatabaseHelper.openConnection();
//                PreparedStatement sttm  =conn.prepareStatement(sql);             
//            ){
//           
//            try(ResultSet rs = sttm.executeQuery();){
//                List<BangDiem> list = new ArrayList<>();
//                while(rs.next()){   
//                    BangDiem bd = new BangDiem();
//                    bd.setMa(rs.getInt("Ma"));
//                    bd.setMaSinhVien(rs.getString("maSinhVien"));                   
//                    bd.setdToan(rs.getFloat("Toan"));
//                    bd.setdTiengAnh(rs.getFloat("TiengAnh"));
//                    bd.setdLapTrinh(rs.getFloat("LapTrinh"));   
//                    list.add(bd);
//                }
//            return list;
//            }
//            
//            } 
//    }

    public BangDiem findByID(String maSinhVien) throws Exception{
        String sql="select * from Diem where MaSinhVien =? ";
        
        try (
                Connection con= DatabaseHelper.openConnection();
                PreparedStatement sttm = con.prepareStatement(sql);
        ){ 
            sttm.setString(1, maSinhVien);
            try(ResultSet rs = sttm.executeQuery();){
                if (rs.next()){
                    BangDiem bd= new BangDiem();
                   bd.setMaSinhVien(rs.getString("MaSinhVien"));
                    bd.setdToan(rs.getFloat("Toan"));
                     bd.setdTiengAnh(rs.getFloat("TiengAnh"));
                     bd.setdLapTrinh(rs.getFloat("LapTrinh"));
           
                    return bd;
                }
            }
        return null;
    }  
    }
    
}
