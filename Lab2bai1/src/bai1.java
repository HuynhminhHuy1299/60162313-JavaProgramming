import java.util.Scanner;

public class bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b = sc.nextDouble();
		
	// Kiểm tra nếu a bằng 0 thì phương trình vô nghiệm hoặc vô số nghiệm
		if ( a == 0) {
			if ( b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			//Nếu a khác 0 thì tính nghiệm x bằng công thức
			double x = -b / a;
			//Xuất nghiệm x ra màn hình
			System.out.println("Nghiệm của phương trình là: " + x);
		}
	}

}