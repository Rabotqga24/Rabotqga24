import java.util.Scanner;

public class Zadacha1 {
 public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �");
		double a = sc.nextDouble();
		System.out.println("�������� �");
		double b = sc.nextDouble();
		System.out.println("�������� �");
		double c = sc.nextDouble();
		
		if ( ((c > a) && (c < b)) || ((c > b) && (c < a))) 
		{
			
			System.out.println("Chisloto " + c + " e mejdu " + a +" i " + b);
		}
		else {
			System.out.println("������� �� � ����� � � �");
		}
		
		sc.close();
}
}
