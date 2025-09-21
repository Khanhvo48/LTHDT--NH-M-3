import java.util.Scanner;

public class hung_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        int tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
        }

        System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);
        sc.close();
    }
}