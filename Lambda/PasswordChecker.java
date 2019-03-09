package Lambda;

import java.util.function.Predicate;

public class PasswordChecker {

	void check(String t, Predicate<String> p) {
		if (p.test(t) == true) {
			System.out.println("Password is correct");
		} else {
			System.out.println("Incorrect Password");
		}

	}
}