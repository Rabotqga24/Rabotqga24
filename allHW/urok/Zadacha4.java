import java.util.Scanner;
public class Zadacha4 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
	
	System.out.println("Vyvedete 1vo chislo");
	int num = sc.nextInt();
	System.out.println("Vyvedete 2ro chislo");
	int num2 = sc.nextInt();
	
	if (num >num2) {
		System.out.println(  num + "   " + num2 );
	}
	else {
		System.out.println( num2 + "    " + num);
	}
}
}
