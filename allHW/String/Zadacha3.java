import java.util.Scanner;

public class Zadacha3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi dvata niza(bez prazno mqsto v niza)");
		String row = sc.next();
		String row2 = sc.next();
		if (row.length() > row2.length()) {
			System.out.println("Pyrviq niz ima " + row.length() + " znaka, a vtoriq ima " + row2.length() + " znaka");
			System.out.println("Razlika po poziciq");
			for (int i = 0; i < row2.length(); i++) {
				if (row.charAt(i) != row2.charAt(i)) {

					System.out.println((i + 1) + " " + row.charAt(i) + "-" + row2.charAt(i));
				}
			}
		} else {
			if (row.length() < row2.length()) {
				System.out
						.println("Pyrviq niz ima " + row.length() + " znaka, a vtoriq ima " + row2.length() + " znaka");
				System.out.println("Razlika po poziciq");
				for (int i = 0; i < row.length(); i++) {
					if (row.charAt(i) != row2.charAt(i)) {

						System.out.println((i + 1) + " " + row.charAt(i) + "-" + row2.charAt(i));
					}
				}
			} else {
				if (row.length() == row2.length()) {
					System.out.println("Imat ednakva dyljina ");
					System.out.println("Razlika po poziciq");
					for (int i = 0; i < row.length(); i++) {
						if (row.charAt(i) != row2.charAt(i)) {

							System.out.println((i + 1) + " " + row.charAt(i) + "-" + row2.charAt(i));
						}
					}
				}
			}
		}
	}
}
