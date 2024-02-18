/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;

public class bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b = sc.nextDouble();
		System.out.println("Nhập hệ số c:");
		double c = sc.nextDouble();
		
	// Tính delta của phương trình bậc 2 bằng công thức
		
		double delta = b * b - 4 * a * c;
		
	// Xuất delta và căn delta ra màn hình
		
		System.out.println("Delta của phương trình bậc 2 là: " + delta);
		if (delta >= 0) {
			System.out.println("Căn delta của phương trình bậc 2 là: " + Math.sqrt(delta));
		} else {
			System.out.println("Phương trình bậc 2 không có căn delta thực");
			
		}
	}

}
