import java.util.Arrays;

public class Zadacha13 {
	static int[] arrSep(int[] a, int[] b) {
		int[] arr3 = new int[a.length + b.length];
		int count = 0;
		int i = 0;
		while (i < a.length) {
			arr3[i] = a[i];
			i++;
		}
		while (i < b.length + a.length) {
			arr3[i] = b[count];
			i++;
			count++;
		}
		return arr3;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		System.out.println(Arrays.toString(arrSep(arr, arr2)));
	}
}
