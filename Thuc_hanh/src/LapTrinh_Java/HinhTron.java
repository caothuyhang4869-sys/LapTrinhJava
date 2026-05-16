package LapTrinh_Java;

public class HinhTron extends Hinh {

    private double banKinh;

    // Constructor
    public HinhTron(String mau, double banKinh) {

        super(mau);

        this.banKinh = banKinh;
    }

    // Diện tích
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Chu vi
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Thông tin
    @Override
    public String layThongTin() {

        return "Hinh tron"
                + "\nMau: " + mau
                + "\nBan kinh: " + banKinh
                + "\nDien tich: " + tinhDienTich()
                + "\nChu vi: " + tinhChuVi();
    }
}