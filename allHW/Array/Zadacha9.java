import java.util.Scanner;

public class Zadacha9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete golemina na masiva");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Vyvedete chislata na masiva");
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		int m = arr.length / 2 - 1;
		int index = 0;
		int k = 0;
		while (index <= m) {
			k = arr[index];
			arr[index] = arr[arr.length - 1 - index];
			arr[arr.length - 1 - index] = k;
			index++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
