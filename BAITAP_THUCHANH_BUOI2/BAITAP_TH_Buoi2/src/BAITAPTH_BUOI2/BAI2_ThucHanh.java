package BAITAPTH_BUOI2;

import java.util.ArrayList;
import java.util.Scanner;

public class BAI2_ThucHanh {
    static ArrayList<Invoice> dsHoaDon = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n--- MENU QUAN LY HOA DON ---");
            System.out.println("1. Nhap danh sach hoa don");
            System.out.println("2. Xuat danh sach hoa don");
            System.out.println("3. Sap xep danh sach");
            System.out.println("4. Tim kiem hoa don");
            System.out.println("5. Xoa hoa don");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang (0-5): ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    xoaHoaDon();
                    break;
                case 0:
                    System.out.println("Chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }

    public static void nhapDanhSach() {
        System.out.print("Nhap so luong hoa don muon them: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoa don thu " + (i + 1) + ":");
            String ma = "";
            boolean trungMa;
            do {
                trungMa = false;
                System.out.print("Ma mat hang: ");
                ma = sc.nextLine();
                for (Invoice inv : dsHoaDon) {
                    if (inv.getPartNumber().equalsIgnoreCase(ma)) {
                        System.out.println("Ma mat hang da ton tai. Vui long nhap ma khac!");
                        trungMa = true;
                        break;
                    }
                }
            } while (trungMa);

            System.out.print("Mo ta mat hang: ");
            String moTa = sc.nextLine();
            System.out.print("So luong: ");
            int soLuong = sc.nextInt();
            System.out.print("Don gia: ");
            double donGia = sc.nextDouble();
            sc.nextLine();

            Invoice inv = new Invoice(ma, moTa, soLuong, donGia);
            dsHoaDon.add(inv);
        }
    }

    public static void xuatDanhSach() {
        if (dsHoaDon.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.printf("%-15s %-25s %-10s %-15s %-15s\n", "Ma mat hang", "Mo ta", "So luong", "Don gia", "Thanh tien");
        for (Invoice inv : dsHoaDon) {
            System.out.printf("%-15s %-25s %-10d %-15.2f %-15.2f\n", 
                    inv.getPartNumber(), inv.getPartDescription(), 
                    inv.getQuantity(), inv.getPricePerItem(), inv.getInvoiceAmount());
        }
    }

    public static void sapXep() {
        if (dsHoaDon.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (int i = 0; i < dsHoaDon.size() - 1; i++) {
            for (int j = i + 1; j < dsHoaDon.size(); j++) {
                Invoice inv1 = dsHoaDon.get(i);
                Invoice inv2 = dsHoaDon.get(j);
                
                if (inv1.getPartNumber().compareToIgnoreCase(inv2.getPartNumber()) > 0) {
                    dsHoaDon.set(i, inv2);
                    dsHoaDon.set(j, inv1);
                } else if (inv1.getPartNumber().equalsIgnoreCase(inv2.getPartNumber())) {
                    if (inv1.getQuantity() > inv2.getQuantity()) {
                        dsHoaDon.set(i, inv2);
                        dsHoaDon.set(j, inv1);
                    }
                }
            }
        }
        System.out.println("Da sap xep danh sach tang dan!");
    }

    public static void timKiem() {
        if (dsHoaDon.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.print("Nhap ma mat hang can tim: ");
        String maTim = sc.nextLine();
        boolean timThay = false;

        for (Invoice inv : dsHoaDon) {
            if (inv.getPartNumber().equalsIgnoreCase(maTim)) {
                System.out.printf("%-15s %-25s %-10s %-15s %-15s\n", "Ma mat hang", "Mo ta", "So luong", "Don gia", "Thanh tien");
                System.out.printf("%-15s %-25s %-10d %-15.2f %-15.2f\n", 
                        inv.getPartNumber(), inv.getPartDescription(), 
                        inv.getQuantity(), inv.getPricePerItem(), inv.getInvoiceAmount());
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay hoa don co ma: " + maTim);
        }
    }

    public static void xoaHoaDon() {
        if (dsHoaDon.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.print("Nhap ma mat hang can xoa: ");
        String maXoa = sc.nextLine();
        boolean daXoa = false;

        for (int i = 0; i < dsHoaDon.size(); i++) {
            if (dsHoaDon.get(i).getPartNumber().equalsIgnoreCase(maXoa)) {
                dsHoaDon.remove(i);
                daXoa = true;
                System.out.println("Da xoa hoa don co ma: " + maXoa);
                break;
            }
        }
        if (!daXoa) {
            System.out.println("Khong tim thay hoa don co ma: " + maXoa + " de xoa!");
        }
    }
}