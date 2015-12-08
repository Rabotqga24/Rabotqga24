
public class Zadacha6 {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sumMax = 0;
		int sumRow = 0;
		int count=2;
		for (int i = 0; i < arr.length; i++) {
			if (sumRow > 0) {
				System.out.println("Sumata na red "+count +" e "+sumRow);
				count+=2;
			}

			sumMax += sumRow;
			sumRow = 0;
			for (int c = 0; c < arr[i].length; c++) {
				if (i % 2 == 1 && i > 0) {
					sumRow += arr[i][c];
				}
			}
		}
		sumMax += sumRow;
		System.out.println("Sumata na red "+count +" e "+sumRow);
		System.out.println("Obshtata sume na redovete e "+sumMax);
	}
}
