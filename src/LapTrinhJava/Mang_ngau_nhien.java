package LapTrinhJava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mang_ngau_nhien{
    public static int[] taoMang(int n) 
    {
        Random rd = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = rd.nextInt(100);
        }
        return a;
    }

    // Xuất mảng
    public static void xuatMang(int[] a) 
    {
        for (int x : a) 
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Tính tổng
    public static int tinhTong(int[] a) 
    {
        int sum = 0;
        for (int x : a) 
        {
            sum += x;
        }
        return sum;
    }

    // Đếm số lần xuất hiện của K
    public static int demSoLanXuatHien(int[] a, int k) 
    {
        int count = 0;
        for (int x : a) 
        {
            if (x == k) count++;
        }
        return count;
    }

    // Tìm max
    public static int timMax(int[] a) 
    {
        int max = a[0];
        for (int x : a) 
        {
            if (x > max) max = x;
        }
        return max;
    }

    // Tìm min
    public static int timMin(int[] a) 
    {
        int min = a[0];
        for (int x : a) 
        {
            if (x < min) min = x;
        }
        return min;
    }

    // Kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) 
    {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Xuất số nguyên tố
    public static void xuatSoNguyenTo(int[] a) 
    {
        for (int x : a) 
        {
            if (laSoNguyenTo(x)) 
            {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    // Sắp xếp tăng
    public static void sapXepTang(int[] a) 
    {
        Arrays.sort(a);
    }

    // Sắp xếp giảm
    public static void sapXepGiam(int[] a) 
    {
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) 
        {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();

        int[] a = taoMang(n);

        System.out.print("Mảng: ");
        xuatMang(a);

        System.out.println("Tổng: " + tinhTong(a));

        System.out.print("Nhập K: ");
        int k = sc.nextInt();
        System.out.println("Số lần xuất hiện của K: " + demSoLanXuatHien(a, k));

        System.out.println("Max: " + timMax(a));
        System.out.println("Min: " + timMin(a));

        System.out.print("Số nguyên tố: ");
        xuatSoNguyenTo(a);

        sapXepTang(a);
        System.out.print("Tăng dần: ");
        xuatMang(a);

        sapXepGiam(a);
        System.out.print("Giảm dần: ");
        xuatMang(a);

        sc.close();
    }
}