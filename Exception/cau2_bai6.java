import java.util.InputMismatchException;
import java.util.Scanner;

// Lớp biểu thức để tính giá trị A
class BieuThuc {
    // Thuộc tính
    private double x;
    private double y;

    // Constructor
    public BieuThuc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức kiểm tra điều kiện hợp lệ
    private void kiemTraHopLe() throws Exception {
        // Kiểm tra mẫu số
        double mauSo = 2 * x + 7 * y;
        if (mauSo == 0) {
            throw new ArithmeticException("Loi: mau so (2x + 7y) bang 0");
        }

        // Kiểm tra giá trị trong căn
        double bieuThucTrongCan = (5 * x - y) / mauSo;
        if (bieuThucTrongCan < 0) {
            throw new Exception("Loi: gia tri can bac hai nho hon 0");
        }
    }

    // Phương thức tính giá trị A
    public double tinhGiaTri() throws Exception {
        // Kiểm tra điều kiện trước khi tính
        kiemTraHopLe();

        // Tính giá trị A
        double ketQua = Math.sqrt((5 * x - y) / (2 * x + 7 * y));
        return ketQua;
    }
}

// Lớp chính để chạy chương trình
public class cau2_bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập x
            System.out.print("Nhap gia tri x: ");
            double x = scanner.nextDouble();

            // Nhập y
            System.out.print("Nhap gia tri y: ");
            double y = scanner.nextDouble();

            // Tạo đối tượng biểu thức
            BieuThuc bieuThuc = new BieuThuc(x, y);

            // Tính và in kết quả
            double ketQua = bieuThuc.tinhGiaTri();
            System.out.printf("Gia tri cua A la: %.2f", ketQua);

        } catch (InputMismatchException e) {
            System.out.println("Loi: ban phai nhap so. Khong phai ky tu!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}