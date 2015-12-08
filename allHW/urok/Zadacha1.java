import java.util.Scanner;

public class Zadacha1 {
 public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете А");
		double a = sc.nextDouble();
		System.out.println("Въведете Б");
		double b = sc.nextDouble();
		System.out.println("Въведете Ц");
		double c = sc.nextDouble();
		
		if ( ((c > a) && (c < b)) || ((c > b) && (c < a))) 
		{
			
			System.out.println("Chisloto " + c + " e mejdu " + a +" i " + b);
		}
		else {
			System.out.println("Числото не е между А и Б");
		}
		
		sc.close();
}
}
