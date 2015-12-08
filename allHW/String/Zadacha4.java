import java.util.Scanner;

public class Zadacha4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete imenata na 2ma choveka, razdeleni s zapetaq i interval ");
		String names = sc.nextLine();
		String name2 = "";
		int sum = 0;
		int sumMax = 0;
		for (int i = 0; i < names.length(); i++) {
			if (names.charAt(i) == ',') {
				name2 = names.substring(0, i);
				sumMax = sum;
				sum = 0;
				i += 3;
			}
			sum += names.indexOf(names.charAt(i));
		}
		for (int i = 0; i < names.length(); i++) {
			if (names.charAt(i) == ',') {
				names = names.substring(i + 2, names.length());
			}
		}
		if (sum < sumMax) {
			System.out.println(name2);
		} else {
			System.out.println(names);
		}

	}
}
