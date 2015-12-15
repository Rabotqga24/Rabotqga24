
public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		this.groupSubject = groupSubject;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	public void setFreePlaces(int freePlaces) {
		this.freePlaces = freePlaces;
	}

	public StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	public void addStudent(Student s) {
		if (freePlaces > 0 && s.getSubject().equalsIgnoreCase(groupSubject)) {

			for (int i = 0; i < students.length; i++) {
				if (students[i] == null) {

					students[i] = s;
					freePlaces--;
					break;
				}
			}
		}
	}

	public void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	public String theBestStudent() {
		String max = students[0].getName();
		for (int i = 1; i < students.length - 1; i++) {
			if (students[i] != null) {
				if (students[i - 1].getGrade() < students[i].getGrade()) {
					max = students[i].getName();
				}
			}
		}
		return max;
	}

	public void printStudentInGroup() {
		for (int i = 0; i < students.length; i++) {
			students[i].sysOutStudentInfo();
		}
	}
}
