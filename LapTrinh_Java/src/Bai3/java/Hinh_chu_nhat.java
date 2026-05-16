package Bai3;

public class Hinh_chu_nhat extends Hinh {

	private double chieuDai;
    private double chieuRong;

    // Constructor
    public Hinh_chu_nhat (String mau, double chieuDai, double chieuRong) {

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

        return "Hinh chu nhat\n"
                + "Mau: " + mau
                + "\nChieu dai: " + chieuDai
                + "\nChieu rong: " + chieuRong
                + "\nDien tich: " + tinhDienTich()
                + "\nChu vi: " + tinhChuVi();
    }

}
