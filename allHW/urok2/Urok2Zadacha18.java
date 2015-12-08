import java.util.Scanner;

public class Urok2Zadacha18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chisloto N i chisloto M v interval ot [1 do 9] ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for (int a=1; a<=num1; a++){
			for(int b=1; b<=num2; b++){
				System.out.println(a+"*"+b+" = "+(a*b)+";");
			}
		}System.out.println("");
	}
}
