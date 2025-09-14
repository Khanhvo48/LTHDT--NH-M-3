import java.util.Scanner;

public class BaiTapJava {

    // Bài 1: Nhập tên và in ra màn hình, trả về tên
    public static String bai1(Scanner sc) {
        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();
        System.out.println("Hello " + ten);
        return ten; // trả về để dùng ở Bài 2
    }

    // Bài 2: Khai báo biến nhiều kiểu dữ liệu, dùng lại tên từ Bài 1
    public static void bai2(String ten) {
        int tuoi = 20;
        double chieuCao = 1.75;
        char gioiTinh = 'M';
        boolean thichLapTrinh = true;

        System.out.println("Tên: " + ten);  // dùng tên nhập ở Bài 1
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Có thích lập trình không? " + thichLapTrinh);
    }

    // Bài 3: Nhập 2 số nguyên và tính toán
    public static void bai3(Scanner sc) {
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();

        System.out.println("Tổng = " + (a + b));
        System.out.println("Hiệu = " + (a - b));
        System.out.println("Tích = " + (a * b));
        if (b != 0) {
            System.out.println("Thương = " + (a / b));
            System.out.println("Phần dư = " + (a % b));
        } else {
            System.out.println("Không thể chia cho 0");
        }
    }

    // Bài 4: Tính lãi suất ngân hàng
    public static void bai4(Scanner sc) {
        System.out.print("Nhập số tiền gửi: ");
        double tienGoc = sc.nextDouble();

        System.out.print("Nhập lãi suất hàng năm (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhập số tháng gửi: ");
        int soThang = sc.nextInt();

        double laiSuatThang = laiSuatNam / 100 / 12;
        double tienLai = tienGoc * laiSuatThang * soThang;
        double tongTien = tienGoc + tienLai;

        System.out.println("Số tiền lãi: " + tienLai);
        System.out.println("Tổng số tiền cuối kỳ: " + tongTien);
    }

    // Hàm main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Chạy Bài 1 ===");
        String ten = bai1(sc);   // nhập tên và lưu lại

        System.out.println("\n=== Chạy Bài 2 ===");
        bai2(ten);  // truyền tên sang Bài 2

        System.out.println("\n=== Chạy Bài 3 ===");
        bai3(sc);

        System.out.println("\n=== Chạy Bài 4 ===");
        bai4(sc);

        sc.close();
    }
}
