package lib1;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person other) {
			return this.age == other.age && this.name.equals(other.name);
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return this.age;
	}
}
