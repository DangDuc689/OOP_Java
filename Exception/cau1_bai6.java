import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class cau1_bai6 {
    public static void main(String[] args){
        int a[] = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            a[i] = rand.nextInt(100);
        }  
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ban muon in ra phan tu thu may: ");
            int n = sc.nextInt();
            System.out.println("Phan tu mang thu " + n + " mang gia tri la: " + a[n]);
        }
        catch (InputMismatchException e) {
            System.out.println("Phan tu mang chua hop le. Vui long nhap mot so nguyen!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Phan tu chua hop le. Vui long nhap gia tri tu 0 - 9");
        }
        finally {
            System.out.println("Ket thuc chuong trinh");
        }
    }

}
