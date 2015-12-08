import java.util.Arrays;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Zadacha2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int[][] arr2 = new int[2][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedi chislata na masiva");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int c = 0; c < arr[i].length; c++) {
				arr[i][c] = sc.nextInt();
			}
		}  System.out.println(Arrays.deepToString(arr));
		arr2[0][0]=arr[0][0];
		arr2[0][1]=arr[1][1];
		arr2[0][2]=arr[2][2];
		arr2[0][3]=arr[3][3];
		arr2[1][0]=arr[0][3];
		arr2[1][1]=arr[1][2];
		arr2[1][2]=arr[2][1];
		arr2[1][3]=arr[3][0];
		
		System.out.println(Arrays.deepToString(arr2));
	}
}
