
public class College {
	public static void main(String[] args) {

		Student ivan = new Student("Ivan", "Istoriq", 18);
		Student gosho = new Student("Gosho", "istoriq", 19);
		System.out.println(ivan.getName());
		ivan.setMoney(30);
		ivan.setGrade(4.67);
		gosho.setGrade(5);

		ivan.recieveScholarship(3, 13);
		System.out.println(ivan.getMoney());
		ivan.upYear();
		System.out.println(ivan.getYearInCollege());

		StudentGroup sbirka = new StudentGroup("Istoriq");

		sbirka.addStudent(ivan);
		sbirka.addStudent(gosho);
		String a = sbirka.theBestStudent();
		System.out.println(a);

	}
}
