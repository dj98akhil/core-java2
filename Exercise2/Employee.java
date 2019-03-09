package Exercise2;

public class Employee {
	int id;
	String name;
	int[] marks = new int[5];
	int percentage;

	public Employee() {

	}

	public Employee(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Marks " + (i + 1) + "=" + marks[i]);
			percentage += marks[i];
		}
		percentage = percentage /= 5;
		System.out.println("Percentage= " + percentage);
		ReportCard report = new ReportCard(percentage);
		report.printGrade();
	}
}
