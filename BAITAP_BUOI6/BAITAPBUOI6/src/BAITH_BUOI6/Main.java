package BAITH_BUOI6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff myStaff = new Staff();

        System.out.println("=== NHẬP THÔNG TIN NHÂN VIÊN ===");

        System.out.println("\n--- Nhân viên ---");
        System.out.print("Nhập tên: ");
        String nameVol = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String addVol = scanner.nextLine();
        System.out.print("Nhập SĐT: ");
        String phoneVol = scanner.nextLine();
        
        Volunteer v = new Volunteer(nameVol, addVol, phoneVol);
        myStaff.addNewStaff(v);

        System.out.println("\n--- Thêm Quản lý (Executive) ---");
        System.out.print("Nhập tên: ");
        String nameExec = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String addExec = scanner.nextLine();
        System.out.print("Nhập SĐT: ");
        String phoneExec = scanner.nextLine();
        System.out.print("Nhập mã BHXH (SSN): ");
        String ssnExec = scanner.nextLine();
        
        double defaultExecPayRate = 10000000;
        Executive ex = new Executive(nameExec, addExec, phoneExec, ssnExec, defaultExecPayRate);
        
        ex.awardBonus(2000000); 
        myStaff.addNewStaff(ex);

        System.out.println("\n=================================");
        System.out.println("=== BẢNG LƯƠNG NHÂN VIÊN ===");
        myStaff.payday();
        
        scanner.close();
    }
}