package Abstract_Classes;

public class Main {

	public static void main(String[] args) {
	//	Shape d = new Shape("name");
		Shape c1 = new Circle("Circle", 5.45f);

		Shape c2 = new Circle("Circle", 5.45f);
		c1.findArea();
		c2.findArea();
//		
//		c.printShape();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
//		System.out.println("\n");
//
//		Shape s = new Square("Square", 5f);
//		s.findArea();
//		s.printShape();
//		System.out.println("\n");
//		Shape r = new Rectangle("Rectangle", 5, 10);
//		r.findArea();
//		r.printShape();
	}

}
