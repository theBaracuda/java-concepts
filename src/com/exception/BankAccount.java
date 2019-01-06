package com.exception;

class BankAccount{
	private double balance;
	private int number;
	
	BankAccount(int number, double balance){
		this.number=number;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposit Successul!");
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdrawal Successul!");
		}else {
			double needs;
			needs=amount-balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}