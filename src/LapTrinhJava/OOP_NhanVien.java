package LapTrinhJava;
import java.util.Scanner;

class NhanVien
{
	private String ho;
	private String ten;
	private int soSP;
	
	// Constructor
    public NhanVien(String ho, String ten, int soSP) 
    {
        this.ho = ho;
        this.ten = ten;

        if (soSP >= 0)
        {
            this.soSP = soSP;
        } 
        else
        {
            this.soSP = 0;
        }
    }
    
    // Getter và Setter
    public String getHo() 
    {
        return ho;
    }

    public void setHo(String ho) 
    {
        this.ho = ho;
    }

    public String getTen() 
    {
        return ten;
    }

    public void setTen(String ten) 
    {
        this.ten = ten;
    }

    public int getSoSP() 
    {
        return soSP;
    }

    public void setSoSP(int soSP) 
    {

        if (soSP >= 0) 
        {
            this.soSP = soSP;
        } 
        else 
        {
            this.soSP = 0;
        }
    }
    
    // Hàm tính lương
    public double getLuong() 
    {

        double donGia;
        if (soSP >= 1 && soSP <= 199) 
        {
            donGia = 0.5;
        }
        else if (soSP >= 200 && soSP <= 399) 
        {
            donGia = 0.55;
        }
        else if (soSP >= 400 && soSP <= 599) 
        {
            donGia = 0.6;
        }
        else 
        {
            donGia = 0.65;
        }

        return soSP * donGia;
    }
    
    // Hàm xuất thông tin
    public void xuatThongTin() 
    {
        System.out.println("Họ: " + ho);
        System.out.println("Tên: " + ten);
        System.out.println("Số sản phẩm: " + soSP);
        System.out.println("Lương: " + getLuong());
    }
}

public class OOP_NhanVien 
{
	public static void main(String[] args) 
	{
		Scanner nv = new Scanner(System.in);

        // Nhập nhân viên 1
        System.out.println("Nhập nhân viên 1");

        System.out.print("Nhập họ: ");
        String ho1 = nv.nextLine();

        System.out.print("Nhập tên: ");
        String ten1 = nv.nextLine();

        System.out.print("Nhập số sản phẩm: ");
        int sp1 = nv.nextInt();
        nv.nextLine();

        // Nhập nhân viên 2
        System.out.println("\nNhập nhân viên 2");

        System.out.print("Nhập họ: ");
        String ho2 = nv.nextLine();

        System.out.print("Nhập tên: ");
        String ten2 = nv.nextLine();

        System.out.print("Nhập số sản phẩm: ");
        int sp2 = nv.nextInt();

        // Tạo đối tượng
        NhanVien nv1 = new NhanVien(ho1, ten1, sp1);
        NhanVien nv2 = new NhanVien(ho2, ten2, sp2);

        // Xuất thông tin
        System.out.println("\n--------------------*---*---*--------------------");
        System.out.println("\nThông tin nhân viên 1");
        nv1.xuatThongTin();

        System.out.println("\nThông tin nhân viên 2");
        nv2.xuatThongTin();

        nv.close();

	}

}
