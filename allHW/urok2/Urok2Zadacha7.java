import java.util.Scanner;

public class Urok2Zadacha7 {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete chisloto N:");
		int n = sc.nextInt();
	
	for(int  a=3; a<=(n*3); a++){
		if (a%3==0){
			System.out.println(a);
		}
	}
}
}
