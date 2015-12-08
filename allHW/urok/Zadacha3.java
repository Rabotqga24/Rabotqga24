import java.util.Scanner;

public class Zadacha3 {
public static void main(String[] args) {
	
	
Scanner sc = new Scanner(System.in);
	
	System.out.println("Vyvedete 1vo chislo");
	int num = sc.nextInt();
	System.out.println("Vyvedete 2ro chislo");
	int num2 = sc.nextInt();
	
//	int a, b, temp;
//	a= 3;
//	b= 4;
//	temp = a;
//	a = b;
//	b = temp;
	
	int g = num + num2;
	
	num = g - num;
	num2 = g - num2;
	System.out.println("Razmeneni stoinosti sa   " + (num) + "   "   + (num2));
	 
	

}

}
