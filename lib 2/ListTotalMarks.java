package lib2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListTotalMarks {

	public static void main(String[] args) {
		try {
			var fr = new FileReader("c:\\imaginnovate3\\marks.txt");
			var br = new BufferedReader(fr);// to read the file line by line

			while (true) {
				String line = br.readLine();// to read every line in buffer
				if (line == null)// EOF
					break;
				if (line.isBlank()) // ignore blank lines
					continue;

				String arr[] = line.split(",");// splitting the line by comma
				int sum = 0;
				for (int i = 1; i < arr.length; i++) {
					try {
						int marks = Integer.parseInt(arr[i]);
						sum += marks;
					} catch (Exception ex) {
						// System.out.println("Invalid Number!");
					}

				}
				System.out.printf("%-10s %6d\n", arr[0], sum);
			}
			br.close();
			fr.close();
		} catch (Exception ex) {// handling class not found error
			System.out.println(ex.getMessage());
		} // try
	} // main()

}
