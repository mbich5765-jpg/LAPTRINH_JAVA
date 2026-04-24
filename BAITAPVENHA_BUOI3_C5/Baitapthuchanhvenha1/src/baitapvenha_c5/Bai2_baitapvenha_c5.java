package baitapvenha_c5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2_baitapvenha_c5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<Integer>();

        System.out.print("Nhập số lượng phần tử ban đầu bạn muốn tạo: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int value = sc.nextInt();
            ds.add(value);
        }

        System.out.print("\n=> Danh sách hiện tại: ");
        xuatDanhSach(ds);

        System.out.print("\nNhập VỊ TRÍ (index) bạn muốn sửa (từ 0 đến " + (ds.size() - 1) + "): ");
        int viTriSua = sc.nextInt();
        if (viTriSua >= 0 && viTriSua < ds.size()) {
            System.out.print("Nhập GIÁ TRỊ mới: ");
            int giaTriMoi = sc.nextInt();
            ds.set(viTriSua, giaTriMoi);
            System.out.print("=> Đã sửa! Danh sách mới: ");
            xuatDanhSach(ds);
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        System.out.print("\nNhập VỊ TRÍ (index) bạn muốn xóa (từ 0 đến " + (ds.size() - 1) + "): ");
        int viTriXoa = sc.nextInt();
        if (viTriXoa >= 0 && viTriXoa < ds.size()) {
            ds.remove(viTriXoa);
            System.out.print("=> Đã xóa! Danh sách mới: ");
            xuatDanhSach(ds);
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        System.out.print("\nNhập số cần TÌM KIẾM: ");
        int soCanTim = sc.nextInt();
        if (ds.contains(soCanTim)) {
            System.out.println("=> Tìm thấy! Số " + soCanTim + " nằm ở vị trí index: " + ds.indexOf(soCanTim));
        } else {
            System.out.println("=> Không tìm thấy số " + soCanTim + " trong danh sách.");
        }

        System.out.println("\n--- THỰC HIỆN SẮP XẾP ---");
        Collections.sort(ds);
        System.out.print("=> Sắp xếp TĂNG DẦN: ");
        xuatDanhSach(ds);

        Collections.sort(ds, Collections.reverseOrder());
        System.out.print("=> Sắp xếp GIẢM DẦN: ");
        xuatDanhSach(ds);
    }

    public static void xuatDanhSach(ArrayList<Integer> list) {
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}