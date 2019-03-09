package Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Car cPar = new Car("City", "Black", 20, "Auto");
//		cPar.print();
//		Bike b=new Bike("Thunderbird 350X","White",120,"ABS Enabled");
//		b.print();
//		Honda honda = new Honda("City", "Black", 20, "Auto",4);
//		honda.print();
		System.out.println("Enter no of vehicles:");
		int n = scan.nextInt();
		Vehicle[] v = new Vehicle[n];
		for (int i = 0; i < v.length; i++) {
			System.out.println("Please choose one\n1.Car\n2.Bike");
			int x = scan.nextInt();
			System.out.println("Enter Name of Vehicle:");
			String name = scan.next();
			System.out.println("Enter color:");
			String color = scan.next();
			System.out.println("Enter speed of vehicle");
			float speed = scan.nextFloat();
			switch (x) {
			case 1:
				System.out.println("Enter gear type");
				String grType = scan.next();
				v[i] = new Car(name, color, speed, grType);
				break;
			case 2:
				System.out.println("Enter Brake type");
				String brType = scan.next();
				v[i] = new Bike(name, color, speed, brType);
				break;

			}
		}
		int k=1;
		System.out.println("The details of Vehicles are:");
		for (Vehicle vehicle : v) {
			System.out.println("\nDetails of Vehicle no "+k);
			vehicle.print();
			k++;
		}
	}

}
