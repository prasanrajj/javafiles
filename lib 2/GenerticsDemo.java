package lib2;

import java.util.ArrayList;
import java.util.HashMap;

public class GenerticsDemo {

	public static void main(String[] args) {
		var al = new ArrayList();  // not type-safe 
		
		al.add("Abc");
		al.add(10);
		var s = (String) al.get(0);
		 
		
		var names = new ArrayList<String>();  // type-safe 
	    System.out.println(names.get(0).toUpperCase());
	    
	    var marks = new ArrayList<Integer>();
	    marks.add(10);
		
	    
	    var count = new HashMap<String, Integer>();
	    count.put("Java", 1);
	    
//	    var s = "abc";
//	    s.split("[,:;]");
	     
		

	}

}
