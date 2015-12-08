import java.util.Scanner;

public class Zadacha7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vyvedete vreme");
		int time = sc.nextInt();
		System.out.println("Vyvedete pari");
		double money = sc.nextDouble();
		System.out.println("Zdrav ili bolen");
		boolean health = sc.nextBoolean();

		if (health == false) {
			System.out.println("Bolqn sym, nqma da izlizam");
			if (money > 0) {
				System.out.println("Shte si kupq lekarstwa");
			} else {
				System.out.println("Stoq v kashti i piq chai");
			}
		} else {
			if (money > 0) {
				System.out.println("Otivam na kino s priqteli");
				if (((money > 0) && (money < 10))) {
					System.out.println("Otivam na kafe");
				}
			}

		}

	}
}
