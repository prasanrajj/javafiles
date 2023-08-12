package lib2;

import java.util.Arrays;
import java.util.function.IntPredicate;

class TestPositive implements IntPredicate {
	@Override
	public boolean test(int value) {
		 System.out.println(value);
	     return  value >= 0;
	}
}

public class StreamDemo {

	
	public static void main(String[] args) {
		int[] a = { 10, 20, 40, 50, -20, 15, -44 };
		
		Arrays.stream(a)
		      //.filter( new TestPositive()) // IntPredicate - boolean test(int)
              .filter( v ->  v >= 0)
              .sorted()
		      // .forEach(v -> System.out.println(v));
		      .forEach(System.out::println); // IntConsumer

	}

}
