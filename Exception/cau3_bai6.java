import java.util.Scanner;

// Lớp để quản lý mảng 2 chiều
class MangHaiChieu {
    // Thuộc tính
    private int m; 
    private int n;  
    private int[][] a;

    // Constructor
    public MangHaiChieu(int m, int n) {
        this.m = m;
        this.n = n;
    }

    // Phương thức kiểm tra điều kiện hợp lệ
    public void kiemTraHopLe() throws Exception {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Loi: So hang va so cot phai lon hon 0!");
        }
    }

    // Phương thức tạo mảng và nhập giá trị
    public void taoMang() throws Exception {
        // Kiểm tra điều kiện trước khi tạo mảng
        kiemTraHopLe();

        // Khởi tạo mảng
        a = new int[m][n];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
    }

    // Phương thức in mảng
    public void inMang() {
        System.out.println("Mang 2 chieu vua nhap la:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Lớp chính để chạy chương trình
public class cau3_bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập số hàng
            System.out.print("Nhap so hang (m): ");
            int m = scanner.nextInt();

            // Nhập số cột
            System.out.print("Nhap so cot (n): ");
            int n = scanner.nextInt();

            // Tạo đối tượng mảng 2 chiều
            MangHaiChieu mangHaiChieu = new MangHaiChieu(m, n);

            // Tạo và nhập mảng
            mangHaiChieu.taoMang();

            // In mảng
            mangHaiChieu.inMang();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Loi: Ban phai nhap so nguyen, khong phai chu!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}