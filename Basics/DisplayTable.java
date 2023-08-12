package basics;

public class DisplayTable {
	public static void main(String [] args) {
		 
		if (args.length == 0) {
			System.out.println("Sorry! Number is missing!");
			return;
		}
		
        int n = Integer.parseInt(args[0]); // string to int 
        
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%3d * %2d = %4d\n", n, i, n * i);
		}

	}

}
