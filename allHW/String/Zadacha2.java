import java.util.Scanner;

public class Zadacha2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi pyrvata duma");
		String word = sc.nextLine();
		System.out.println("Vyvedi vtorata duma");
		String word2 = sc.nextLine();
		
		if(word.length()==word2.length()){
			System.out.println(word.length()+" "+ word);
		}

		if (word.length() > word2.length()) {
			word = word.substring(5, word.length());
			//System.out.println(word);
			word2 = word2.substring(0, 5);
			//System.out.println(word2);
			word2+=word;
			
			System.out.println(word2.length() + " " + word2);

		} else {
			if (word2.length() > word.length()) {
				word2 = word2.substring(5, word2.length());
				//System.out.println(word2);
				word = word.substring(0, 5);
				//System.out.println(word);
				word+=word2;
				System.out.println(word.length() + " " + word);
			}

		}
	}
}
