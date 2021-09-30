//kiem tra dang nhap
package dulieu;
import database.DatabaseHelper;
import dulieu.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class NguoiDungDAO {
    public NguoiDung checkLogin(String tenDangNhap , String matKhau)
        throws  Exception{
        String sql ="select tenDangNhap , matKhau from nguoidung  "
               + "where tendangnhap =? and matkhau=?";
        try(
                Connection con = DatabaseHelper.openConnection();                
                PreparedStatement  pstmt = con.prepareStatement(sql);
                
            ){
             pstmt.setString(1,tenDangNhap);
             pstmt.setString(2,matKhau);
            try(ResultSet rs = pstmt.executeQuery(); ){
                if(rs.next()){
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);//de bao mat nen ko thiet lap mk
                    return nd;
                }               
            }  
        }
        return null;
    }    
}   
    
