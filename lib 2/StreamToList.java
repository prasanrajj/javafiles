package lib2;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamToList {

	public static void main(String[] args) {
		String [] values = {"Abc","Xyz", "Pqr", "Def"};
		
		var s = Arrays.stream(values);
		
		var names = new ArrayList<String>();
      
		s.forEach( n -> names.add(n));
        
        System.out.println(names);
	}

}
