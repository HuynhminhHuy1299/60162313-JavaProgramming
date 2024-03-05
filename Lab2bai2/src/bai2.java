import java.util.Scanner;

public class bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b = sc.nextDouble();
		System.out.println("Nhập hệ số c: ");
		double c = sc.nextDouble();
	// Tính delta của phương trình bậc hai bằng công thức
		double delta = b * b - 4 * a * c;
	// Kiểm tra các trường hợp a
		if ( a == 0) {
			// Nếu a == 0 thì giải phương trình bậc nhất bằng công thức
			if (b == 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				double x = -c / b;
				System.out.println("Phương trình có một nghiệm");
			}
		} else {
			// Nếu a != 0 thì biện luận theo delta
			if (delta < 0) {
				// Nếu delta < 0 thì phương trình vô nghiệm
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				//Nếu delta == 0 thì phương trình có nghiệm kép bằng công thức
				double x = -b / (2* a);
				System.out.println("Phương trình có nghiệm kép: " + x);
			} else {
				// Nếu delta > 0 thì phương trình có hai nghiệm phân biệt bằng công thức
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

}