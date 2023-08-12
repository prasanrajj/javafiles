package lib2;

import java.time.LocalDate;

public class GenericMethods {

//	public static void print(String[] a) {
//		for (var e : a) {
//			System.out.println(e);
//		}
//	}
//
//	public static void print(LocalDate[] a) {
//		for(var e : a) {
//			System.out.println(e);
//		}
//	}

	// Generic Method 
	public static <T> void printArray(T [] a) {
		for(var e : a) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		   String s[] = new String[10];
		   Course c[] = new Course[10];
		   int [] i  = new int[10];
		   
           printArray(s);  // T becomes String
           printArray(c);  // T becomes Course 
           //printArray(i);
	}

}
