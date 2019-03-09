package Inheritance1;

public class Employee {
	int id;
	String name;
	float salary;

	Employee() {

	}

	Employee(String name, int id) {
		this.name = name;
		this.id = id;

	}

	void print() {
		System.out.println("Name of Employee:" + name);
		System.out.println("Employee ID: " + id);

	}

	void calculateSalary() {
		System.out.println("Calculated Salary");
	}

}
