package Exercise2;

public class ReportCard {
	int percentage;
	String grade;

	void setGrade() {
		if (percentage > 40 && percentage < 60) {
			grade = "Second class";

		} else if (percentage > 60 && percentage < 80) {
			grade = "First class";

		} else if (percentage > 80) {
			grade = "Distinction";
		}
	}

	void printGrade() {
		System.out.println("Grade=" + grade);
	}

	ReportCard(int percentage) {
		this.percentage = percentage;
		this.setGrade();

	}

}
