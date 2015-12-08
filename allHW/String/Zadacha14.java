import java.util.Scanner;

public class Zadacha14 {

	static int nFak(int n) {
		if(n<=0){
			return 1;
		}
		int num=n;

		return n*nFak(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chisloto N");
		int num = sc.nextInt();

		int a = nFak(num);
		System.out.println(a);
	}
}
