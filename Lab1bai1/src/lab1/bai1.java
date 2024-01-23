/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;

public class bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoten = scanner.nextLine();
		System.out.print("Điểm TB: ");
		Double diemTB = scanner.nextDouble();
		System.out.println(hoten + " " + diemTB + "điểm.");
	}

}
