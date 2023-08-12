package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewIOTest {

	public static void main(String[] args) throws IOException {
		  Path p = Path.of("c:\\imaginnovate3\\names.txt");
		  System.out.println(p.getClass());
	}

}
