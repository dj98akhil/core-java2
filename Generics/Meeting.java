package Generics;

public class Meeting< M extends Employee> {
	M head;
	
	public Meeting(M head) {
		System.out.println("The head of meeting is :"+head.getClass().getSimpleName());
		
	}
	public void report(Meeting<?> sc) {
		
		System.out.println("The report is printed for "+sc.getClass().getSimpleName());
	}
	

}
