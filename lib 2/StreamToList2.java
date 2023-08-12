package lib2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamToList2 {
	public static void main(String[] args) {
		String [] values = { "Abc","Xyz", "Pqr", "Def" };
		
		var s = Arrays.stream(values);
		
		var l = s.collect(Collectors.toList());
		      
        System.out.println(l);
	}
}
