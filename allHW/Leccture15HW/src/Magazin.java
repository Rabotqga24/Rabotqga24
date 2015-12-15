
public class Magazin {
	public static void main(String[] args) {
		Computer lenovo = new Computer(2010, 800, true, 1000, 2048, "XP");
		Computer samsung = new Computer(2011, 700, false, 1000, 2048, "Windows 10");

		lenovo.useMemory(100);
		samsung.changeOperationSys("Windows 7");
		lenovo.systemOut("Lenovo");
		samsung.systemOut("Samsung");

		int result = lenovo.comparePrice(samsung);
		switch (result) {
		case 1: {
			System.out.println("Samsung e po skup");
			break;
		}
		case -1: {
			System.out.println("Lenovo e po skyp");
			break;
		}
		case 0: {
			System.out.println("S ednakvi ceni sa");
			break;
		}
		}
	}
}
