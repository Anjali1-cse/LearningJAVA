package org.cpait.bankapp.entity;

public class BankApplication {

	public static void main(String[] args) {
		Account a = new Account(5000);
//		a.withdraw(500);
//		a.deposit(1000);
//		
		Thread wife = new Thread(()->a.withdraw(1000));
		wife.setName("wife");
		
		
		Thread husband = new Thread(()->a.deposit(1000));
		husband.setName("husband");
		
		wife.start();
		husband.start();
		
		
		

	}

}