package LapTrinhJava;

public class Duong_dan_bai_hat {

	public static void main(String[] args) {

        String path = "D:/music/bolero/longme.mp3";

        // Lấy tên file: longme.mp3
        int viTriCuoi = path.lastIndexOf("/");
        String tenFile = path.substring(viTriCuoi + 1);
        System.out.println("Tên file: " + tenFile);

        // Lấy tên bài hát: longme
        int viTriCham = tenFile.lastIndexOf(".");
        String tenBaiHat = tenFile.substring(0, viTriCham);
        System.out.println("Tên bài hát: " + tenBaiHat);
    }

}
