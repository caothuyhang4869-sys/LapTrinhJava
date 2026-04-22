package LapTrinhJava;

import java.util.Random;
import java.util.Scanner;

public class Doanso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        boolean choiTiep = true;

        while (choiTiep) {
            int soMay = rd.nextInt(101); // [0..100]
            int soLanDoan = 0;
            int maxLan = 7;
            boolean thang = false;

            System.out.println("=== GAME ĐOÁN SỐ ===");
            System.out.println("Đoán số từ 0 đến 100 (tối đa 7 lần)");

            while (soLanDoan < maxLan) {
                try {
                	System.out.println("Lần đoán thứ " + (soLanDoan + 1));
                    System.out.print("Nhập số bạn đoán: ");
                    int soNguoi = sc.nextInt();
                    soLanDoan++;

                    if (soNguoi == soMay) {
                        System.out.println("Chính xác! Bạn WIN!");
                        thang = true;
                        break;
                    } else if (soNguoi < soMay) {
                        System.out.println("Số bạn đoán NHỎ hơn!");
                    } else {
                        System.out.println("Số bạn đoán LỚN hơn!");
                    }

                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số hợp lệ!");
                    sc.nextLine(); // xóa input lỗi
                }
            }

            if (!thang) {
                System.out.println("Game Over! Số đúng là: " + soMay);
            }

            // hỏi chơi tiếp
            System.out.print("Bạn có muốn chơi tiếp không? (y/n): ");
            sc.nextLine(); // clear buffer
            String chon = sc.nextLine();

            if (!chon.equalsIgnoreCase("y")) {
                choiTiep = false;
            }
        }

        System.out.println("Cảm ơn bạn đã chơi!");
        sc.close();
    }
}