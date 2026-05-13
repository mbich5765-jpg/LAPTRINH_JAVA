package BAITH_BUOI1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BAI2_ThucHanh {

    public static void NegativeNumberInStrings(String str) {
       
        Pattern pattern = Pattern.compile("-\\d+");
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        System.out.print("Các số nguyên âm tìm được là: ");
        
        while (matcher.find()) {
            System.out.print(matcher.group() + " "); 
            count++;
        }
        
        if (count == 0) {
            System.out.print("Không có");
        }
        
        System.out.println("\n=> Tổng cộng xuất ra được " + count + " số nguyên âm.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào chuỗi bất kỳ: ");
        String inputStr = scanner.nextLine();
       
        NegativeNumberInStrings(inputStr);
        
        System.out.println("\n--------------------------------------------------");
        System.out.println("Chạy test thử với chuỗi ví dụ của đề bài:");
        String testStr = "abc-5xyz-12k9l--p";
        System.out.println("Chuỗi đầu vào: " + testStr);
        NegativeNumberInStrings(testStr);
        
        scanner.close();
    }
}