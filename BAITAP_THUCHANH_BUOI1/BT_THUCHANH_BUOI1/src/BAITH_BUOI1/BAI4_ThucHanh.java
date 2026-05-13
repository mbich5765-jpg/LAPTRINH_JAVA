package BAITH_BUOI1;

import java.util.Scanner;

public class BAI4_ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH NHẬP VÀ KIỂM TRA HÌNH ===");
        
        System.out.println("\n[1] Nhập thông tin Hình Chữ Nhật:");
        System.out.print("- Nhập màu sắc: ");
        String mauHcn = scanner.nextLine();
        System.out.print("- Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("- Nhập chiều rộng: ");
        double rong = scanner.nextDouble();
        
        scanner.nextLine(); 
        
        HinhChuNhat hcn = new HinhChuNhat(mauHcn, dai, rong);

        System.out.println("\n[2] Nhập thông tin Hình Tròn:");
        System.out.print("- Nhập màu sắc: ");
        String mauHt = scanner.nextLine();
        System.out.print("- Nhập bán kính: ");
        double banKinh = scanner.nextDouble();
        
        scanner.nextLine();
        
        HinhTron ht = new HinhTron(mauHt, banKinh);

        System.out.println("\n[3] Nhập thông tin Hình Vuông:");
        System.out.print("- Nhập màu sắc: ");
        String mauHv = scanner.nextLine();
        System.out.print("- Nhập cạnh hình vuông: ");
        double canh = scanner.nextDouble();
        
        HinhVuong hv = new HinhVuong(mauHv, canh);

        System.out.println("\n================ KẾT QUẢ THỐNG KÊ ================");
        System.out.println(hcn.LayThongTin());
        System.out.println(ht.LayThongTin());
        System.out.println(hv.LayThongTin());
        System.out.println("==================================================");

        scanner.close();
    }
}