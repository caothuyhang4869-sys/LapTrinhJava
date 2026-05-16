package LapTrinhJava;

import java.util.ArrayList;

public class MoHinhLop_C06_Tr104 
{
    public static void main(String[] args) 
    {
    	// Quản lý
        Executive ql = new Executive(
                "An",
                "Can Tho",
                "0123",
                "BH01",
                1000);

        ql.themThuong(500);

        // Hiển thị thông tin quản lý
        System.out.println("=== QUẢN LÝ ===");
        System.out.println("Tên: " + ql.ten);
        System.out.println("Địa chỉ: " + ql.diaChi);
        System.out.println("SĐT: " + ql.soDienThoai);
        System.out.println("Lương: " + ql.tinhLuong());



        // Nhân viên theo giờ
        Hourly nv = new Hourly(
                "Binh",
                "Soc Trang",
                "0456",
                "BH02",
                100);

        nv.themGio(8);

        // Hiển thị thông tin nhân viên
        System.out.println("\n=== NHÂN VIÊN ===");
        System.out.println("Tên: " + nv.ten);
        System.out.println("Địa chỉ: " + nv.diaChi);
        System.out.println("SĐT: " + nv.soDienThoai);
        System.out.println("Số giờ làm: " + nv.soGioLam);
        System.out.println("Lương: " + nv.tinhLuong());
    }
}
//====================== StaffMember ======================
abstract class StaffMember 
{
    String ten;
    String diaChi;
    String soDienThoai;

    public StaffMember(String t, String dc, String sdt) 
    {
        ten = t;
        diaChi = dc;
        soDienThoai = sdt;
    }

    public abstract double tinhLuong();
}

//====================== Volunteer ======================
class Volunteer extends StaffMember 
{
    public Volunteer(String t, String dc, String sdt) 
    {
        super(t, dc, sdt);
    }

    public double tinhLuong() 
    {
        return 0;
    }
}

//====================== Employee ======================
class Employee extends StaffMember 
{
    String soBHXH;
    double luong;

    public Employee(String t, String dc, String sdt, String bhxh, double l) 
    {
        super(t, dc, sdt);

        soBHXH = bhxh;
        luong = l;
    }

    public double tinhLuong() 
    {
        return luong;
    }
}

//====================== Executive ======================
class Executive extends Employee 
{
    double thuong;

    public Executive(String t, String dc, String sdt, String bhxh, double l) 
    {
        super(t, dc, sdt, bhxh, l);

        thuong = 0;
    }

    public void themThuong(double t) 
    {
        thuong = t;
    }

    public double tinhLuong() 
    {
        return luong + thuong;
    }
}

//====================== Hourly ======================
class Hourly extends Employee 
{
    int soGioLam;

    public Hourly(String t, String dc, String sdt, String bhxh, double l) 
    {
        super(t, dc, sdt, bhxh, l);

        soGioLam = 0;
    }

    public void themGio(int g) 
    {
        soGioLam = g;
    }

    public double tinhLuong() 
    {
        return luong * soGioLam;
    }
}

//====================== Staff ======================
class Staff 
{
    ArrayList<StaffMember> ds;

    public Staff() 
    {
        ds = new ArrayList<StaffMember>();
    }
}