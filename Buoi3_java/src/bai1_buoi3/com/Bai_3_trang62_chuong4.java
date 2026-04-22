package bai1_buoi3.com;

import java.util.Scanner;

public class Bai_3_trang62_chuong4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        
        int n = s.length();
        String nuaDau = "";
        String nuaSau = "";

        if (n % 2 == 0) {
            nuaDau = s.substring(0, n / 2);
            nuaSau = s.substring(n / 2);
        } else {
            nuaDau = s.substring(0, n / 2);
            nuaSau = s.substring(n / 2 + 1);
        }

        StringBuilder sb = new StringBuilder(nuaSau);
        String nuaSauDaoNguoc = sb.reverse().toString();

        if (nuaDau.equalsIgnoreCase(nuaSauDaoNguoc)) {
            System.out.println("=> '" + s + "' là chuỗi Palindrome!");
        } else {
            System.out.println("=> '" + s + "' KHÔNG phải là chuỗi Palindrome.");
        }
        
        scanner.close();
    }
}