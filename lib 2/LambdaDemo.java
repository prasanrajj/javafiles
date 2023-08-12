package lib2;

interface Task  {
	void process();
}

public class LambdaDemo {
	public static void print() {
		for(int i = 1; i <= 5; i ++)
			 System.out.println(i);
	}

	public static void main(String[] args) {
		Task t1 = () -> System.out.println("Task1");
		t1.process();
		//System.out.println(t1.getClass());
		
		// Lambda Block 
		Task t2 = () -> {
			 for(int i = 1; i <= 5; i ++)
				 System.out.println(i);
		};
		t2.process();
		
		// Method reference 
		
		Task t3 = LambdaDemo::print;  
		t3.process();
		

	}

}
