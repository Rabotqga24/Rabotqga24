import java.util.Scanner;

public class Zadacha10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] arr = new float[7];
		System.out.println("Vyvedete chislata na masiva");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		float mid = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6]) / 7;

		float min = arr[0] - mid;
		int newMax = 0;
		if (min < 0) {
			min *= -1;
		}
		for (int i = 1; i < arr.length; i++) {

			float max = arr[i] - mid;
			if (max < 0) {
				max *= -1;
			}
			if (min > max) {
				min=max;
				newMax = (int) arr[i];
			}

		}
		System.out.print(newMax);
		// System.out.println(min);
	}
}
