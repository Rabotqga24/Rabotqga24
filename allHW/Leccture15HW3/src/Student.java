
public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private int money;

	public Student() {
		setGrade(4.0);
		setYearInCollege(1);
		setDegree(false);
		setMoney(0);
	}

	public Student(String name, String subject, int age) {
		this();
		this.setName(name);
		this.setSubject(subject);
		this.setAge(age);
	}

	public void upYear() {
		if (isDegree == false) {
			yearInCollege++;
			if (yearInCollege == 4) {
				isDegree = true;
			}
		} else {
			System.out.println("Chestito zavyrshvane");
		}

	}

	public double recieveScholarship(double min, double amount) {
		if (grade >= min && age < 30) {
			money += amount;
		}
		return money;
	}

	public void sysOutStudentInfo() {
		System.out.println(this.name + " " + this.subject + " " + this.grade + " " + this.yearInCollege + " " + this.age
				+ " " + this.isDegree + " " + this.money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		this.yearInCollege = yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
