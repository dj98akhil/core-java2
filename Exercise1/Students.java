package Exercise1;

public class Students {

	int id;
	String name;
	int[]marks = new int[5];
	float avg;
	
	Students(int id,String name, int[] marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	void print() {
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("mark"+i+"="+marks[i]);
			avg+=marks[i];
			
		}
		avg= avg/5;
		System.out.println("average="+avg);
	}
}
