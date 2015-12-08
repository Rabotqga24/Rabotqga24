import java.util.Scanner;

public class Zadacha7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete golemina na masiva");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] arr2 = new int[n];
		

		for (int index = 0; index < arr.length; index++) {
			System.out.println("Vyvedete chislo v masiva");
			arr[index] = sc.nextInt();
		}
		for (int index = 1; index < arr2.length - 1; index++) {

			arr2[index] = arr[index - 1] + arr[index + 1];

		}
		arr2[0]=arr[1];
		arr2[arr.length - 1] = arr[arr.length - 2];
		for (int index = 0; index < arr2.length; index++) {
			System.out.print(arr2[index] + " ");
		}

	}
}
