
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	public void changeOperationSys(String os) {
		if (os == null) {
			throw new NullPointerException();
		}
		this.operationSystem = os;
	}

	public void useMemory(int ram) {
		if (this.freeMemory >= ram) {
			this.freeMemory -= ram;
		} else {
			System.out.println("Not enough memory");
		}
	}

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win Xp";
	}

	Computer(int year, double price, int hardDiskMemory, int freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory, String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	public int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		}
		if (this.price < c.price) {
			return 1;
		}
		return 0;
	}

	public void systemOut(String nameOfComputer) {
		System.out.println(nameOfComputer + "  " + this.year + " " + this.price + " " + this.isNotebook + " "
				+ this.hardDiskMemory + " " + this.freeMemory + " " + this.operationSystem);
	}
}
