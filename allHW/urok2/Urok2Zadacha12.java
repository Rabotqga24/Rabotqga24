
public class Urok2Zadacha12 {
public static void main(String[] args) {
	
//	int max = 999;
//	int min = 100;
//	int g=0;
//	while (max>=min){
//		g=max;
//		max--;
//		int a = g%10;
//		int b = g/10;
//		int c = g/100;
//		if (a!=b && a!=c && b!=c){
//			System.out.println(g);
//		}
//	}
	for (int min=100; min<=999 ; min++){
		int a = min%10;
		int b = (min/10)%10;
		int c = min/100;
		if (a!=b && a!=c && b!=c ){
			System.out.println(min);
		}
			
		}

}
}
