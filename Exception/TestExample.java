
/* 
   Tình huống lỗi	                     Ngoại lệ đề xuất	               Ví dụ thông báo
Đầu vào không hợp lệ	            IllegalArgumentException	    "Tuổi không được âm!"
Lỗi tính toán	                    ArithmeticException	            "Không thể chia cho 0!"
Dữ liệu nhập sai kiểu	            InputMismatchException	        "Phải nhập số, không phải chữ!"
Truy cập không hợp lệ	            NullPointerException	        "Đối tượng chưa được khởi tạo!"
Vượt giới hạn (mảng, danh sách)	    IndexOutOfBoundsException	    "Vượt quá kích thước mảng!"
*/

import java.util.InputMismatchException;
import java.util.Scanner;

class nhapsaituoi extends RuntimeException {
    public nhapsaituoi(String thongBao) {
        super(thongBao);
    }
}

public class TestExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // try{
        // System.out.print("Nhap tuoi cua ban: ");
        // int age = sc.nextInt();
        // System.out.println("Tuoi cua ban la: " + age);
        // int error = age / 0;
        // }
        // catch(InputMismatchException i){
        // System.out.println("Vui long nhap tuoi la so nguyen!");
        // }
        // catch(ArithmeticException a){
        // System.out.println("khong the chia cho 0 ban oi");
        // }
        // finally{
        // System.out.println("ket thuc chuong trinh!");
        // }

        // System.out.print("Nhap tuoi cua ban: ");
        // int age = sc.nextInt();
        // // System.out.print("Nhap ten cua ban: ");
        // // String name = sc.nextLine();
        // if (age < 18){
        // throw new RuntimeException("Age not valid");
        // }
        // else
        // System.out.println("Welcome");

        try {
            getNumber(); // Gọi phương thức có thể ném ngoại lệ
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Bạn phải nhập số nguyên, không phải chữ!" + e);
        }

    }

    // Phương thức này có thể ném ngoại lệ InputMismatchException
    public static void getNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = sc.nextInt(); // Nếu nhập chữ thay vì số, sẽ ném InputMismatchException
        System.out.println("Số bạn nhập là: " + number);
    }
}

