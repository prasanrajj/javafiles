package basics;

public class FunDemo {

	static int add(int a, int b) {
        return a + b;
	}
	
	static int total(int ... nums) {
		int sum = 0;
		for(int n : nums)
			sum += n;
		
		return sum;
	}
	
	

	public static void main(String[] args) {
         System.out.println(add(10,20));
         System.out.println(total(1,2,3,4));
         System.out.println(total(1,2,3,4, 10,20));
         
         // wish("Hello", "Jack","Mark")
	}

}
