
public class Urok2Zadacha23 {
	public static void main(String[] args) {

		int row = 1;

		while (row < 10) {
			switch (row) {
			case 1:
				System.out.print(row + "-vi red: ");
				break;
			case 2:
				System.out.print(row + "-ri red ");
				break;
			case 3:
			case 4:
			case 5:
			case 6:
			case 9:
				System.out.print(row + "-ti red ");
				break;
			case 8:
			case 7:
				System.out.print(row + "-mi red ");
				break;
			}
			int g = row;
			while (g < 10) {
				System.out.print(row + "*" + g + "; ");
				g++;
			}
			System.out.println();
			row++;
		}
	}
}
