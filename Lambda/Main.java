package Lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Printable p1 = new Printable() {
//			@Override
//			public void print() {
//				System.out.println("Print..");
//			}
//		};
//
//		p1.print();
//
//		Printable p2 = () -> System.out.println("Instant Print..");
//		p2.print();
//
//		ParLambda par1 = new ParLambda() {
//			@Override
//			public void lambda(int x) {
//				System.out.println("Par= " + x);
//			}
//		};
//
//		par1.lambda(1);
//
//		ParLambda par2 = (x) -> System.out.println("Par Lambda= " + x);
//		par2.lambda(2);
//		String luck="Luck";
//		Predicate<String> predicate = new Predicate<String>() {
//
//			@Override
//		
//			public boolean test(String t) {
//				if (t.equals(luck))
//					return true;
//				System.out.println("The password you entered is incorrect");
//				return false;
//			}
//		};

//		Predicate<String> max = (t) -> {
//			return (t.length() <= 10) ? true : false;
//		};

		PasswordChecker pc = new PasswordChecker();

//		System.out.println("Check if password is correct");
//		pc.check("L4ck", predicate);
//
//		System.out.println("Check if string length is max 10");
//		pc.check("iamapassword", max);
		System.out.println("Please enter Password:");
		String password = scan.next();
		System.out.println("Checking if string is BornLucky and serves the conditions");
		pc.check(password, (t) -> {
			return (!t.isEmpty() && t.equals("BornLucky") && t.length() > 9) ? true : false;
		});

	}
}