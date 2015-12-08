import java.util.Scanner;

public class Zadacha15 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Vyvedete chas v interval ot 0 do 24");
	int time = sc.nextInt();

	if (time >=4 && time<=9) {
		System.out.println("Dobro utro " + time);
	} else {
		if (time <= 18 && time > 9) {
			System.out.println("dobyr den " + time);
		} else {
			if (time > 18 || time < 4) {
				System.out.println("Dobyr vecher " + time);
			
			}
		}
	}
}
}
