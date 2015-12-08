import java.util.Scanner;

public class Urok2Zadacha11 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Vyvedete chisloto N:");
	int n = sc.nextInt();
	
	int colCount = (n*2)-1;
	for(int row=0; row<n; row++){
		for(int col=0;col<colCount;col++){
			if (col<colCount/2-row || col>colCount/2+row)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println("");
	}

}
}
