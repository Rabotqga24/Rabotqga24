import java.util.Scanner;

public class Zadacha3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete chislo");
		int num = sc.nextInt();

		int[] arr = new int[10];
		arr[0] = num;
		arr[1] = num;

		for (int index = 2; index < arr.length; index++) {
			// while (index < 2) {
			arr[index] = arr[index - 1] + arr[index - 2];
			// }

		}
		for (int index=0 ; index < arr.length;index++){
			System.out.print(arr[index] + " ");
		}
	}
}
