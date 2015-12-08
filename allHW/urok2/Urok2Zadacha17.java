import java.util.Scanner;

public class Urok2Zadacha17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chisloto i znak v interval [3 do 20] ");
		int n = sc.nextInt();
		/*
		 * String str = sc.next(); char z = str.charAt(0);
		 */
		char z = sc.next().charAt(0);

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row == 0 || row == n - 1 || col == 0 || col == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(z);
				}
			}
			System.out.println();
		}

	}
}
