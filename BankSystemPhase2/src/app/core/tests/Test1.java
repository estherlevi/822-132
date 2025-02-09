package app.core.tests;

import app.core.Account;
import app.core.Client;

public class Test1 {

	public static void main(String[] args) {
		
		Client client = new Client(101, "Dan", 1_000);
		Account account1 = new Account(3001, 1_000);
		Account account2 = new Account(3002, 2_000);
//		Account account3 = new Account(3003, 3_000);
//		Account account4 = new Account(3004, 4_000);
//		Account account5 = new Account(3005, 5_000);
//		Account account6 = new Account(3006, 6_000);
		
		client.addAccount(account1);
		client.addAccount(account2);
//		client.addAccount(account3);
//		client.addAccount(account4);
//		client.addAccount(account5);
//		client.addAccount(account6);
		
		System.out.println(client.getBalance());
		
		System.out.println(client.getAccount(0));
		
		client.autoUpdateAccounts();
		
//		client.removeAccount(3001);
//		client.removeAccount(4001);
		
		client.deposit(100);
		client.withdraw(50);
		
		System.out.println("client's balance: " + client.getBalance());
		System.out.println("client's fortune: " + client.getFortune());
		
		

	}

}
