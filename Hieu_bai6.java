import java.util.Scanner;

public class Hieu_bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CHƯƠNG TRÌNH TÌM UCLN VÀ BCNN");
        System.out.println("==============================");
        
        // Nhập hai số nguyên
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();
        
        // Lấy giá trị tuyệt đối để xử lý số âm
        int num1 = Math.abs(a);
        int num2 = Math.abs(b);
        
        // Tìm UCLN sử dụng thuật toán Euclid
        int ucln = timUCLN(num1, num2);
        
        // Tìm BCNN sử dụng công thức: BCNN(a, b) = (a * b) / UCLN(a, b)
        int bcnn = 0;
        if (ucln != 0) {
            bcnn = (num1 * num2) / ucln;
        }
        
        // Hiển thị kết quả
        System.out.println("\nKẾT QUẢ:");
        System.out.println("UCLN của " + a + " và " + b + " là: " + ucln);
        System.out.println("BCNN của " + a + " và " + b + " là: " + bcnn);
        
        scanner.close();
    }
    
    // Phương thức tìm UCLN sử dụng thuật toán Euclid
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}