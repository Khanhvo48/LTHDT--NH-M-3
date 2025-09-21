import java.util.Scanner;

public class Khanh_Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = sc.nextInt();

        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println(n + " la so nguyen to.");
        else System.out.println(n + " khong phai so nguyen to.");
        sc.close();
    }
}
