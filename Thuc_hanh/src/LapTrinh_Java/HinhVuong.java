package LapTrinh_Java;

public class HinhVuong extends HinhChuNhat {

    // Constructor
    public HinhVuong(String mau, double canh) {

        super(mau, canh, canh);
    }

    // Thông tin
    @Override
    public String layThongTin() {

        return "Hinh vuong"
                + "\nMau: " + mau
                + "\nCanh: " + chieuDai
                + "\nDien tich: " + tinhDienTich()
                + "\nChu vi: " + tinhChuVi();
    }
}