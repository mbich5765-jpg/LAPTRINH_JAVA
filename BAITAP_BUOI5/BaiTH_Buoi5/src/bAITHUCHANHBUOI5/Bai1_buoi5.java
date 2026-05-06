package bAITHUCHANHBUOI5;

import java.util.Scanner;

class NhanVien {
    private String ho;
    private String ten;
    private int soSP;

    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP < 0) {
            this.soSP = 0;
        } else {
            this.soSP = soSP;
        }
    }

    public double getLuong() {
        double donGia = 0;
        if (soSP >= 1 && soSP <= 199) {
            donGia = 0.5;
        } else if (soSP >= 200 && soSP <= 399) {
            donGia = 0.55;
        } else if (soSP >= 400 && soSP <= 599) {
            donGia = 0.6;
        } else if (soSP >= 600) {
            donGia = 0.65;
        }
        return soSP * donGia;
    }
}

public class Bai1_buoi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Nhập thông tin Nhân viên 1 ===");
        System.out.print("Nhập họ: ");
        String ho1 = sc.nextLine();
        System.out.print("Nhập tên: ");
        String ten1 = sc.nextLine();
        System.out.print("Nhập số sản phẩm: ");
        int sp1 = sc.nextInt();
        sc.nextLine(); 

        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);

        System.out.println("\n=== Nhập thông tin Nhân viên 2 ===");
        System.out.print("Nhập họ: ");
        String ho2 = sc.nextLine();
        System.out.print("Nhập tên: ");
        String ten2 = sc.nextLine();
        System.out.print("Nhập số sản phẩm: ");
        int sp2 = sc.nextInt();

        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        System.out.println("\n=== Lương Nhân Viên ===");
        System.out.println("Nhân viên 1 (" + nv1.getHo() + " " + nv1.getTen() + "): " + nv1.getLuong());
        System.out.println("Nhân viên 2 (" + nv2.getHo() + " " + nv2.getTen() + "): " + nv2.getLuong());

        sc.close();
    }
}