import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Zadacha8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete golemina na masiva");
		int n = sc.nextInt();
		int count = 0;
		int countmax = 0;
		int index = 0;
		int indexmax = 0;

		int[] arr = new int[n];
		System.out.println("Vyvedete chislata na masiva");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (countmax < count) {
					countmax = count;
					indexmax = index;
					count = 0;
				}
				index = i + 1;
			}
		}
		if (countmax < count) {
			countmax = count;
			indexmax = index;
		}
		//System.out.println(countmax + 1);
		for (int i = indexmax; i <= indexmax + countmax; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
