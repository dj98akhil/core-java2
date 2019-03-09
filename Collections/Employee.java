package Collections;


public class Employee implements Comparable<Employee> {
static int i=0;
	int id;
	String name;
	float salary;

	public Employee() {

	}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}

	@Override
	public String toString() {
		return "\n Employee id=" + id + "\n name=" + name + "\nsalary=" + salary + "\n";
	}

	@Override
	public int compareTo(Employee o) {
		i++;
//		System.out.println("Comparable:"+i);
		if (this.id < o.id)
			return -1;
		else if (this.id > o.id)
			return 1;
		return 0;
	}
}
