/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class bai1 {
	public class SanPham{
		private String tenSp;
		private double donGia;
		private double giamGia;
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public double getThueNhapKhau() {
		return donGia * 0.1;
	}
	public void xuatThongTin() {
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tenSp = scanner.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia = scanner.nextDouble();
		System.out.print("Nhập giảm giá: ");
		giamGia = scanner.nextDouble();
	}
	public static void main(String[] args) {
		SanPham sp = new SanPham("", 0, 0);
		sp.nhap();
		sp.xuatThongTin();
	}
}
}
