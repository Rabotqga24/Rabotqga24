import java.util.Scanner;

public class Zadacha17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[8];
		System.out.println("Vyvedete chislata v masiva");
		for (int index = 0; index < a.length; index++) {

			a[index] = sc.nextInt();
		}

		boolean jagged = true;

		for (int index = 1; index <= a.length - 2; index++) {
			boolean greaterThanNeighbours = (a[index] > a[index + 1]) && (a[index] > a[index - 1]);
			boolean lessThanNeighbours = (a[index] < a[index + 1]) && (a[index] < a[index - 1]);

			if (!(greaterThanNeighbours || lessThanNeighbours)) {
				jagged = false;
				break;
			}
		}

		if (jagged) {
			System.out.println("Izpylnqva iziskvaniqta za zigzagoobraznost");
		} else {
			System.out.println("Ne izpylnqva iziskvaniqta");
		}

	}
}
