import java.util.Scanner;

public class Hieu_bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double soThuNhat, soThuHai, ketQua;
        
        do {
            // Hiển thị menu
            System.out.println("\nCHƯƠNG TRÌNH MÁY TÍNH CƠ BẢN");
            System.out.println("============================");
            System.out.println("1. Phép cộng");
            System.out.println("2. Phép trừ");
            System.out.println("3. Phép nhân");
            System.out.println("4. Phép chia");
            System.out.println("5. Thoát");
            System.out.println("============================");            
            System.out.print("Nhập lựa chọn của bạn (1-5): ");
            choice = scanner.nextInt();       
            switch (choice) {
                case 1: // Phép cộng
                    System.out.print("Nhập số thứ nhất: ");
                    soThuNhat = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    soThuHai = scanner.nextDouble();
                    ketQua = soThuNhat + soThuHai;
                    System.out.println("Kết quả: " + soThuNhat + " + " + soThuHai + " = " + ketQua);
                    break;
                    
                case 2: // Phép trừ
                    System.out.print("Nhập số thứ nhất: ");
                    soThuNhat = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    soThuHai = scanner.nextDouble();
                    ketQua = soThuNhat - soThuHai;
                    System.out.println("Kết quả: " + soThuNhat + " - " + soThuHai + " = " + ketQua);
                    break;
                    
                case 3: // Phép nhân
                    System.out.print("Nhập số thứ nhất: ");
                    soThuNhat = scanner.nextDouble();
                    System.out.print("Nhập số thứ hai: ");
                    soThuHai = scanner.nextDouble();
                    ketQua = soThuNhat * soThuHai;
                    System.out.println("Kết quả: " + soThuNhat + " × " + soThuHai + " = " + ketQua);
                    break;
                    
                case 4: // Phép chia
                    System.out.print("Nhập số bị chia: ");
                    soThuNhat = scanner.nextDouble();
                    System.out.print("Nhập số chia: ");
                    soThuHai = scanner.nextDouble();
                    if (soThuHai == 0) {
                        System.out.println("Lỗi: Không thể chia cho 0!");
                    } else {
                        ketQua = soThuNhat / soThuHai;
                        System.out.println("Kết quả: " + soThuNhat + " ÷ " + soThuHai + " = " + ketQua);
                    }
                    break;
                    
                case 5: // Thoát
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 5.");
            }
            
            // Tạm dừng để xem kết quả (trừ khi thoát)
            if (choice != 5) {
                System.out.print("\nNhấn Enter để tiếp tục...");
                scanner.nextLine(); // Xóa bộ đệm
                scanner.nextLine(); // Chờ nhấn Enter
            }
            
        } while (choice != 5);
        
        scanner.close();
    }
}