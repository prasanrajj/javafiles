package lib2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadNames {
	public static void main(String[] args) throws IOException {

		var fr = new FileReader("c:\\imaginnovate3\\names.txt");
		var br = new BufferedReader(fr);

		while (true) {
			var line = br.readLine();
			if (line == null) // EOF
				break;

			System.out.println(line);
		}

		br.close();
		fr.close();

	}

}
