package Inheritance1;

public class Permanent_Employee extends Employee {
	int bonus;

	public Permanent_Employee(String name, int id, float salary, int bonus) {
		super(name, id);
		this.bonus = bonus;
		this.calculateSalary(salary);
		// TODO Auto-generated constructor stub
	}

	void calculateSalary(float salary) {
		super.salary = salary + this.bonus;

	}

	void print() {
		super.print();
		System.out.println("Salary of Employee:" + super.salary);

	}

}
