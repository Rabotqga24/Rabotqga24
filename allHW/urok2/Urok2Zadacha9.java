import java.util.Scanner;

public class Urok2Zadacha9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete chisloto A");
		int a = sc.nextInt();
		System.out.println("Vyvedete chisloto B ");
		int b = sc.nextInt();
		// if (a <= b) {
		// for (; a <= b; a++) {
		// if(a%3==0){
		// System.out.println("skip 3"+a);
		// a++;
		//
		// }
		// System.out.println(a * a + ", ");
		//
		// }
		// } else {
		//
		// for (; b <= a; b++) {
		// System.out.println((b * b + ", "));
		// }
		// }
		int max = 0;

		if (a <= b) {
			while (a <= b) {
				if ((a * a) % 3 == 0) {
					System.out.print("skip 3, ");
					a++;
				} else {
					System.out.print((a * a) + ", ");
					a++;
					max += a * a;
					if (max >= 200) {
						break;
					}

				}

			}
		} else {
			if (b <= a) {

				while (b <= a) {
					if ((b * b) % 3 == 0) {
						System.out.print("skip 3, ");
						b++;
					} else {
						System.out.print((b * b) + ", ");
						b++;
						max += b * b;
						if (max >= 200) {
							break;
						}
					}

				}
			}
		}
	}
}
