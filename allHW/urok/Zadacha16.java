import java.util.Scanner;

public class Zadacha16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Vyvedete tricifreno chislo");
	int num = sc.nextInt();	
	
	int a = num%10;
	int b = (num/10)%10;
	int c= num/100;
	
	if (c>b && b>a){
		System.out.println("Cifrite sa v nizhodqsht red");
	}else {
		if(c<b && b<a){
			System.out.println("Cifrite sa v vyzhodqsht red");
		}else {
			if (c==b && b==a){
				System.out.println("Cifrite sa ravni");
			}
			else {
				System.out.println("Cifrite sa nenaredeni");
			}
		}
	}
}
}
