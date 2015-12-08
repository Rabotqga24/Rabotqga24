import java.util.Scanner;

public class Zadacha6 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Vyvedete 1vo chislo");
	int a1 = sc.nextInt();
	System.out.println("Vyvedete 2ro chislo");
	int a2 = sc.nextInt();
	System.out.println("Vyvedete 3to chislo");
	int a3 = sc.nextInt();
	
	
	int temp1;
	
	temp1= a1;
	
	
	a1=a2;
	a2=a3;
	a3=temp1;
	
	System.out.println("a1= " +a1 + "    a2= " +a2 +"    a3= " + a3) ;
			
}
}
