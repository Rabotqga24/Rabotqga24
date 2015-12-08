import java.util.Scanner;

public class Urok2Zadacha14 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Vyvedi chisloto N v interval ot 10 do 200 ");
	int n = sc.nextInt();
	
	int num = n;
	 while ((num >= 10)) {
	 if ((num % 7 == 0) && (num <n)) {
	 System.out.println(num);
	 }
	 num--;
	 }

}
}
