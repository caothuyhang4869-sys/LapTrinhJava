package LapTrinh_Java;
import java.util.Scanner;

public class KiemTraHinh {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Hình chữ nhật =====
        System.out.println("NHAP HINH CHU NHAT");

        System.out.print("Nhap mau: ");
        String mauHCN = sc.nextLine();

        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(mauHCN, dai, rong);

        sc.nextLine();

        // ===== Hình tròn =====
        System.out.println("\nNHAP HINH TRON");

        System.out.print("Nhap mau: ");
        String mauHT = sc.nextLine();

        System.out.print("Nhap ban kinh: ");
        double bk = sc.nextDouble();

        HinhTron ht = new HinhTron(mauHT, bk);

        sc.nextLine();

        // ===== Hình vuông =====
        System.out.println("\nNHAP HINH VUONG");

        System.out.print("Nhap mau: ");
        String mauHV = sc.nextLine();

        System.out.print("Nhap canh: ");
        double canh = sc.nextDouble();

        HinhVuong hv = new HinhVuong(mauHV, canh);

        // ===== Xuất kết quả =====
        System.out.println("\n===== THONG TIN CAC HINH =====");

        System.out.println("\n" + hcn.layThongTin());

        System.out.println("\n------------------");

        System.out.println(ht.layThongTin());

        System.out.println("\n------------------");

        System.out.println(hv.layThongTin());

        sc.close();
    }
}
