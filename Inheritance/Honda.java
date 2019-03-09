package Inheritance;

public class Honda extends Car{
	
	int strokes;
	public Honda() {
	}
	
	public Honda(String name, String color, float speed,String gearType,int strokes) {
		super(name, color, speed,gearType);
		this.strokes = strokes;
	}

	public void print() {
		super.print();
		System.out.println("Stroke= " + strokes);
	}

	
}
