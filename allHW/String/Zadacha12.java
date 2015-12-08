import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha12 {
	static int[] arrNum(int n) {
		int[] arr = new int[n];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = count;
			count++;

		}

		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi dyljinata na masiva");
		int num = sc.nextInt();
		
	
		System.out.println(Arrays.toString(arrNum(num)));
	}
}
