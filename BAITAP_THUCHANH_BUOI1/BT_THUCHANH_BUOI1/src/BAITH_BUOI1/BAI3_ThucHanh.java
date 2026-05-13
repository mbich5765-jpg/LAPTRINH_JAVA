package BAITH_BUOI1;

import java.util.Scanner;

abstract class Hinh {
    protected String mau;

    public Hinh(String mau) {
        this.mau = mau;
    }

    public abstract double TinhDienTich();
    public abstract double TinhChuVi();

    public String LayThongTin() {
        return "Màu sắc: " + mau;
    }
}

class HinhChuNhat extends Hinh {
    protected double chieudai;
    protected double chieurong;

    public HinhChuNhat(String mau, double chieudai, double chieurong) {
        super(mau);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    @Override
    public double TinhDienTich() {
        return chieudai * chieurong;
    }

    @Override
    public double TinhChuVi() {
        return (chieudai + chieurong) * 2;
    }

    @Override
    public String LayThongTin() {
        return "Hình chữ nhật - " + super.LayThongTin() + 
               " | Dài: " + chieudai + ", Rộng: " + chieurong + 
               " | Diện tích: " + TinhDienTich() + ", Chu vi: " + TinhChuVi();
    }
}

class HinhVuong extends HinhChuNhat {
    public HinhVuong(String mau, double canh) {
        super(mau, canh, canh);
    }

    @Override
    public String LayThongTin() {
        return "Hình vuông - Màu sắc: " + mau + 
               " | Cạnh: " + chieudai + 
               " | Diện tích: " + TinhDienTich() + ", Chu vi: " + TinhChuVi();
    }
}

class HinhTron extends Hinh {
    private double bankinh;

    public HinhTron(String mau, double bankinh) {
        super(mau);
        this.bankinh = bankinh;
    }

    @Override
    public double TinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }

    @Override
    public double TinhChuVi() {
        return 2 * Math.PI * bankinh;
    }

    @Override
    public String LayThongTin() {
        return "Hình tròn - " + super.LayThongTin() + 
               " | Bán kính: " + bankinh + 
               " | Diện tích: " + String.format("%.2f", TinhDienTich()) + 
               " | Chu vi: " + String.format("%.2f", TinhChuVi());
    }
}

public class BAI3_ThucHanh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n=== CHƯƠNG TRÌNH TÍNH CHU VI & DIỆN TÍCH ===");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình vuông");
            System.out.println("3. Hình tròn");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập màu sắc hình chữ nhật: ");
                    String mauHcn = scanner.nextLine();
                    System.out.print("Nhập chiều dài: ");
                    double dai = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double rong = scanner.nextDouble();
                    
                    HinhChuNhat hcn = new HinhChuNhat(mauHcn, dai, rong);
                    System.out.println("=> KẾT QUẢ: " + hcn.LayThongTin());
                    break;

                case 2:
                    System.out.print("Nhập màu sắc hình vuông: ");
                    String mauHv = scanner.nextLine();
                    System.out.print("Nhập cạnh hình vuông: ");
                    double canh = scanner.nextDouble();
                    
                    HinhVuong hv = new HinhVuong(mauHv, canh);
                    System.out.println("=> KẾT QUẢ: " + hv.LayThongTin());
                    break;

                case 3:
                    System.out.print("Nhập màu sắc hình tròn: ");
                    String mauHt = scanner.nextLine();
                    System.out.print("Nhập bán kính: ");
                    double banKinh = scanner.nextDouble();
                    
                    HinhTron ht = new HinhTron(mauHt, banKinh);
                    System.out.println("=> KẾT QUẢ: " + ht.LayThongTin());
                    break;

                case 0:
                    System.out.println("Chương trình kết thúc!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}