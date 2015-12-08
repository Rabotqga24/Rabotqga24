import java.util.Scanner;

public class Urok2Zadacha8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete chisloto N:");
		int n = sc.nextInt();

		// for(int row=1; row<=n ; row++){
		// // System.out.println(((n-row)*10)*n);
		//
		// for (int col= 1; col<=row;col++){
		// System.out.print(col + " ");
		// }
		// System.out.println();
		// }
		
		int l = n-1;
		for( int row = 0;row<n; row++){
			
			for( int col= 0; col<n; col++){
				System.out.print(l);
			}
			System.out.println();
			l+=2;
		}
 
	}
}
