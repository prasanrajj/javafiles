package oop2;

interface Task {
	void process();
}

class DoSomething implements Task {
	@Override
	public void process() {
		System.out.println("Doing something!!!");
	}
}
public class AnonymousDemo {

	public static void main(String[] args) {
		 Task t = new DoSomething();
		 t.process();
		 
		 Task t2 = new Task() {
				public void process() {
					System.out.println("Doing something else!!!");
				}
		 };
		 
		 System.out.println(t2.getClass());
		 t2.process();

	}

}
