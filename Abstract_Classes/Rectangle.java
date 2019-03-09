package Abstract_Classes;

public class Rectangle extends Shape {
	int length;
	int breadth;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void findArea() {
		area = length * breadth;
	}

	@Override
	public void printShape() {
		System.out.println("Length:" + length + "\nBreadth:" + breadth);
		super.printShape();
	}
}
