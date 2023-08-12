package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Top5Marks {

	public static void main(String[] args) throws IOException {
		Files.lines(Path.of("c:\\imaginnovate3\\student_marks.txt"))
		     .mapToInt(s -> Integer.parseInt(s) * -1)
		     .sorted()
			 .limit(5)
	     	 .forEach(v -> System.out.println(v * -1));
	}
}
