package Exercise5;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	int noExams;
	int examTotal = 0;
	int studentTotal = 0;

	Exam e[];

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setExam(Exam[] exam) {
		this.e = exam;

	}

	void printResult() {
		System.out.println("Name :" + name);
		System.out.println("Identification No:" + id);
		System.out.println("Marks in each subject");

		for (int i = 0; i < e.length; i++) {
//			float per= (float)(e[i].marks/e[i].totalMarks)*100;
			System.out.println(e[i].Name + "=" + e[i].marks + "/" + e[i].totalMarks);

		}

	}
}
