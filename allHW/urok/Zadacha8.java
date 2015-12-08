import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vyvedete chislo v interval ot 1000 da 9999");
		int num = sc.nextInt();

		if (((num > 9999) || (num < 1000))) {
			System.out.println("Nepravilno vyvedeno chislo");
			return;
		}

		int a = (((num / 1000) * 10) + (num % 10));
		int b = (((num / 10) % 10) + ((num / 100) % 10) * 10);

		if (a > b) {
			System.out.println("po golqmo " + "(" + a + ">" + b + ")");

		}
		if (a < b) {
			System.out.println("po malko " + "(" + a + "<" + b + ")");
		} 
		if (a==b) {
			System.out.println("ravni " + "(" + a + "=" + b + ")");
		}
	}
}
