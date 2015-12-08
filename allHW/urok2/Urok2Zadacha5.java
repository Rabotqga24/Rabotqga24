import java.util.Scanner;

public class Urok2Zadacha5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete 2 chisla");
		int num = sc.nextInt();
		int num2 = sc.nextInt();

		if (num <= num2) {
			while (num <= num2) {
				System.out.println(num);
				num++;
			}
		}

		else {
			while (num2 <= num) {
				System.out.println(num2);
				num2++;
			}
		}
	}
}
