package org.cpait.bankapp.entity;

public class Account {
	private int balance;

	

	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	synchronized public void withdraw(int Amount) {
		System.out.println(this.balance+"Check balance by"+Thread.currentThread());
		this.balance = this.balance-Amount;
		try {
			//wait();
			Thread.sleep(85500);//milisecond
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.balance+"Check balance by"+Thread.currentThread());
		
		
	}
	synchronized 
	public void deposit(int Amount) {
		System.out.println(this.balance+"Check balance by"+Thread.currentThread());
		this.balance = this.balance+Amount;
		System.out.println(this.balance+"Check balance by"+Thread.currentThread());
		notify();
		
	}

}