package Bai4_java;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {

	static ArrayList<Invoice> ds = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ================= NHẬP DANH SÁCH =================
    public static void nhapDanhSach() {

        ds.clear();

        int n;

        do {
            System.out.print("Nhap so luong Invoice (>=10): ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 10);

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice thu " + (i + 1));

            String ma;

            while (true) {
                System.out.print("Nhap ma hang: ");
                ma = sc.nextLine();

                if (timTheoMa(ma) == null)
                    break;

                System.out.println("Ma hang da ton tai!");
            }

            System.out.print("Nhap mo ta: ");
            String mota = sc.nextLine();

            System.out.print("Nhap so luong: ");
            int sl = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap gia: ");
            double gia = Double.parseDouble(sc.nextLine());

            Invoice iv = new Invoice(ma, mota, sl, gia);

            ds.add(iv);
        }

        System.out.println("Nhap danh sach thanh cong!");
    }

    // ================= XUẤT DANH SÁCH =================
    public static void xuatDanhSach() {

        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (Invoice iv : ds) {
            System.out.println("----------------------");
            System.out.println(iv);
        }
    }

    // ================= TÌM KIẾM =================
    public static Invoice timTheoMa(String ma) {

        for (Invoice iv : ds) {
            if (iv.getPartNumber().equalsIgnoreCase(ma))
                return iv;
        }

        return null;
    }

    public static void timInvoice() {

        System.out.print("Nhap ma can tim: ");
        String ma = sc.nextLine();

        Invoice iv = timTheoMa(ma);

        if (iv != null) {
            System.out.println("Tim thay:");
            System.out.println(iv);
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    // ================= XÓA =================
    public static void xoaInvoice() {

        System.out.print("Nhap ma can xoa: ");
        String ma = sc.nextLine();

        Invoice iv = timTheoMa(ma);

        if (iv != null) {
            ds.remove(iv);
            System.out.println("Da xoa!");
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    // ================= SẮP XẾP THEO MÃ =================
    public static void sapXepTheoMa() {

        for (int i = 0; i < ds.size() - 1; i++) {

            for (int j = i + 1; j < ds.size(); j++) {

                if (ds.get(i).getPartNumber()
                        .compareToIgnoreCase(ds.get(j).getPartNumber()) > 0) {

                    Invoice temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }

        System.out.println("Da sap xep theo ma hang!");
    }

    // ================= SẮP XẾP THEO SỐ LƯỢNG =================
    public static void sapXepTheoSoLuong() {

        for (int i = 1; i < ds.size(); i++) {

            Invoice x = ds.get(i);

            int j = i - 1;

            while (j >= 0 &&
                    ds.get(j).getQuantity() > x.getQuantity()) {

                ds.set(j + 1, ds.get(j));

                j--;
            }

            ds.set(j + 1, x);
        }

        System.out.println("Da sap xep theo so luong!");
    }

    // ================= MOCK DATA =================
    public static void taoDuLieuMau() {

        ds.clear();

        ds.add(new Invoice("MH01", "RAM Kingston", 5, 350000));
        ds.add(new Invoice("MH02", "SSD Samsung", 3, 1200000));
        ds.add(new Invoice("MH03", "CPU Intel i5", 2, 5500000));
        ds.add(new Invoice("MH04", "Mainboard Asus", 4, 2500000));
        ds.add(new Invoice("MH05", "Nguon Corsair", 6, 1800000));
        ds.add(new Invoice("MH06", "Case Gaming", 7, 900000));
        ds.add(new Invoice("MH07", "VGA RTX 4060", 1, 12000000));
        ds.add(new Invoice("MH08", "Chuột Logitech", 10, 450000));
        ds.add(new Invoice("MH09", "Bàn phím cơ", 8, 700000));
        ds.add(new Invoice("MH10", "Màn hình Dell", 2, 4200000));

        System.out.println("Da tao du lieu mau!");
    }

    // ================= MENU =================
    public static void menu() {

        int chon;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Tao du lieu mau");
            System.out.println("2. Nhap danh sach Invoice");
            System.out.println("3. Xuat danh sach");
            System.out.println("4. Sap xep theo ma hang");
            System.out.println("5. Sap xep theo so luong");
            System.out.println("6. Tim Invoice theo ma");
            System.out.println("7. Xoa Invoice theo ma");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {

                case 1:
                    taoDuLieuMau();
                    break;

                case 2:
                    nhapDanhSach();
                    break;

                case 3:
                    xuatDanhSach();
                    break;

                case 4:
                    sapXepTheoMa();
                    break;

                case 5:
                    sapXepTheoSoLuong();
                    break;

                case 6:
                    timInvoice();
                    break;

                case 7:
                    xoaInvoice();
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        menu();
    }

}
