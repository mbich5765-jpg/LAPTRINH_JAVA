package BAITH_BUOI1;

import java.util.Scanner;

public class BAI1_ThucHanh {

    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean kiemTraSoHoanThien(int n) {
        if (n <= 1) return false;
        int tongUoc = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tongUoc += i;
            }
        }
        return tongUoc == n;
    }

    public static boolean kiemTraToanChuSoChan(int n) {
        if (n == 0) return true; 
        
        while (n > 0) {
            int chuSo = n % 10; 
            if (chuSo % 2 != 0) { 
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static long tinhGiaiThua(int n) {
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static double tinhBieuThucS(double x, int n) {
        double tong = 0;
        for (int i = 0; i <= n; i++) {
            int soMu = 2 * i + 1;
            tong += Math.pow(x, soMu) / tinhGiaiThua(soMu);
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n--- MENU BÀI TẬP THỰC HÀNH BUỔI 1 ---");
            System.out.println("1. Tìm UCLN của 2 số nguyên dương a, b");
            System.out.println("2. Kiểm tra số hoàn thiện");
            System.out.println("3. Kiểm tra số toàn chữ số chẵn");
            System.out.println("4. Tính biểu thức S(x, n)");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số dương a: ");
                    int a = scanner.nextInt();
                    System.out.print("Nhập số dương b: ");
                    int b = scanner.nextInt();
                    System.out.println("=> UCLN của " + a + " và " + b + " là: " + timUCLN(a, b));
                    break;
                case 2:
                    System.out.print("Nhập số nguyên dương n: ");
                    int n2 = scanner.nextInt();
                    if (kiemTraSoHoanThien(n2)) {
                        System.out.println("=> " + n2 + " LÀ số hoàn thiện.");
                    } else {
                        System.out.println("=> " + n2 + " KHÔNG PHẢI số hoàn thiện.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số nguyên dương n: ");
                    int n3 = scanner.nextInt();
                    if (kiemTraToanChuSoChan(n3)) {
                        System.out.println("=> Các chữ số của " + n3 + " toàn là số chẵn.");
                    } else {
                        System.out.println("=> " + n3 + " có chứa chữ số lẻ.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập giá trị thực x: ");
                    double x = scanner.nextDouble();
                    System.out.print("Nhập số nguyên dương n: ");
                    int n4 = scanner.nextInt();
                    System.out.println("=> Kết quả biểu thức S(" + x + ", " + n4 + ") = " + tinhBieuThucS(x, n4));
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}