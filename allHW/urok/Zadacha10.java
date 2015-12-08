import java.util.Scanner;

public class Zadacha10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vyvedete chislo v interval ot 10 do 9999");
		int obem = sc.nextInt();
		int a = obem / 5;
		int b = obem % 5;
		if(b==0){
			System.out.println( a + " pyti po 2 litra");
			System.out.println( a + " pyti po 3 litra");
			System.out.println("nqma dopylnitelno kofi");
		}

		if (b == 1) {
			System.out.println((a - 1) + " pyti po 2 litra");
			System.out.println((a - 1) + " pyti po 3 litra");
			System.out.println("dopylnitelno dve kofi ot 3 litra");
		}
		if (b == 2) {
			System.out.println(a + " pyti po 2 litra");
			System.out.println(a + " pyti po 3 litra");
			System.out.println("dopylnitelno  1 kofa ot 2 litra");
		}
		if (b == 3) {
			System.out.println(a + " pyti po 2 litra");
			System.out.println(a + " pyti po 3 litra");
			System.out.println("dopylnitelno 1 kofa ot 3 litra");
		}
		if(b==4){
			System.out.println( a + " pyti po 2 litra");
			System.out.println( a + " pyti po 3 litra");
			System.out.println("dopylnitelno dve kofi ot 2 litra");
		}

	}
}
