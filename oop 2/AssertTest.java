package oop2;

public class AssertTest {

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}
	public static void main(String[] args) {
		 assert  isEven(10) == true : "isEven failed for even";
		 assert  isEven(11) == false : "isEven failed for odd";
	}
}
