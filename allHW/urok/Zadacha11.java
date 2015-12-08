import java.util.Scanner;

public class Zadacha11 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Vyvedete tricifreno chislo, koeto da ne vkluchva 0");
	int num = sc.nextInt();	
	
	int a = num%10;
	int b = (num/10)%10;
	int c= num/100;
	
	if ((num%a==0) && (num%b==0) && (num%c==0)) {
		System.out.println("Chisloto se deli na svoite cifri");
	}
	else {
		System.out.println("Chisloto ne se deli na cifrite si");
	}
}
}
