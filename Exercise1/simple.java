package Exercise1;

import java.util.Scanner;

public class simple {
	public static void main(String[] args) {
		int range = 100;
		int g=0;
		for (int k = 1; k < range; k++) {
			
			boolean flag = false;
			int num = k;
			for (int i = 2; i <= num / 2; ++i) {
				// condition for nonprime number
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
			if (g == 3) {
				if (!flag)
					System.out.println(num + " is a prime number.");
				else
					System.out.println(num + " is not a prime number.");
				
				g=0;
			}
		}
	}
}