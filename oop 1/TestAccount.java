package oop1;

public class TestAccount {
 	public static void main(String[] args) {
		 System.out.println(Account.getMinbal());
		 
		 
		 Account a;  // object reference 
		 
		 a = new Account(1, "Steve");   // object 
		 a.deposit(10000);
		 a.deposit(20000);
		// a.withdraw(20000);
		 System.out.println(a.getBalance());
		 
		 Account a2 = new Account(2, "Mark", 100000);
		 System.out.println(a2.getBalance());
		 
		 System.out.println(a2.getMinbal());
		 

	}

}
