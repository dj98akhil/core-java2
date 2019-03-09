package Generics;

public class Main {

	public static void main(String[] args) {

		Java jv = new Java();
		Tester tes = new Tester();
		Automation ato = new Automation();
		Report rt=new Report();
		Programmer p=new Programmer();
		Meeting<Tester> m1 = new Meeting<>(ato);
		Meeting<Employee> emp = new Meeting<>(p);
	
		rt.printMeetingReport(m1);
		rt.printMeetingReportTester(m1);
		Meeting<Java> m2 = new Meeting<>(jv);
		rt.printReportJava(m2);
	}

}
