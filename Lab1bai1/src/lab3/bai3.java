/**
 * 
 */
package lab3;

/**
 * 
 */
import java.util.Scanner;
import java.util.Arrays;

public class bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập số lượng phần tử của mảng
		System.out.print("Nhập số lượng phần tử của mảng: ");
		int n = sc.nextInt();
		
		//Khởi tạo mảng
		int[] arr = new int[n];
		
		//Nhập giá trị cho từng phần tử
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		//Sắp xếp mảng
		Arrays.sort(arr);
		
		//Xuất mảng sau khi sắp xếp
		System.out.println("Mảng sau khi sắp xếp:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//Xuất phần tử nhỏ nhất
		System.out.println("Phần tử nhỏ nhất trong mảng: " + arr[0]);
		
		//TÍnh trung bình cộng các phần tử chia hết cho 3 
		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 3 == 0) {
				sum += arr[i];
				count++;
			}
		}
		double average = (double) sum / count;
		System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);
	}

}
