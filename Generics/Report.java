package Generics;

public class Report {

	public void printMeetingReport(Meeting<?> sc) {
		System.out.println("Printing Report for Everyone");
		sc.report(sc);
	}

	public void printMeetingReportTester(Meeting<? extends Tester> sc) {
		System.out.println("Printing Report for Testers only");
		sc.report(sc);
	}

	public void printReportJava(Meeting<? super Java> sc) {
		System.out.println("Printing Report Java and above only");
		sc.report(sc);
	}

}
