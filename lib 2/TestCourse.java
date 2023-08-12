package lib2;

import java.util.TreeSet;

class Course implements Comparable<Course> {
	private String title;
	private int price;

	public Course(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [title =" + title + ", price =" + price + "]";
	}

	public int hashCode() {
		return 1;
	}

	public boolean equals(Object o) {
		Course other = (Course) o;
		return this.title.equals(other.title) && this.price == other.price;
	}

	@Override
	public int compareTo(Course other) {
		 return this.title.compareTo(other.title) + this.price - other.price;
	}
}

public class TestCourse {

	public static void main(String[] args) {
		var courses = new TreeSet<Course>();
		courses.add(new Course("Java", 10_000));
		courses.add(new Course("Java", 10_000));
		courses.add(new Course("Python", 10_000));
		courses.add(new Course("JS", 5000));
		 

		for (var c : courses)
			System.out.println(c);

	}

}
