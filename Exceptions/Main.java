package Exceptions;
import java.io.FileInputStream;
import java.io.IOException;
public class Main {

	void foo() throws IOException {
		FileInputStream din = new FileInputStream("");
	}

	void bar() {
		
			try {
				foo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		Main test = new Main();
		test.bar();

		try {
			System.out.println(9 / 0);
			
			FileInputStream din1 = new FileInputStream("");
		} catch (ArithmeticException ae) {
			System.out.println("Can't divide by 0");
		} catch (IOException io) {
			System.out.println("Some issue with IO");
		} catch (Exception e) {
			System.out.println("Some unknown error");
		} finally {
			System.out.println("Finally");
		}
	}

}
