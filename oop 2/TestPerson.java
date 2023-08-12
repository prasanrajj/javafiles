package oop2;

import java.util.Arrays;
import java.util.Comparator;

// package-level 
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}


class CompareNames implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		 return p1.getName().compareTo(p2.getName());
	}
}

class CompareAges implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		 return p1.getAge() - p2.getAge();
	}
}

public class TestPerson {
	public static void main(String[] args) {
		Person[] people = { new Person("Andy", 30), 
				            new Person("Mark", 20), 
				            new Person("Scott", 50),
				            new Person("Bill", 25) };

		Arrays.sort(people, new CompareNames());
		
		for(var p  : people)
			System.out.println(p);
				
		Arrays.sort(people, 
			new Comparator<Person> () {
			    public int compare(Person p1, Person p2) {
				    return p1.getAge() - p2.getAge();
			    }
		});
		
		Arrays.sort(people, (p1,p2) -> p1.getAge() - p2.getAge());
			 
		
		for(var p  : people)
			System.out.println(p);

	}

}
