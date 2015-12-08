import java.util.Scanner;

public class Zadacha12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vyvedete den");
		int day = sc.nextInt();
		System.out.println("Vyvedete mesec");
		int month = sc.nextInt();
		System.out.println("Vyvedete godina");
		int year = sc.nextInt();

		if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
				|| (month == 12)) {
			if (day == 31 && month == 12) {
				day = 1;
				month = 1;
				year++;
			} else {
				if (day == 31) {
					day = 1;
					month++;
				} else {
					if (day <= 30) {
						day++;
					}
				}

			}
		}

		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			if (day == 30) {
				day = 1;
				month++;

			} else {
				if (day <= 29) {
					day++;
				}
			}

		}
		if (month == 2) {
			if(year%4==0 && year%400!=0){
				if (day==29){
					day=1;
					month++;
				}else {
					if (day<=28){
						day++;
					}
				}
			}else {
				if (day==28){
					day=1;
					month++;
				}else{
					if(day<=27){
						day++;
					}
				}
			}

		}
		System.out.println(day+" "+month+" "+ year);
	}
}
