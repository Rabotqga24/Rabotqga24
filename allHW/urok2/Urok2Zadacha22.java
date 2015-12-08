import java.util.Scanner;

public class Urok2Zadacha22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chislo ot intervala [1 do 999]");
		int a = sc.nextInt();
		int br = 1;

		// for (int max=a;max<=999;max++){
		// if(max%2==0 && max%3==0 && max%5==0){
		// System.out.print(max+", ");
		// br++;
		// }
		// if(br>=10){
		// break;
		// }
		// }

		while (a <= 999) {
			if ((a % 2 == 0) || (a % 3 == 0) || (a%5==0) ) {
				System.out.print(br+":"+a+"; ");br++;
			}
			a++;
			if(br==11){
				break;
			}
		}
	}
}
