package oop2;

public class ExDemo {

	public static void main(String[] args) throws InterruptedException {
		int v = Integer.parseInt("100");
		
		Thread.sleep(1000);
		
		try {
			int n = Integer.parseInt("0");
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Sorry! Invalid Number!");
		} finally {
			System.out.println("Finally!");
		}

		System.out.println("The End");
	}

}
