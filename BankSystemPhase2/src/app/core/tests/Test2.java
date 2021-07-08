package app.core.tests;

import app.core.Account;
import app.core.Bank;
import app.core.Client;

public class Test2 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addClient(new Client(101, "AAA", 1500));
		
		Client cl1 = new Client(102, "bbb", 2000);
		cl1.addAccount(new Account(3001, 5000));
		cl1.addAccount(new Account(3002, 4000));
		
		bank.addClient(cl1);
		
		System.out.println("bank balance: " + bank.getBalance());
		System.out.println("clients fortune: " + bank.getClientsFortune());

	}

}
