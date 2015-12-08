import java.util.Scanner;

public class Zadacha5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vyvedete 1vo chislo");
		int num = sc.nextInt();
		System.out.println("Vyvedete 2ro chislo");
		int num2 = sc.nextInt();
		System.out.println("Vyvedete 3to chislo");
		int num3 = sc.nextInt();

		if (((num >= num2) && (num2 >= num3))) {
			System.out.println(num + "  " + num2 + "  " + num3);
		} else {
			if (((num <= num2) && (num >= num3))) {

				System.out.println(num2 + "  " + num + "  " + num3);
			} else {
				if (((num >= num3) && (num2 <= num3))) {

					System.out.println(num + "  " + num3 + "  " + num2);
				} else {
					if (((num <= num2) && (num2 <= num3))) {

						System.out.println(num3 + "  " + num2 + "  " + num);
					} else {
						if (((num >= num2) && (num <= num3))) {

							System.out.println(num3 + "  " + num + "  " + num2);
						} else {
							if (((num <= num3) && (num2 >= num3))) {

								System.out.println(num2 + "  " + num3 + "  " + num);
							}
						}
					}
				}
			}
		}
	}
}
