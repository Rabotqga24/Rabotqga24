import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi pyrviq tekst");
		String text = sc.nextLine();
		System.out.println("Vyvedi vtoriq tekst");
		String text2 = sc.nextLine();
		
		System.out.println(text.toUpperCase()+" "+text.toLowerCase()+" "+text2.toUpperCase()+" "+ text2.toLowerCase());
	}

}
