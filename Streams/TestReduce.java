package Streams;


import java.util.Arrays;

public class TestReduce {

	public static void main(String[] args) {
		String[] myArray = { "this", "is", "a", "sentence" };
		String result = Arrays.stream(myArray).reduce("Hi", (a,b ) ->   a + b+"_" );
		System.out.println(result);

		Integer[] nums = { 1, 2, 3, 4, 5 };
		Integer sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}
}
