package lib2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String[] names = { "Steve", "David", "Jack", "Micheal" };

		try (var fw = new FileWriter("c:\\imaginnovate3\\names.txt", true)) {

			for (var s : names)
				fw.write(s + "\n");

		}
	}

}
