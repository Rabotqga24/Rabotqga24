import java.util.Scanner;

public class Urok2Zadacha10 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	 int num = sc.nextInt();
	 int i;
	 boolean isPrime = true;
	
	 for (i=2; i <= num/2;i++){
	 if (num % i==0) {
	 System.out.println("Prosto ne e chisloto");
	 isPrime= false;
	 break;
	 }if ( isPrime=true ){
	 System.out.println("Prosto e");
	 break;
	
	 }
	 }
	
	

}
}
