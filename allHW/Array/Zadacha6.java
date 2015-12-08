import java.util.Scanner;

public class Zadacha6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete razmera na 1viq masiv");
		int n = sc.nextInt();
		System.out.println("Vyvedete razmera na 2riq masiv");
		int m = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[m];
		if (arr.length == arr2.length) {
			for (int index = 0; index < arr.length; index++) {
				System.out.println("Vyvedete chislo v 1viq masiv");
				arr[index] = sc.nextInt();
			}
			for (int index = 0; index < arr2.length; index++) {
				System.out.println("Vyvedete chislo v 2riq masiv");
				arr2[index] = sc.nextInt();
			}
			int index = arr.length;
			int count = 0;
			boolean flag = true;

			while (index > 0) {
				if (arr[count] != arr2[count]) {
					System.out.println("Ne sa ednakvi");
					flag = false;
					break;
				}

				index--;
				count++;
			}
			if (flag) {
				System.out.println("Ravni sa");
			}
		} else {
			System.out.println("Ne sa s ednakyv razmer");
		}
	}
}
