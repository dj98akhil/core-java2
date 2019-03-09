package Inheritance1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter type of Employee:\n1.Permanent\n2.Consultant");
		int typeEmp = scan.nextInt();

		System.out.println("Enter Name:");
		String name = scan.next();
		System.out.println("Enter Employee id:");
		int id = scan.nextInt();
		System.out.println("Enter Salary:");
		float sal = scan.nextFloat();
		if (typeEmp == 1) {
			System.out.println("Enter Bonus");
			int bonus = scan.nextInt();
			Permanent_Employee p = new Permanent_Employee(name, id, sal, bonus);
			p.print();
		} else {
			System.out.println("Enter no. of days of work:");
			int noDays = scan.nextInt();
			System.out.println("Enter Incentive amount:");
			int incent = scan.nextInt();
			Consultant_Employee c = new Consultant_Employee(name, id, sal, incent, noDays);
			c.print();
		}

//	Permanent_Employee p=new Permanent_Employee("Aaqil",001,43.0f,200);
//	p.print();
//	Consultant_Employee c=new Consultant_Employee("Arshad",043,4300f,200,23);
//	c.print();

	}

}
