package test;

class A {
	private int v1 = 10;
	class Inner {
		public void print() {
			System.out.println(v1);
		}
	}
	public void print() {
		var obj = new Inner();
		obj.print();
	}
}
 

public class InnerTest {
	public static void main(String[] args) {
		var obj = new A();
		obj.print();
	}

}
