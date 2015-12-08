import java.util.Scanner;

public class Zadacha14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vyvedete 1va dvoika koordinati v interval ot [1 do 8]");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Vyvedete 2ra dvoika koordinati v interval ot [1 do 8]");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		int k;
		int k2;

		if (num == 1 && num2 % 2 == 0) {
			k=1;
		} else {
			if (num == 2 && num2 % 2 == 1) {
				k=1;
			} else {
				if (num == 3 && num2 % 2 == 0) {
					k=1;
				} else {
					if (num == 4 && num2 % 2 == 1) {
						k=1;
					} else {
						if (num == 5 && num2 % 2 == 0) {
							k=1;
						} else {
							if (num == 6 && num2 % 2 == 1) {
								k=1;
							} else {
								if (num == 7 && num2 % 2 == 0) {
									k=1;
								} else {
									if (num == 8 && num2 % 2 == 1) {
										k=1;
									} else {
										k=0;
									}
								}
							}
						}
					}
				}
			}
		}
		if (num3 == 1 && num4 % 2 == 0) {
			k2=1;
		} else {
			if (num3 == 2 && num4 % 2 == 1) {
				k2=1;
			} else {
				if (num3 == 3 && num4 % 2 == 0) {
					k2=1;
				} else {
					if (num3 == 4 && num4 % 2 == 1) {
						k2=1;
					} else {
						if (num3 == 5 && num4 % 2 == 0) {
							k2=1;
						} else {
							if (num3 == 6 && num4 % 2 == 1) {
								k2=1;
							} else {
								if (num3 == 7 && num4 % 2 == 0) {
									k2=1;
								} else {
									if (num3 == 8 && num4 % 2 == 1) {
										k2=1;
									} else {
										k2=0;
									}
								}
							}
						}
					}
				}
			}
		}
		if (k==k2){
			System.out.println("S ednaktv cvqt sa poziciite");
		}
		else {
			System.out.println("Poziciite ne sa s ednakyv cvqt");
		}
	}
}
