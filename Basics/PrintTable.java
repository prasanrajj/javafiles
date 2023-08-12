package basics;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number :");
		int n = s.nextInt(); // read an int

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%3d * %2d = %4d\n", n, i, n * i);
		}

	}

}
