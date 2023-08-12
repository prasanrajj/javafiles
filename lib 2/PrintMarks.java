package lib2;

import java.io.RandomAccessFile;

public class PrintMarks {

	public static void main(String[] args) throws Exception {
		try (var raf = new RandomAccessFile("c:\\imaginnovate3\\marks.dat", "rw")) {
		   int rollno = 10;
		   int pos = (rollno - 1) * 4;
		   raf.seek(pos);
		   System.out.println(raf.readInt());
		}
	}

}
