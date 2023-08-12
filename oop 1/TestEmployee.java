package oop1;

abstract class Employee {
	private String name, job;

	public Employee(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.job);
	}
	
	public abstract int getSalary();
		 
}

class SalariedEmployee extends Employee {
	private int salary;

	public SalariedEmployee(String name, String job, int salary) {
		super(name, job);
		this.salary = salary;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.salary);
	}

	public int getSalary() {
		return this.salary;
	}
}

class Consultant extends Employee {
	private int hours;
	private int rate;

	public Consultant(String name, String email, int hours, int rate) {
		super(name, email);
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.hours);
		System.out.println(this.rate);
	}

	public int getSalary() {
		return this.hours * this.rate;
	}
}

class OverseasEmployee extends SalariedEmployee {
	private int allowance;

	public OverseasEmployee(String name, String email, int salary, int allowance) {
		super(name, email, salary);
		this.allowance = allowance;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.allowance);
	}

	public int getSalary() {
		return this.getSalary() + this.allowance;
	}
}

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new SalariedEmployee("Jack", "Programmer", 100000);
		e.print();  // runtime polymorphism 
		System.out.println(e.getSalary());

		e = new Consultant("Steve", "DBA", 10, 1000); // upcasting
		e.print();  // runtime polymorphism
		System.out.println(e.getSalary());

	}

}
