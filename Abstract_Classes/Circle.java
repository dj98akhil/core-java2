package Abstract_Classes;
public class Circle extends Shape {

	float radius;

	public Circle() {

	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", name=" + name + ", area=" + area + ", \ngetClass()=" + getClass().getSimpleName()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Circle && this.area == ((Circle) obj).area) ? true : false;
	}
	@Override
	public void findArea() {
		area = 3.14f * radius * radius;
	}

	@Override
	public void printShape() {
		System.out.println("Radius= " + radius);
		super.printShape();
	}

}