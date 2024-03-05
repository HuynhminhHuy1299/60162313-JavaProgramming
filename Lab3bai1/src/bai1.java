import java.util.Scanner;

public class bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số nguyên dương: ");
		int N = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < N; i++) {
			if (N % i == 0) {
				//Nếu N chia hết cho i, không phải số nguyên tố
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(N + " là số nguyên tố.");
		} else {
			System.out.println(N + " không phải là số nguyên tố.");
		}
	}

}