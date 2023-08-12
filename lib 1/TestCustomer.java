package lib1;

public class TestCustomer {

	public static void main(String[] args) {
	    var c1 = new Customer("Andy", "andy@gmail.com");
	    var c2 = new Customer("Andy", "andy@gmail.com");
	   
	    
	    System.out.println(c1.name());
	    System.out.println(c1.equals(c2));
	}

}
