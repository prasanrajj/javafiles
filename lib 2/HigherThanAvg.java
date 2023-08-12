package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HigherThanAvg {

	public static void main(String[] args) throws IOException {
		var marks = Files.lines(Path.of("c:\\imaginnovate3\\student_marks.txt"));
		
		var avg = 
			 marks
		     .mapToInt(s -> Integer.parseInt(s))
		     .average()
		     .getAsDouble();
		
		marks = Files.lines(Path.of("c:\\imaginnovate3\\student_marks.txt"));
		marks.mapToInt(s -> Integer.parseInt(s))
		     .filter( v -> v > avg)
		     .forEach(System.out::println);
		      
	}

}
