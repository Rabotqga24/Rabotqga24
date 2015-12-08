import java.util.Scanner;

public class Zadacha13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[25];
		System.out.println("Vyvedi chislo");
		int n = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 3;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (n == 0) {
				break;
			}
			arr[i] = n % 2;

			n /= 2;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 3) {
				System.out.print(arr[i] + "");
			}
		}
	}
}
