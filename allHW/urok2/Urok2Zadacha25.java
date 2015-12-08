import java.util.Scanner;

public class Urok2Zadacha25 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Vyvedi chisloto N");
	int n = sc.nextInt();
	int a=2;
	int sum=1;
	
	do{
		sum=a*sum;
		a++;
		
		
	}while(a<=n);
	System.out.println(sum);
}
}
