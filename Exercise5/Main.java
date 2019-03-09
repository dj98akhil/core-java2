package Exercise5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noExam;
		int examTotal = 0;
		int studentTotal = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of Students");
		int studentNo = scan.nextInt();
		Student[] stu = new Student[studentNo];
		for (int j = 0; j < studentNo; j++) {

			Student s = new Student();
			System.out.println("\n\nEnter Student Name:");
			s.setName(scan.next());
			System.out.println("Enter Student id:");
			s.setId(scan.nextInt());
			System.out.println("Enter no of exams");
			noExam = scan.nextInt();
			Exam[] exam = new Exam[noExam];

			for (int i = 0; i < noExam; i++) {
				Exam temp = new Exam();
				System.out.println("Enter exam Name " + (i + 1));
				temp.setName(scan.next());
				System.out.println("Enter Total marks");
				temp.setTotalMarks(scan.nextInt());
				examTotal += temp.totalMarks;
				System.out.println("Enter Marks Obtained");
				temp.setMarks(scan.nextInt());
				studentTotal += temp.marks;
				exam[i] = temp;

			}

			s.setExam(exam);
			stu[j] = s;
		}
		for (Student student : stu) {

			student.printResult();
			

		}
		System.out.println("\n\nExam Total marks:" + examTotal + "\n Marks Obtained: " + studentTotal);
		float per = (float) studentTotal / examTotal*100;
		System.out.println(" Class Percentage:" + per);
		ReportCard r = new ReportCard(per);
	}
}
