import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;

public class BAI2_BUOI4 {

    public static void main(String[] args) {
        ArrayList<String> dsSV = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n----- QUẢN LÝ SINH VIÊN -----");
            System.out.println("1. Thêm Sinh viên");
            System.out.println("2. Xuất danh sách sinh viên");
            System.out.println("3. Sửa Sinh Viên");
            System.out.println("4. Xóa Sinh viên");
            System.out.println("5. Tìm Sinh viên có chữ 'An'");
            System.out.println("6. Sắp xếp Sinh Viên");
            System.out.println("7. Xuất ra số lượng sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1: 
                    System.out.print("Nhập tên sinh viên: ");
                    String ten = sc.nextLine();
                    dsSV.add(ten);
                    System.out.println("Đã thêm thành công!");
                    break;

                case 2:
                    System.out.println("Danh sách sinh viên hiện tại:");
                    for (String s : dsSV) {
                        System.out.println("- " + s);
                    }
                    break;

                case 3: 
                    System.out.print("Nhập vị trí (index) cần sửa: ");
                    int indexSua = sc.nextInt();
                    sc.nextLine();
                    if (indexSua >= 0 && indexSua < dsSV.size()) {
                        System.out.print("Nhập tên mới: ");
                        String tenMoi = sc.nextLine();
                        dsSV.set(indexSua, tenMoi); 
                        System.out.println("Đã sửa!");
                    } else {
                        System.out.println("Vị trí không tồn tại!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập chính xác tên cần xóa: ");
                    String tenXoa = sc.nextLine();
                    if (dsSV.remove(tenXoa)) {
                        System.out.println("Đã xóa sinh viên: " + tenXoa);
                    } else {
                        System.out.println("Không tìm thấy sinh viên này để xóa.");
                    }
                    break;

                case 5: 
                    System.out.println("Các sinh viên có tên chứa chữ 'An':");
                    boolean timThay = false;
                    for (int i = 0; i < dsSV.size(); i++) {
                        String s = dsSV.get(i);
                        if (s.toLowerCase().contains("an")) { 
                            System.out.println("Vị trí " + i + ": " + s);
                            timThay = true;
                        }
                    }
                    if (!timThay) System.out.println("Không tìm thấy!");
                    break;

                case 6: 
                    Collections.sort(dsSV); 
                    System.out.println("Đã sắp xếp danh sách tăng dần!");
                    break;

                case 7: 
                    System.out.println("Tổng số sinh viên có trong danh sách: " + dsSV.size());
                    break;

                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Chọn sai rồi, mời chọn lại!");
            }
        } while (chon != 0);
        
        sc.close();
    }
}