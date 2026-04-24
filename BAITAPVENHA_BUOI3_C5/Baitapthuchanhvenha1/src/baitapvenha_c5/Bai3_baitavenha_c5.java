package baitapvenha_c5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai3_baitavenha_c5 {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> dsSach = new HashMap<Integer, String>();

      
        System.out.print("Nhập số lượng sách cần thêm: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách: ");
            int ma = sc.nextInt();
            sc.nextLine();
            System.out.print("Nhập tên sách: ");
            String ten = sc.nextLine();
            dsSach.put(ma, ten);
        }

        System.out.println("\n--- DANH SÁCH SÁCH HIỆN CÓ ---");
        for (Map.Entry<Integer, String> entry : dsSach.entrySet()) {
            System.out.println("Mã: " + entry.getKey() + " - Tên: " + entry.getValue());
        }

        System.out.print("\nNhập mã sách cần SỬA: ");
        int maSua = sc.nextInt();
        sc.nextLine();
        if (dsSach.containsKey(maSua)) {
            System.out.print("Nhập tên sách mới: ");
            String tenMoi = sc.nextLine();
            dsSach.put(maSua, tenMoi);
            System.out.println("=> Cập nhật thành công!");
        } else {
            System.out.println("=> Mã sách không tồn tại.");
        }

        System.out.print("\nNhập mã sách cần XÓA: ");
        int maXoa = sc.nextInt();
        if (dsSach.containsKey(maXoa)) {
            dsSach.remove(maXoa);
            System.out.println("=> Đã xóa sách mã " + maXoa);
        } else {
            System.out.println("=> Không tìm thấy mã sách để xóa.");
        }

        System.out.print("\nNhập mã sách cần TÌM KIẾM: ");
        int maTim = sc.nextInt();
        if (dsSach.containsKey(maTim)) {
            System.out.println("=> Kết quả tìm kiếm: " + dsSach.get(maTim));
        } else {
            System.out.println("=> Không tìm thấy sách có mã này.");
        }
        
        sc.close(); 
    } 
} 