package LapTrinh_Java;

public class HinhChuNhat extends Hinh {

    protected double chieuDai;
    protected double chieuRong;

    // Constructor
    public HinhChuNhat(String mau, double chieuDai, double chieuRong) {

        super(mau);

        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Diện tích
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Chu vi
    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    // Thông tin
    @Override
    public String layThongTin() {

        return "Hinh chu nhat"
                + "\nMau: " + mau
                + "\nChieu dai: " + chieuDai
                + "\nChieu rong: " + chieuRong
                + "\nDien tich: " + tinhDienTich()
                + "\nChu vi: " + tinhChuVi();
    }
}