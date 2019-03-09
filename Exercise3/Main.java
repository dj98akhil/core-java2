package Exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Employee e = new Employee();
		Address a = new Address();

		System.out.println("Enter id,name and salary");
		e.setId(scan.nextInt());
		e.setName(scan.next());
		e.setSalary(scan.nextFloat());

		System.out.println("Enter city, state and pincode");
		a.setCity(scan.next());
		a.setState(scan.next());
		a.setPincode(scan.next());

		System.out.println("Enter address line");
		scan.nextLine();
		a.setLine(scan.nextLine());
		
		System.out.println("Enter number of certificates");
		Certificate[] c = new Certificate[scan.nextInt()];
		for (int i = 0; i < c.length; i++) {
			System.out.println("Enter Certificate Name,University and Grade for " + (i + 1));

			Certificate temp = new Certificate();
			temp.setCertificateName(scan.next());

			temp.setUniversity(scan.next());

			temp.setGrade(scan.next());

			c[i] = temp;
		}

		e.setAddress(a);
		e.setCertificate(c);

		e.printEmployee();
	}

}
