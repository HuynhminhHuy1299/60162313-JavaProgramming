/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;

public class bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài HCN: ");
		double dai = scanner.nextDouble();
		System.out.print("Nhập chiểu rộng HCN: ");
		double rong = scanner.nextDouble();
		
		double ChuVi = (dai + rong) * 2;
		double DienTich = dai * rong;
		double CanhNhoNhat = Math.min(dai, rong);
		
		System.out.println("Chu vi HCN là: " + ChuVi);
		System.out.println("Diện tích HCN là: " + DienTich);
		System.out.println("Cạnh nhỏ nhất HCN là: " + CanhNhoNhat);
	}

}
