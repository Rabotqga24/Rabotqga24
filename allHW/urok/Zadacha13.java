import java.util.Scanner;

public class Zadacha13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vyvedete temperatura v interval ot -100 do 100");
		int t = sc.nextInt();

		if (t < -20) {
			System.out.println("Ledeno studeno " + t);
		} else {
			if (t <= 0 && t >= -20) {
				System.out.println("Studeno e " + t);
			} else {
				if (t >= 0 && t <= 15) {
					System.out.println("Hladno e " + t);
				} else {
					if (t >= 15 && t <= 25) {
						System.out.println("Toplo e " + t);
					} else {
						if (t > 25) {
							System.out.println("Goreshto e " + t);
						}
					}

				}
			}
		}
	}
}
