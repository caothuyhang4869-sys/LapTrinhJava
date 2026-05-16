package Bai2;

import java.util.Scanner;

public class Dem_am 
{
	public static void NegativeNumberInStrings(String str) 
	{
        for (int i = 0; i < str.length() - 1; i++) 
        {
            // Nếu gặp dấu - và ký tự sau là số
            if (str.charAt(i) == '-' && Character.isDigit(str.charAt(i + 1))) 
            {
                String so = "-";
                i++;
                // Lấy các chữ số phía sau
                while (i < str.length() && Character.isDigit(str.charAt(i))) 
                {
                    so += str.charAt(i);
                    i++;
                }
                System.out.println(so);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println("Cac so nguyen am trong chuoi:");
        NegativeNumberInStrings(str);

        sc.close();
    }
}
