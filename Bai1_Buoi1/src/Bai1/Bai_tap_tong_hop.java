package Bai1;

import java.util.Scanner;

public class Bai_tap_tong_hop {

	// ================== Hàm tìm UCLN ==================
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // ================== Hàm kiểm tra số hoàn thiện ==================
    public static boolean soHoanThien(int n) {
        int tong = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        return tong == n;
    }

    // ================== Hàm kiểm tra toàn chữ số chẵn ==================
    public static boolean toanChan(int n) {

        while (n > 0) {
            int so = n % 10;

            if (so % 2 != 0) {
                return false;
            }

            n = n / 10;
        }

        return true;
    }

    // ================== Hàm tính giai thừa ==================
    public static long giaiThua(int n) {
        long gt = 1;

        for (int i = 1; i <= n; i++) {
            gt *= i;
        }

        return gt;
    }

    // ================== Hàm tính S(x,n) ==================
    public static double tinhS(double x, int n) {
        double S = x;

        for (int i = 1; i <= n; i++) {

            int mu = 2 * i + 1;

            S += Math.pow(x, mu) / giaiThua(mu);
        }

        return S;
    }

    // ================== Main ==================
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Bài 1: UCLN =====
        System.out.print("Nhap a = ");
        int a = sc.nextInt();

        System.out.print("Nhap b = ");
        int b = sc.nextInt();

        System.out.println("UCLN = " + UCLN(a, b));

        // ===== Bài 2: Số hoàn thiện =====
        System.out.print("\nNhap n = ");
        int n = sc.nextInt();

        if (soHoanThien(n)) {
            System.out.println(n + " la so hoan thien");
        } else {
            System.out.println(n + " khong phai so hoan thien");
        }

        // ===== Bài 3: Toàn chữ số chẵn =====
        System.out.print("\nNhap so can kiem tra = ");
        int k = sc.nextInt();

        if (toanChan(k)) {
            System.out.println(k + " co toan chu so chan");
        } else {
            System.out.println(k + " khong phai toan chu so chan");
        }

        // ===== Bài 4: Tính S(x,n) =====
        System.out.print("\nNhap x = ");
        double x = sc.nextDouble();

        System.out.print("Nhap n = ");
        int m = sc.nextInt();

        double ketQua = tinhS(x, m);

        System.out.println("S = " + ketQua);

        sc.close();
    }
}

