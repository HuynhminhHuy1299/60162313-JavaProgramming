/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class bai2 {

	public class SanPham {
	    private String tenSp;
	    private double donGia;
	    private double giamGia;

	    public SanPham(String tenSp, double donGia, double giamGia) {
	        this.tenSp = tenSp;
	        this.donGia = donGia;
	        this.giamGia = giamGia;
	    }

	    public void nhap() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tên sản phẩm: ");
	        tenSp = scanner.nextLine();
	        System.out.print("Nhập đơn giá: ");
	        donGia = scanner.nextDouble();
	        System.out.print("Nhập giảm giá: ");
	        giamGia = scanner.nextDouble();
	    }

	    public void xuat() {
	        System.out.println("Tên sản phẩm: " + tenSp);
	        System.out.println("Đơn giá: " + donGia);
	        System.out.println("Giảm giá: " + giamGia);
	    }

	    public static void main(String[] args) {
	        SanPham sp1 = new SanPham("", 0, 0);
	        SanPham sp2 = new SanPham("", 0, 0);

	        System.out.println("Nhập thông tin sản phẩm 1:");
	        sp1.nhap();

	        System.out.println("Nhập thông tin sản phẩm 2:");
	        sp2.nhap();

	        System.out.println("Thông tin sản phẩm 1:");
	        sp1.xuat();

	        System.out.println("Thông tin sản phẩm 2:");
	        sp2.xuat();
	    }
	}

}
