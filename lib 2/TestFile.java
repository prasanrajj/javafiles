package lib2;

import java.io.File;

public class TestFile {

	public static void main(String[] args) { 
           var t = new File("c:\\imaginnovate3");
           System.out.println(t.exists());
           System.out.println(t.isFile());
	}

}
