/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;

public class bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh: ");
		double canh = scanner.nextDouble();
		
		double Thetichlapphuong = canh * canh * canh;
		double theTich = Math.pow(canh, 3);
		
		System.out.println("Thể tích của khối lập phương là: " + Thetichlapphuong + theTich);
	}

}
