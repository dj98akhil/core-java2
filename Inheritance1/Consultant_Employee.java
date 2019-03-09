package Inheritance1;

public class Consultant_Employee extends Employee {
	int incentive;
	int noDays;

	public Consultant_Employee(String name, int id, float salary, int incentive, int noDays) {
		super(name, id);
		this.incentive = incentive;
		this.noDays = noDays;
		this.calculateSalary(salary);

		// TODO Auto-generated constructor stub
	}

	void calculateSalary(float salary) {
		super.salary = salary * this.noDays + this.incentive;
	}

	void print() {
		super.print();
		System.out.println("Salary of Employee:" + super.salary);

	}

}
