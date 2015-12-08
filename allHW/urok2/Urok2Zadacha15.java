import java.util.Scanner;

public class Urok2Zadacha15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chisloto N ");
		int n = sc.nextInt();
		int g = 1;
		int sum = 0;
		if (n >= 1) {
			do {
				sum += g;
				g++;
			} while (g <= n);

			System.out.println(sum);
		} else {
			if (n < 0) {
				do {
					sum += g;
					g--;
				} while (g >= n);

				System.out.println(sum);

			}
		}
	}
}
