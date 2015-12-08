import java.util.Scanner;

public class Zadacha9 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Vyvedete dve chisla v interval ot 10 do 99");
	System.out.println("Vyvedete 1vo chislo");
	int a = sc.nextInt();
	System.out.println("Vyvedete 2ro chislo");
	int b = sc.nextInt();
	
	int c = a*b;
	int d = c%10;
	
	if ( d%2==0) {
		System.out.println( c+ ", "+ d + " chetno");
	}
	else {
		System.out.println( c+ ", "+ d + " nechetno");
	}
	
//	boolean res = false;
//	do{
//		try{
//			System.out.println("Vyvedete 1vo chislo");
//			int a = sc.nextInt();
//			res = true;
//		}
//		catch(Exception ex){
//			sc.nextLine();
//			System.out.println("greshka. 1-nov opit, 2 krai");
//			int a = 1;
//			try{
//				a = sc.nextInt();
//			}
//			catch(Exception ex2){
//				sc.nextLine();
//			}
//			if(2==a)
//				res = true;
//		}
//	}
//	while(!res);
}
}
