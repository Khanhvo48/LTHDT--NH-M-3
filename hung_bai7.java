import java.util.Scanner;

public class hung_bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();

        // Kiểm tra số lượng phần tử hợp lệ
        if (n <= 0) {
            System.out.println("Số lượng phần tử phải lớn hơn 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        int tong = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            // Kiểm tra nhập đúng kiểu số nguyên
            while (!sc.hasNextInt()) {
                System.out.print("Vui lòng nhập số nguyên: ");
                sc.next();
            }
            arr[i] = sc.nextInt();
            tong += arr[i];
        }

        System.out.println("Tổng các phần tử trong mảng là: " + tong);
        sc.close();
    }
}