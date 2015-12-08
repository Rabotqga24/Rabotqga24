import java.util.Scanner;

public class Urok2Zadacha24 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Vyvedi chislo ot intervala [10 do 30000]");
	int num = sc.nextInt();
	//int num = 4519;
	int newNumber = 0;
	int y =num;
	do{
		// get the last digit
		int digit = num % 10;
		
		// shift left and add current digit 
		newNumber *= 10;
		newNumber += digit;
		
		// remove the last digit
		num /= 10;
	}while (num > 0) ;
	
	if(y==newNumber){
		System.out.println("Palindrom e");
	}else {
		System.out.println("Ne e palindrom");
	}

	
	
}
}
