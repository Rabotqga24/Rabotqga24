
public class Zadacha5 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int sum = 0;
		int sumRow = 0;
		int sumCol=0;
		int row = 3;
		int col = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sumRow < sum) {
				sumRow = sum;
			}
			sum=0;
			for (int c = 0; c < arr[i].length; c++) {
				sum += arr[i][c];
			}
			for (int index = 0; index < arr.length; index++) {
				if (sumCol < sum) {
					sumCol = sum;
				}
				sum=0;
				for (int c = 0; c < arr[index].length; c++) {
					sum += arr[c][index];
				}}
		}if (sumRow < sum) {
			sumRow = sum;
		}
		System.out.println("Nai golqma suma po redove= "+sumRow);
		System.out.println("Nai golqma suma po koloni= "+sumCol);
		if (sumRow>sumCol){
			System.out.println("Maksimalnata suma po redove e > ot tazi na kolonite");
		}else {
			System.out.println("Maksimalnata suma na kolonite e > ot tazi na redovete");
		}
	}
}
