package Inheritance;

public class Bike extends Vehicle{

	String brake;
	public Bike() {
	}
	
	public Bike(String name, String color, float speed,String brake) {
		super(name, color, speed);
		this.brake = brake;
	}

	public void print() {
		super.print();
		System.out.println("Brake System= " + brake);
	}
}
