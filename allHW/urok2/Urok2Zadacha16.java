import java.util.Scanner;

public class Urok2Zadacha16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chisloto N i chisloto M v interval ot [10 do 5555] ");
		int n = sc.nextInt();
		int m = sc.nextInt();

//		if (n >= m) {
//
//			for (int del = n; (del%50) == 0; del--) {
//				System.out.println(del);
//				;
//				if (del == m) {
//					break;
//				}
//			}
//		} else {
//			if (m >= n) {
//				for (int del = m;( del % 50) == 0; del--) {
//					System.out.println(del);
//					;
//					if (del == n) {
//						break;
//
//					}
//				}
//			}
//		}
		
		if (n >= m) {
			for (; n>=m;n--){
				if ((n%50)==0){
					System.out.println(n);
				}
			}
		}else {
			if (m>n){
				for(;m>=n;m--){
					if((m%50)==0){
						System.out.println(m);
					}
				}
			}
		}
		
		
		
		
	}
}
