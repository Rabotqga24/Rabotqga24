import java.util.Scanner;

public class Zadacha2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Vyvedete 1vo chislo");
	int num = sc.nextInt();
	System.out.println("Vyvedete 2ro chislo");
	int num2 = sc.nextInt();
	
	int a = num+num2;
	int b = num%num2;
	int c = num-num2;
	int d = num/num2;
	int e = num*num2;
	
	System.out.println("Sybirane  " + a );
	System.out.println("Delenie s %  " + b );
	System.out.println("Izvajdane  " + c );
	System.out.println("Delenie  " + d );
	System.out.println("Umnojenie  " + e );
	
	
			
}
}
