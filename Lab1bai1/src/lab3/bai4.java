/**
 * 
 */
package lab3;

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

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();

        // Khởi tạo mảng họ tên và điểm
        String[] hoTen = new String[n];
        double[] diem = new double[n];

        // Nhập thông tin cho từng sinh viên
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }

        // Xuất thông tin của từng sinh viên
        System.out.println("\nThông tin của các sinh viên:");
        for (int i = 0; i < n; i++) {
            String hocLuc = getHocLuc(diem[i]);
            System.out.printf("Họ tên: %s, Điểm: %.2f, Học lực: %s%n", hoTen[i], diem[i], hocLuc);
        }

        // Sắp xếp danh sách sinh viên tăng dần theo điểm
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    // Hoán đổi thông tin của hai sinh viên
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;
                }
            }
        }

        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Họ tên: %s, Điểm: %.2f%n", hoTen[i], diem[i]);
        }
    }

    public static String getHocLuc(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
	}

}
