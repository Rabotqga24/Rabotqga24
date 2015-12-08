import java.util.Scanner;

public class Urok2Zadacha19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Vyvedi chislo v interval ot [10 do 99] ");
	int num = sc.nextInt();
	
	while(num>=0){
		if (num==1){
			break;
		}else {
		if((num-1)%2==1){
			num=(num/2);
			System.out.print(num+" ");
		}
		else {
			if((num-1)%2==0){
				num=(num*3)+1;
		}
			
			System.out.print(num+ " ");}
		}
		
	}
}
}
