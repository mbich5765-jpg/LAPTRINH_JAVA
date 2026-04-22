package bai1_buoi3.com;
import java.util.Random;
import java.util.Scanner;

public class Bai_1_trang14 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isPlaying = true;

        System.out.println("=== CHÀO MỪNG ĐẾN VỚI GAME ĐOÁN SỐ ===");

        while (isPlaying) {
            int targetNumber = random.nextInt(101);
            int attempts = 0;
            boolean isWinner = false;

            System.out.println("\nMáy tính đã chọn một số từ 0 đến 100.");
            System.out.println("Bạn có tối đa 7 lần đoán. Bắt đầu nào!");

            while (attempts < 7) {
                System.out.print("Lần đoán thứ " + (attempts + 1) + " - Nhập số của bạn: ");
                int userGuess = 0;

                try {
                    String input = scanner.nextLine();
                
                    userGuess = Integer.parseInt(input.trim());
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Bạn phải nhập vào một số nguyên! Vui lòng thử lại.");
                    continue;
                }

               
                if (userGuess < 0 || userGuess > 100) {
                    System.out.println("Vui lòng nhập số trong giới hạn từ 0 đến 100.");
                    continue;
                }

               
                if (userGuess == targetNumber) {
                    System.out.println("Win ! Bạn đã đoán chính xác số " + targetNumber + "!");
                    isWinner = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Số bạn đoán NHỎ HƠN số của máy.");
                } else {
                    System.out.println("Số bạn đoán LỚN HƠN số của máy.");
                }

                attempts++;
            }

            
            if (!isWinner) {
                System.out.println("Game Over nha thím! Số chính xác của máy là: " + targetNumber);
            }

           
            System.out.print("\nBạn có muốn chơi nữa không? (Y để tiếp tục, phím bất kỳ để thoát): ");
            String playAgainAnswer = scanner.nextLine().trim();
        
            if (!playAgainAnswer.equalsIgnoreCase("Y")) {
                isPlaying = false;
                System.out.println("Cảm ơn bạn đã tham gia! Hẹn gặp lại.");
            }
        }

        scanner.close();
    }
}