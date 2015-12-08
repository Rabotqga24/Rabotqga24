import java.util.Scanner;

public class Zadacha5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi pyrvata duma");
		String word = sc.nextLine();
		System.out.println("Vyvedi vtorata duma");
		String word2 = sc.nextLine();

		if (word.length() <= word2.length()) {
			for (int i = 0; i < word.length(); i++) {
				System.out.println(word2.charAt(i));
				if (word.charAt(i) == word2.charAt(i)) {
					System.out.print(word2);
					break;
				}
			}
		} else {
			if (word.length() > word2.length()) {
				for (int i = 0; i < word2.length(); i++) {
					System.out.println(word.charAt(i));
					if (word.charAt(i) == word2.charAt(i)) {
						System.out.print(word2);
						break;
					}
				}
			}
		}
	}
}
