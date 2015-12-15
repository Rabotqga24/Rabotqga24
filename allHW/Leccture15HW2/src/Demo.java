
public class Demo {
	public static void main(String[] args) {
		Task kyrtq = new Task("Kyrtq", 7);

		kyrtq.setName("Kyrtq i Probivam");
		System.out.println(kyrtq.getName());
		Employee ivan = new Employee("Ivan");
		if(!ivan.setHoursLeft(7)){
			System.out.println("Chasovete za rabota na ivan ne moje da sa po malki ot 0");
			return;
		}
		ivan.setCurrentTask(new Task("Leti", 6));
	
		ivan.work();
		ivan.showReport();
	}
}
