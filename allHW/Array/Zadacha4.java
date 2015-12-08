import java.util.Scanner;

public class Zadacha4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[8];
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Vyvedete chislo v masiva");
			arr[index] = sc.nextInt();
		}
		int g = 1;
		int h=0;
		int count=arr.length/2-1;
		int a =arr.length/2;

		while (count >= 0) {
			if (arr[a - g] != arr[a + h]) {
				System.out.println("Ne e ogledalen masiv");
				flag = false;
				break;
			}
			g++;
			h++;
			count--;
		}
		if (flag) {
			System.out.println("Ogledalen e masiva");
		}
	}
}
