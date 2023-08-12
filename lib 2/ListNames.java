package lib2;

import java.util.ArrayList;

public class ListNames {

	public static void main(String[] args) {
		 var names = new ArrayList<String>();
		 
		 names.add("Jack");
		 names.add(0, "Larry");
		 names.add("Mark");
		 names.add("Andy");
		 
		 names.sort(null);
		 
		 for(var n : names) 
			 System.out.println(n);

	}

}
