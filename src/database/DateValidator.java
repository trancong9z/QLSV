
package database;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author son
 */
public class DateValidator {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage){
        if(field.getText().equals("")){//ktra neu la chuoi rong
            sb.append(errorMessage).append("\n");//bao loi
            field.setBackground(Color.red);//thiet lap mau
            field.requestFocus();               
        }else{
            field.setBackground(Color.white);//neu nhap du lieu set mau nen la mau trang                       
        }   
    }
    public static void validateEmpty(JPasswordField field, StringBuilder sb, String errorMessage){
        String password = new String(field.getPassword());
        if(field.getText().equals("")){//ktra neu la chuoi rong
            sb.append(errorMessage).append("\n");//bao loi
            field.setBackground(Color.red);//thiet lap mau
            field.requestFocus();               
        }else{
            field.setBackground(Color.white);//neu nhap du lieu set mau nen la mau trang
            
            
        }
    
    }
    
    
    
    
}
