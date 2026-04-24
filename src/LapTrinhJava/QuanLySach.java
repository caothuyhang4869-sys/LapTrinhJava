package LapTrinhJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuanLySach 
{
    // Nhập danh sách ban đầu
    public static void nhapDanhSach(HashMap<Integer, String> map, Scanner sc) 
    {
        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách: ");
            int ma = sc.nextInt();
            sc.nextLine();

            System.out.print("Nhập tên sách: ");
            String ten = sc.nextLine();

            map.put(ma, ten);
        }
    }

    // Xuất danh sách
    public static void xuat(HashMap<Integer, String> map) 
    {
        if (map.isEmpty()) 
        {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("Danh sách sách:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) 
        {
            System.out.println("Mã: " + entry.getKey() + " - Tên: " + entry.getValue());
        }
    }

    // Thêm
    public static void them(HashMap<Integer, String> map, int ma, String ten) 
    {
        if (map.containsKey(ma)) 
        {
            System.out.println("Mã đã tồn tại!");
            return;
        }
        map.put(ma, ten);
    }

    // Sửa (theo mã)
    public static void sua(HashMap<Integer, String> map, int ma, String tenMoi)
    {
        if (!map.containsKey(ma)) 
        {
            System.out.println("Không tìm thấy mã!");
            return;
        }
        map.put(ma, tenMoi);
    }

    // Xóa
    public static void xoa(HashMap<Integer, String> map, int ma) 
    {
        if (map.remove(ma) == null)
        {
            System.out.println("Không tìm thấy để xóa!");
        }
    }

    // Tìm kiếm
    public static void timKiem(HashMap<Integer, String> map, int ma) 
    {
        if (map.containsKey(ma)) 
        {
            System.out.println("Tìm thấy: " + map.get(ma));
        } 
        else 
        {
            System.out.println("Không tìm thấy!");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        // Nhập ban đầu
        nhapDanhSach(map, sc);
        xuat(map);

        int choice;
        do 
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm");
            System.out.println("2. Xuất");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // tránh lỗi nhập chuỗi

            switch (choice) 
            {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    int ma = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String ten = sc.nextLine();
                    them(map, ma, ten);
                    xuat(map); // 🔥 in sau khi thêm
                    break;

                case 2:
                    xuat(map);
                    break;

                case 3:
                    System.out.print("Nhập mã cần sửa: ");
                    int maSua = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tên mới: ");
                    String tenMoi = sc.nextLine();
                    sua(map, maSua, tenMoi);
                    xuat(map); // 🔥
                    break;

                case 4:
                    System.out.print("Nhập mã cần xóa: ");
                    int maXoa = sc.nextInt();
                    xoa(map, maXoa);
                    xuat(map); // 🔥
                    break;

                case 5:
                    System.out.print("Nhập mã cần tìm: ");
                    int maTim = sc.nextInt();
                    timKiem(map, maTim);
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