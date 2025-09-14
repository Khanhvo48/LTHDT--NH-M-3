import java.util.Scanner;

public class BTap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("===== MENU BÀI TẬP =====");
            System.out.println("1. Hello + Tên");
            System.out.println("2. Thông tin cá nhân");
            System.out.println("3. Tính toán với 2 số nguyên");
            System.out.println("4. Tính lãi suất ngân hàng");
            System.out.print("Chọn bài tập (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1 -> bai1(sc);
                case 2 -> bai2();
                case 3 -> bai3(sc);
                case 4 -> bai4(sc);
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // Bài 1
    public static void bai1(Scanner sc) {
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    // Bài 2
    public static void bai2() {
        String ten = "Nguyen Van A";
        int tuoi = 20;
        double chieuCao = 1.75;
        char gioiTinh = 'M';
        boolean thichLapTrinh = true;

        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieuCao + "m");
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Có thích lập trình không? " + thichLapTrinh);
    }

    // Bài 3
    public static void bai3(Scanner sc) {
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + (a / b));
        System.out.println("Phần dư: " + (a % b));
    }

    // Bài 4
    public static void bai4(Scanner sc) {
        System.out.print("Nhập số tiền gửi (VNĐ): ");
        double tienGui = sc.nextDouble();

        System.out.print("Nhập lãi suất hàng năm (%): ");
        double laiSuatNam = sc.nextDouble();

        System.out.print("Nhập số tháng gửi: ");
        int soThang = sc.nextInt();

        double laiSuatThang = laiSuatNam / 12 / 100;
        double tienCuoiKy = tienGui * Math.pow(1 + laiSuatThang, soThang);
        double tienLai = tienCuoiKy - tienGui;

        System.out.println("Tiền lãi: " + tienLai);
        System.out.println("Tổng tiền cuối kỳ: " + tienCuoiKy);
    }
}