package LapTrinhJava;

import java.util.Scanner;

public class Panlyndrome {

    // Phương thức kiểm tra panlyndrome
    public static boolean kiemTraPanlyndrome(String s) 
    {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) 
        {
            if (s.charAt(i) != s.charAt(n - 1 - i)) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        if (kiemTraPanlyndrome(s)) 
        {
            System.out.println("Đây là chuỗi Panlyndrome");
        } 
        else 
        {
            System.out.println("Không phải Panlyndrome");
        }

        sc.close();
    }
}
