import java.util.Scanner;
public class Urok2Zadacha13 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Vyvedi sbor na 3te chisla ");
	int n = sc.nextInt();

	for (int min = 100; min <= 999; min++) {
		int a = min % 10;
		int b = (min / 10) % 10;
		int c = min / 100;
		int g = a+b+c;
		if ( g==n){
			System.out.println(min);
		}
	}


}
}
