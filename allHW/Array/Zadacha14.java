
public class Zadacha14 {
	public static void main(String[] args) {
		double[] arr = { 7, 7.1, -7.1, 2, -2, -1.2, 2.3, 14, -23, 1.2, 1.1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > -3 && arr[i] < 3) {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
