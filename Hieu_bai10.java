import java.util.ArrayList;
import java.util.Scanner;

public class Hieu_bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSach = new ArrayList<>();
        
        // Thêm một số phần tử mẫu
        danhSach.add("Java");
        danhSach.add("Python");
        danhSach.add("C++");
        danhSach.add("JavaScript");
        
        int choice;
        
        do {
            System.out.println("\n===== QUẢN LÝ DANH SÁCH =====");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm phần tử");
            System.out.println("3. Xóa phần tử");
            System.out.println("4. Thoát");
            System.out.println("=============================");
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm
            
            switch (choice) {
                case 1:
                    hienThiDanhSach(danhSach);
                    break;
                    
                case 2:
                    themPhanTu(danhSach, scanner);
                    break;
                    
                case 3:
                    xoaPhanTu(danhSach, scanner);
                    break;
                    
                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 4.");
            }
            
        } while (choice != 4);
        
        scanner.close();
    }
    
    // Hiển thị danh sách
    public static void hienThiDanhSach(ArrayList<String> danhSach) {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        
        System.out.println("\n--- DANH SÁCH HIỆN TẠI ---");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSach.get(i));
        }
        System.out.println("Tổng số phần tử: " + danhSach.size());
    }
    
    // Thêm phần tử
    public static void themPhanTu(ArrayList<String> danhSach, Scanner scanner) {
        System.out.print("Nhập phần tử muốn thêm: ");
        String phanTu = scanner.nextLine();
        
        System.out.print("Nhập vị trí muốn thêm (0 - " + danhSach.size() + "): ");
        int viTri = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm
        
        if (viTri < 0 || viTri > danhSach.size()) {
            System.out.println("Vị trí không hợp lệ! Vui lòng nhập từ 0 đến " + danhSach.size());
            return;
        }
        
        danhSach.add(viTri, phanTu);
        System.out.println("Đã thêm '" + phanTu + "' vào vị trí " + viTri);
    }
    
    // Xóa phần tử
    public static void xoaPhanTu(ArrayList<String> danhSach, Scanner scanner) {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách rỗng, không có gì để xóa!");
            return;
        }
        
        hienThiDanhSach(danhSach);
        System.out.print("Nhập vị trí phần tử muốn xóa (1 - " + danhSach.size() + "): ");
        int viTri = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ đệm
        
        if (viTri < 1 || viTri > danhSach.size()) {
            System.out.println("Vị trí không hợp lệ! Vui lòng nhập từ 1 đến " + danhSach.size());
            return;
        }
        
        String phanTuBiXoa = danhSach.remove(viTri - 1);
        System.out.println("Đã xóa phần tử '" + phanTuBiXoa + "' tại vị trí " + viTri);
    }
}