package lib1;

public class StdVsObjects {

	public static void main(String[] args) {
		 Object obj = "Abc";
		 System.out.println(obj.getClass());
         obj = 10.50;  //  Auto-boxing 
         System.out.println(obj.getClass());
         
         Double d = (Double) obj;
         double p = d;
         
	}

}
