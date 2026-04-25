import java.util.ArrayList;
import java.util.Scanner; 

public class BAI1_BUOI4 {
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bạn muốn mảng có bao nhiêu phần tử? ");
        int n = scanner.nextInt();
        int[] M = new int[n];

        System.out.println("Vui lòng nhập các phần tử cho mảng:");
        for (int i = 0; i < M.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            M[i] = scanner.nextInt();
        }
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Dòng 1:");
        xuLyVaInDanhSach(M, "Le");
        
        System.out.println("Dòng 2:");
        xuLyVaInDanhSach(M, "Chan");
        
        System.out.println("Dòng 3:");
        xuLyVaInDanhSach(M, "SNT");
        
        System.out.println("Dòng 4:");
        xuLyVaInDanhSach(M, "KhongSNT");
        
        scanner.close();
    }

    public static void xuLyVaInDanhSach(int[] M, String loai) {
        ArrayList<Integer> dsDaIn = new ArrayList<Integer>();
        int tongSoLuong = 0;

        for (int i = 0; i < M.length; i++) {
            int x = M[i];
            boolean thoaDieuKien = false;

            if (loai.equals("Le") && x % 2 != 0) {
                thoaDieuKien = true;
            } else if (loai.equals("Chan") && x % 2 == 0) {
                thoaDieuKien = true;
            } else if (loai.equals("SNT") && laSoNguyenTo(x)) {
                thoaDieuKien = true;
            } else if (loai.equals("KhongSNT") && !laSoNguyenTo(x)) {
                thoaDieuKien = true;
            }

            if (thoaDieuKien) {
                tongSoLuong++; 
                if (dsDaIn.contains(x) == false) {
                    dsDaIn.add(x);
                }
            }
        }

        System.out.print("-> ");
        for (int i = 0; i < dsDaIn.size(); i++) {
            int x = dsDaIn.get(i);
            int dem = 0;
            for (int j = 0; j < M.length; j++) {
                if (M[j] == x) {
                    dem++;
                }
            }

            if (dem > 1) {
                System.out.print(x + "(" + dem + ")");
            } else {
                System.out.print(x);
            }

            if (i < dsDaIn.size() - 1) {
                System.out.print(", ");
            }
        }

        String tenLoai = "";
        if (loai.equals("Le")) tenLoai = "số lẻ";
        else if (loai.equals("Chan")) tenLoai = "số chẵn";
        else if (loai.equals("SNT")) tenLoai = "số nguyên tố";
        else if (loai.equals("KhongSNT")) tenLoai = "số không phải nguyên tố";

        System.out.println(" -> " + tongSoLuong + " " + tenLoai);
    }
}