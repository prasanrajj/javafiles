package oop1;

public class AccountArray {

	public static void main(String[] args) {
		 Account [] accounts = new Account[10];
		 
		 accounts[0] = new Account(1, "Abc", 10000);
		 
		 System.out.println(accounts[0].getBalance());
		 
	}

}
