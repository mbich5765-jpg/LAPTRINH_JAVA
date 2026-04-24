package baitapvenha_c5;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Bai1_baitapvenha_c5 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Nhập số lượng phần tử N: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n]; 
        
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = rand.nextInt(100); 
        }

        System.out.print("Mảng vừa tạo: ");
        for (int x : arr) { 
            System.out.print(x + " ");
        }
        System.out.println();

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Tổng các phần tử trong mảng: " + sum);

        System.out.print("Nhập số K cần tìm: ");
        int k = sc.nextInt();
        int count = 0;
        for (int x : arr) {
            if (x == k) {
                count++;
            }
        }
        System.out.println("Số lần " + k + " xuất hiện trong mảng là: " + count);

        int max = arr[0]; 
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);

        System.out.print("Các số nguyên tố trong mảng: ");
        for (int x : arr) {
            if (isPrime(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        int[] arrAsc = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrAsc); 
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int x : arrAsc) System.out.print(x + " ");
        System.out.println();

        int[] arrDesc = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arrDesc.length - 1; i++) { 
            for (int j = arrDesc.length - 1; j > i; j--) { 
                if (arrDesc[j] > arrDesc[j - 1]) { 
                    int temp = arrDesc[j]; 
                    arrDesc[j] = arrDesc[j - 1]; 
                    arrDesc[j - 1] = temp; 
                }
            }
        }
        System.out.print("Mảng sau khi sắp xếp giảm dần: ");
        for (int x : arrDesc) System.out.print(x + " ");
        System.out.println();
    }
}