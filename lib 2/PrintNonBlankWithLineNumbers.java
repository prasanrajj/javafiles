package lib2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class PrintNonBlankWithLineNumbers {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);;
//		System.out.println("Enter filename :");
//		String filename = sc.nextLine();
		String filename = "c:\\imaginnovate3\\marks.txt";
		FileReader fr;
		try {
			fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			LineNumberReader lnr = new LineNumberReader(br);
			while (true) {
				String line = lnr.readLine();
				if (line == null)
					break;
				if (line.isBlank())
					continue;
				System.out.println(lnr.getLineNumber() + " : " + line);

			}
		} catch (IOException e) {
			System.out.println("Enter valid location of file");

		}

	}

}
