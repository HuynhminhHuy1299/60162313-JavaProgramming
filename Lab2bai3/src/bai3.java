import java.util.Scanner;

public class bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng trong tháng: ");
		int soDien = sc.nextInt();
		int tien;
		if (soDien <= 50) {
			//Nếu số điện sử dụng từ 0 đến 50
			tien = soDien * 1000;
		} else {
			//Nếu số điện sử dụng trên 50
			tien = 50 * 1000 + (soDien - 50) * 1200;
		}
		System.out.println("Số tiền điện phải trả: " + tien + "VND");
		
	}

}