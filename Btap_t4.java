import java.util.*;

public class Btap_t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bai 7
        System.out.println("Bai 7: Tinh tong mang");
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong = tong + a[i];
        }
        System.out.println("Tong mang = " + tong);

        // Bai 8
        System.out.println("\nBai 8: Tim phan tu xuat hien nhieu nhat");
        System.out.print("Nhap so phan tu: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            b[i] = sc.nextInt();
        }

        int maxCount = 0;
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (b[i] == b[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.print("Cac phan tu xuat hien nhieu nhat: ");
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (b[i] == b[j]) {
                    count++;
                }
            }
            if (count == maxCount) {
                boolean daIn = false;
                for (int k = 0; k < i; k++) {
                    if (b[k] == b[i]) {
                        daIn = true;
                        break;
                    }
                }
                if (!daIn) {
                    System.out.print(b[i] + " ");
                }
            }
        }
        System.out.println("(xuat hien " + maxCount + " lan)");

        // Bai 9
        System.out.println("\nBai 9: Danh sach so nguyen");
        System.out.print("Nhap so phan tu: ");
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.println("Danh sach: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
