package LapTrinhJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySoNguyen 
{
	// Nhập danh sách ban đầu
    public static void nhapDanhSach(ArrayList<Integer> list, Scanner sc) 
    {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            int x = sc.nextInt();
            list.add(x);
        }
    }

    // Xuất danh sách
    public static void xuat(ArrayList<Integer> list) 
    {
        if (list.isEmpty()) 
        {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (int x : list) 
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Thêm
    public static void them(ArrayList<Integer> list, int x) 
    {
        list.add(x);
    }

    // Sửa theo vị trí
    public static void sua(ArrayList<Integer> list, int index, int newValue) 
    {
        if (index < 0 || index >= list.size()) 
        {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        list.set(index, newValue);
    }

    // Xóa theo giá trị
    public static void xoa(ArrayList<Integer> list, int x)
    {
        if (list.remove(Integer.valueOf(x))) 
        {
            System.out.println("Đã xóa!");
        } 
        else 
        {
            System.out.println("Không tìm thấy!");
        }
    }

    // Tìm kiếm
    public static void timKiem(ArrayList<Integer> list, int x) 
    {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) 
        {
            if (list.get(i) == x) 
            {
                System.out.println("Tìm thấy tại vị trí: " + i);
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("Không tìm thấy!");
        }
    }

    // Sắp xếp tăng
    public static void sapXepTang(ArrayList<Integer> list) 
    {
        Collections.sort(list);
    }

    // Sắp xếp giảm
    public static void sapXepGiam(ArrayList<Integer> list) 
    {
        Collections.sort(list, Collections.reverseOrder());
    }

    // ================= MAIN =================
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // NHẬP BAN ĐẦU
        nhapDanhSach(list, sc);

        int choice;
        do 
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Sắp xếp tăng");
            System.out.println("6. Sắp xếp giảm");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Nhập số cần thêm: ");
                    them(list, sc.nextInt());
                    xuat(list);
                    break;

                case 2:
                    System.out.print("Nhập vị trí: ");
                    int index = sc.nextInt();
                    System.out.print("Giá trị mới: ");
                    int newVal = sc.nextInt();
                    sua(list, index, newVal);
                    xuat(list);
                    break;

                case 3:
                    System.out.print("Nhập số cần xóa: ");
                    xoa(list, sc.nextInt());
                    xuat(list);
                    break;

                case 4:
                    System.out.print("Nhập số cần tìm: ");
                    timKiem(list, sc.nextInt());
                    xuat(list);
                    break;

                case 5:
                    sapXepTang(list);
                    System.out.println("Đã sắp xếp tăng!");
                    xuat(list);
                    break;

                case 6:
                    sapXepGiam(list);
                    System.out.println("Đã sắp xếp giảm!");
                    xuat(list);
                    break;
                case 0:
                    System.out.println("Thoát!");
                    break;

                default:
                    System.out.println("Chọn sai!");
            }

        } while (choice != 0);

        sc.close();
    }
}
