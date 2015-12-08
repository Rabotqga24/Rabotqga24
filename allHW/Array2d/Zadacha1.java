
public class Zadacha1 {
	public static void main(String[] args) {
		int[][] arr = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 }, { 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
		int max = arr[0][0];
		int min = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int c = 0; c < arr[i].length; c++) {
				if (min > arr[i][c]) {
					min = arr[i][c];
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int c = 0; c < arr[i].length; c++) {
				if (max < arr[i][c]) {
					max = arr[i][c];
				}
			}
		}
		System.out.println("Nai malko " + min);
		System.out.println("Nai golqmo " + max);

	}
}
