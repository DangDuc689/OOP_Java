import java.util.Scanner;

interface Hinh{
    public float PI = 3.14f;

    void Nhap();

    void Xuat();

    float dienTich();
}

class hinhVuong implements Hinh{
    private float canh;

    public hinhVuong(){

    }

    public hinhVuong(float canh){
        this.canh = canh;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap canh hinh vuong: ");
        canh = sc.nextFloat();
    }

    public void Xuat(){
        System.out.println("Canh cua hinh vuong la: " + canh);
    }

    public float dienTich(){
        return canh*canh;
    }
}

class hinhChuNhat implements Hinh{
    private float dai, rong;

    public hinhChuNhat(){

    }

    public hinhChuNhat(float dai, float rong){
        this.dai = dai;
        this.rong = rong;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        rong = sc.nextFloat(); 
    }

    public void Xuat(){
        System.out.println("Hinh chu nhat co chieu dai: " + dai + " va chieu rong: " + rong);
    }

    public float dienTich(){
        return dai * rong;    
    }
}

class hinhTron implements Hinh{
    private float banKinh;

    public hinhTron(){

    }

    public hinhTron(float banKinh){
        this.banKinh = banKinh;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        banKinh = sc.nextFloat();
    }

    public void Xuat(){
        System.out.println("Ban kinh hinh tron la: " + banKinh);
    }

    public float dienTich(){
        return PI * (banKinh * banKinh);
    }
}

public class cau2_bai5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        int n = sc.nextInt();
        Hinh ds[] = new Hinh[n];

        for (int i = 0; i < n; i++){
            System.out.print("\nChon loai hinh se nhap: " +
                            "\n1: hinh vuong" +
                            "\n2: hinh chu nhat" +
                            "\n3: hinh tron\n");


            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    ds[i] = new hinhVuong();
                    ds[i].Nhap();
                    break;
                case 2:
                    ds[i] = new hinhChuNhat();
                    ds[i].Nhap();
                    break;
                case 3:
                    ds[i] = new hinhTron();
                    ds[i].Nhap();
                    break;
                default: 
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
                    i--;
                    break;
            }
        }  
        System.out.println();
        for (int k = 0; k < n; k++){
            ds[k].Xuat();
            System.out.println("Dien tich: " + ds[k].dienTich());
        }
        sc.close();
    }
}