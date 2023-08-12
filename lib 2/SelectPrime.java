package lib2;

import java.util.Arrays;

public class SelectPrime {
	
	static boolean isPrime(int v) {
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 11, 22, 43, 50, 1, 89};
		
		Arrays.stream(a)
		      .sorted()
	          .filter(SelectPrime::isPrime)
		      .forEach(System.out::println);

	}

}
