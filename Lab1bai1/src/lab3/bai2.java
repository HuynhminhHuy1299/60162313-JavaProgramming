/**
 * 
 */
package lab3;

/**
 * 
 */
public class bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				int result = i * j;
				System.out.printf("%d x %d = %d%n", i, j, result);
			}
			System.out.println();
		}
	}

}
