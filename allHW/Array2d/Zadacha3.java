
public class Zadacha3 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = { { 4, 5, 3, 2 }, { 7, 8, 3, 2 }, { 5, 6, 7, 1 }, { 3, 3, 2, 1 } };

		for (int i = 0; i < arr.length; i++) {
			for (int c = 0; c < arr[i].length; c++) {
				sum += arr[i][c];
			}
		}
		double aver = sum;
		System.out.println("Sumata e = " + sum);
		System.out.println("Srednoaritmetichno = " + aver / 16);
	}
}
