import java.util.ArrayList;
import java.util.Scanner;

public class Khanh_Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Danh sach vua nhap: " + list);
        sc.close();
    }
}
