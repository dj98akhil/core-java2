package Exercise2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Students");
		Employee[] employees = new Employee[scan.nextInt()];
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter information for student " + (i + 1));

			System.out.println("Enter id");
			int id = scan.nextInt();

			System.out.println("Enter name");
			String name = scan.next();
			for (int j = 0; j < marks.length; j++) {
				System.out.println("Enter marks " + (j + 1) + "=");
				marks[j] = scan.nextInt();

			}

			employees[i] = new Employee(id, name, marks);
		}
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Displaying information for employee " + (i + 1));
			employees[i].print();
		}

	}
}
