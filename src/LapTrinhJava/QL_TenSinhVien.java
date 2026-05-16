package LapTrinhJava;

import java.util.*;

public class QL_TenSinhVien {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<>();

        int chon;

        do 
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên (chứa tên bất kỳ)");
            System.out.println("5. Tìm sinh viên có chữ 'An'");
            System.out.println("6. Sắp xếp sinh viên");
            System.out.println("7. Số lượng sinh viên");
            System.out.println("0. Thoát");

            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) 
            {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String ten = sc.nextLine();
                    ds.add(ten);
                    break;

                case 2:
                    System.out.println("Danh sách sinh viên:");
                    if (ds.isEmpty()) 
                    {
                        System.out.println("Danh sách rỗng!");
                    } 
                    else 
                    {
                        for (int i = 0; i < ds.size(); i++) 
                        {
                            System.out.println((i + 1) + ". " + ds.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập vị trí sinh viên cần sửa: ");
                    int vt = sc.nextInt();
                    sc.nextLine();

                    if (vt >= 1 && vt <= ds.size()) 
                    {
                        System.out.print("Nhập tên mới: ");
                        String tenMoi = sc.nextLine();
                        ds.set(vt - 1, tenMoi);
                    } 
                    else 
                    {
                        System.out.println("Vị trí sinh viên không hợp lệ!");
                    }
                    break;

                case 4:
                    System.out.print("Xóa sinh viên có chứa tên: ");
                    String xoa = sc.nextLine();

                    boolean timThay = false;

                    for (int i = 0; i < ds.size(); i++) 
                    {
                        if (ds.get(i).contains(xoa)) 
                        {
                            ds.remove(i);
                            i--;
                            timThay = true;
                        }
                    }

                    if (!timThay) 
                    {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                case 5:
                    System.out.println("Sinh viên có chữ 'An':");
                    boolean co = false;

                    for (String s : ds) 
                    {
                        if (s.contains("An")) 
                        {
                            System.out.println(s);
                            co = true;
                        }
                    }

                    if (!co) 
                    {
                        System.out.println("Không có!");
                    }
                    break;

                case 6:
                    Collections.sort(ds);
                    System.out.println("Đã sắp xếp!");
                    break;

                case 7:
                    System.out.println("Số lượng sinh viên: " + ds.size());
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Chọn sai!");
            }

        } while (chon != 0);

        sc.close();
	}

}
