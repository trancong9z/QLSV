/*

 */
package dulieu;

/**
 *
 * @author son
 */
public class BangDiem extends SV{
    private int ma;
    
    private float dToan,dTiengAnh,dLapTrinh;
    //cóntructor

    public BangDiem() {
    }

    public BangDiem(String MaSinhVien) {
        super(MaSinhVien);
    }

    public BangDiem(int ma,  float dToan, float dTiengAnh, float dLapTrinh) {
        this.ma = ma;
       
        this.dToan = dToan;
        this.dTiengAnh = dTiengAnh;
        this.dLapTrinh = dLapTrinh;
    }

    public BangDiem(int ma, float dToan, float dTiengAnh, float dLapTrinh, String MaSinhVien) {
        super(MaSinhVien);
        this.ma = ma;
       
        this.dToan = dToan;
        this.dTiengAnh = dTiengAnh;
        this.dLapTrinh = dLapTrinh;
    }

    
    //set-get

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
    
    
    public float getdToan() {
        return dToan;
    }

    public void setdToan(float dToan) {
        this.dToan = dToan;
    }

    public float getdTiengAnh() {
        return dTiengAnh;
    }

    public void setdTiengAnh(float dTiengAnh) {
        this.dTiengAnh = dTiengAnh;
    }

    public float getdLapTrinh() {
        return dLapTrinh;
    }

    public void setdLapTrinh(float dLapTrinh) {
        this.dLapTrinh = dLapTrinh;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }
    // dtb
    public float getDTB(){
        return (getdToan() + getdTiengAnh() + getdLapTrinh())/3;
    }
    //xep loai
    public String getXepLoai(){
        String xl ="";
        float dtb = getDTB();
        if(dtb >= 8.5){
            xl ="Giỏi ";
            
        }else if (dtb>=7.0) {
            xl="Khá";
        }
        else if(dtb>=5.5){
            xl="Trung Bình";
            
        }else if(dtb >=4.0){
            xl ="Yếu";
        }else{
            xl="Kém";
        }
        return xl;
    }
}
    //diem chu
//    public char getDC(){
//        char DC;
//        float dtb=getDTB();
//        if(dtb < 4.0){
//            DC = 'F';
//        }
//        else if(dtb < 5.5){
//            DC='D';
//            
//        }else if(dtb < 7.0){
//            DC='C';
//        }
//        else if(dtb <8.5){
//            DC ='B';
//        }else{
//            DC ='A';
//        }
//        return DC;      
//    }

   
    
    

