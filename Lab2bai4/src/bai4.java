import java.util.Scanner;

public class bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			menu();
			System.out.print("Chọn chức năng: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				giaiPTB1();
				break;
			case 2:
				giaiPTB2();
				break;
			case 3:
				tinhTienDien();
				break;
			case 4:
				System.out.println("Kết thúc chương trình.");
				break;
			default:
				System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
			}
		} while (choice != 4);
	}
	public static void menu() {
		System.out.println("+------------------------------------------------------------+");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc 2 |");
		System.out.println("| 3. Tình tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("+------------------------------------------------------------+");
	}
	public static void giaiPTB1() {
		System.out.println("Chức năng giải phương trình bậc nhất.");
	}
	public static void giaiPTB2() {
		System.out.println("Chức năng giải phương trình bậc 2.");
	}
	public static void tinhTienDien() {
		System.out.println("Chức năng tình tiền điện.");
	}
}