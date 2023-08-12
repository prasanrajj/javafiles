package lib1;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("A", 20);
		Person p2 = new Person("A", 25);
		Person p3 = new Person("A", 25);

		System.out.println(p1);
		System.out.println(p1.toString());

		System.out.println(p2 == p3);
		System.out.println(p2.equals(p3));
		
		System.out.println(p2.equals("A"));

	}

}
