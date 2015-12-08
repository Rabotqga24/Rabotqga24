import java.util.Scanner;

public class Urok2Zadacha6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete chislo");
		int num = sc.nextInt();
		int sbor = 0;
		
		if (num>=0){
		for (int min = 1; min <= num; min++) {
			sbor += min;
		}
		}
		else {
			if (num<=0){
				for (int min = 1; min >= num; min--) {
					sbor += min;
				}
			}
		}
		System.out.println(sbor);
	}
}
