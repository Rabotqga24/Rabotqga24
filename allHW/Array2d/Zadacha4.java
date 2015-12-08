import java.util.Arrays;

public class Zadacha4 {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] arr2 = new int[4][4];
		int row = 3;
		int col = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int c = 0; c < arr2[i].length; c++) {
				if (row < 0) {
					row = 3;
				}
				arr2[i][c] = arr[row][col];

				row--;
			}
			col++;
		}
		System.out.println(Arrays.deepToString(arr2));
	}
}
