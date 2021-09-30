
package dulieu;

public class ChuyenNganh extends  SV{
    private int STT;
    private String HoTen,Khoa,MonHoc;
    private float TinChi;
    private String GhiChu;
    
    //constructor

    public ChuyenNganh() {
    }

    public ChuyenNganh(int STT, String HoTen, String Khoa, String MonHoc, float TinChi, String GhiChu) {
        this.STT = STT;
        this.HoTen = HoTen;
        this.Khoa = Khoa;
        this.MonHoc = MonHoc;
        this.TinChi = TinChi;
        this.GhiChu = GhiChu;
    }

    public ChuyenNganh(int STT, String HoTen, String Khoa, String MonHoc, float TinChi, String GhiChu, String MaSinhVien) {
        super(MaSinhVien);
        this.STT = STT;
        this.HoTen = HoTen;
        this.Khoa = Khoa;
        this.MonHoc = MonHoc;
        this.TinChi = TinChi;
        this.GhiChu = GhiChu;
    }

   
    
    //set-get

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(String MonHoc) {
        this.MonHoc = MonHoc;
    }

    public float getTinChi() {
        return TinChi;
    }

    public void setTinChi(float TinChi) {
        this.TinChi = TinChi;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    
   

    

    
    
    
}
