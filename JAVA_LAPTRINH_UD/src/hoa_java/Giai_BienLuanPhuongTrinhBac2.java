package hoa_java;

import java.util.Scanner;

public class Giai_BienLuanPhuongTrinhBac2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Bước 1: Nhập a, b, c
        System.out.println("Nhập hệ số a:");
        double a = sc.nextDouble();
        
        System.out.println("Nhập hệ số b:");
        double b = sc.nextDouble();
        
        System.out.println("Nhập hệ số c:");
        double c = sc.nextDouble();
        
        // Bước 2: Kiểm tra điều kiện
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PTVSN"); 
                } else {
                    System.out.println("PTVN");  
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có 1 nghiệm: x = " + x);
            }
        } else {
            
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("PTVN");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}