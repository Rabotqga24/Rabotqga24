import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vyvedete rasmera na masiva");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count=99999999;
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Vyvedete chislo v masiva");
			arr[index] = sc.nextInt();
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index]%3==0 && arr[index]<count){
				count=arr[index];
			}

		}
		System.out.print("Nai malkoto chislo kratno na 3 e "+ count);
	}
}
