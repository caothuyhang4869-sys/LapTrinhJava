package LapTrinhJava;

import java.util.Scanner;

public class Mang_tu_nhien 
{
    // Hàm kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) 
    {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] M = new int[n];

        // Nhập mảng
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            M[i] = sc.nextInt();
        }

        // Khai báo biến đếm
        int demLe = 0, demChan = 0;

        System.out.print("Dòng 1 (Số lẻ): ");
        for (int x : M) 
        {
            if (x % 2 != 0) 
            {
                System.out.print(x + " ");
                demLe++;
            }
        }
        System.out.println("\nCó " + demLe + " số lẻ");

        System.out.print("Dòng 2 (Số chẵn): ");
        for (int x : M) 
        {
            if (x % 2 == 0) 
            {
                System.out.print(x + " ");
                demChan++;
            }
        }
        System.out.println("\nCó " + demChan + " số chẵn");

        boolean coSoNguyenTo = false;
        System.out.print("Dòng 3 (Số nguyên tố): ");
        for (int x : M)
        {
            if (laSoNguyenTo(x)) 
            {
                System.out.print(x + " ");
                coSoNguyenTo = true;
            }
        }

        if (!coSoNguyenTo) 
        {
            System.out.print("Không có số nguyên tố trong mảng");
        }

        System.out.print("\nDòng 4 (Không phải số nguyên tố): ");
        for (int x : M) 
        {
            if (!laSoNguyenTo(x)) 
            {
                System.out.print(x + " ");
            }
        }

        sc.close();
    }
}