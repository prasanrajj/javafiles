package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class UnionNames {

	public static void main(String[] args) throws IOException {
		 var lines1 = Files.readAllLines(Path.of("c:\\imaginnovate3\\names.txt"));
		 var lines2 = Files.readAllLines(Path.of("c:\\imaginnovate3\\newnames.txt"));
		 
		 var names = new TreeSet<String>(lines1);
		 names.addAll(lines2);
		 
		 for(var s : names)
			 System.out.println(s);
		 
		  
		 

	}

}
