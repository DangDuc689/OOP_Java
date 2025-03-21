import java.util.Scanner; 

abstract class NhanVien{
    protected String maNhanVien, tenNhanVien, trinhDo;
    protected double luongCoBan;

    public NhanVien(){

    }

    public NhanVien(String maNhanVien, String tenNhanVien, String trinhDo){
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.trinhDo = trinhDo;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        tenNhanVien = sc.nextLine();
        System.out.print("Nhap trinh do nhan vien: ");
        trinhDo = sc.nextLine();
        System.out.print("Nhap luong co ban cua nhan vien: ");
        luongCoBan = sc.nextDouble();
    }

    public void Xuat(){
        System.out.println("Ma nhan vien: " + maNhanVien +
                           "\nTen nhan vien: " + tenNhanVien +
                           "\nTrinh do: " + trinhDo);
    }

    abstract double tinhLuong();
}


class QuanLy extends NhanVien{
    private String chuyenMon;
    private double phuCapCongViec; 

    public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo) {
        super(maNhanVien, tenNhanVien, trinhDo);
    }

    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.print("Nhap phu cap cong viec: ");
        phuCapCongViec = sc.nextDouble();
    }

    public void Xuat(){
        super.Xuat();
        System.out.print("Chuyen mon: " + chuyenMon +
                         "\nPhu cap cong viec: " + phuCapCongViec);
    }

    public double tinhLuong(){
        return luongCoBan + phuCapCongViec;
    }
}

class NghienCuu extends NhanVien{
    private String chuyenMon;
    private double phuCapDocHai; 

    public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo) {
        super(maNhanVien, tenNhanVien, trinhDo);
    }

    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        phuCapDocHai = sc.nextDouble();
    }

    public void Xuat(){
        super.Xuat();
        System.out.print("Chuyen mon: " + chuyenMon +
                         "\nPhu cap doc hai: " + phuCapDocHai);
    }

    public double tinhLuong(){
        return luongCoBan + phuCapDocHai;
    }
}

class PhucVu extends NhanVien{
    public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo) {
        super(maNhanVien, tenNhanVien, trinhDo);
    }

    public void Nhap() {
        super.Nhap();
    }

    public void Xuat() {
        super.Xuat();
    }
    
    public double tinhLuong(){
        return luongCoBan;  
    }
}

public class cau1_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap thong tin Quan Ly:");
        QuanLy ql = new QuanLy("", "", "");
        ql.Nhap();
        
        System.out.println("\nNhap thong tin Nghien Cuu:");
        NghienCuu nc = new NghienCuu("", "", "");
        nc.Nhap();
        
        System.out.println("\nNhap thong tin Phuc Vu:");
        PhucVu pv = new PhucVu("", "", "");
        pv.Nhap();
        
        System.out.println("\nThong tin va luong cua nhan vien:");
        System.out.println("\nQuan Ly:");
        ql.Xuat();
        System.out.println("\nLuong: " + ql.tinhLuong());
        
        System.out.println("\nNghien Cuu:");
        nc.Xuat();
        System.out.println("\nLuong: " + nc.tinhLuong());
        
        System.out.println("\nPhuc Vu:");
        pv.Xuat();
        System.out.println("Luong: " + pv.tinhLuong());
        
        sc.close(); // Close Scanner only once at the end
    }
}
