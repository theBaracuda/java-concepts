package com.exception;

public class UDEBankingDemo {

	public static void main(String[] args) {
		//To illustrate the use of User Defined Exception
		BankAccount bankAccount = new BankAccount(20304560,500);
		System.out.println("Depositing Rs. 500");
		bankAccount.deposit(500);
		System.out.println("Withdrawing Rs. 2000");
		try {
			bankAccount.withdraw(2000);
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient funds, balance available: "+e.getAmount());
			e.printStackTrace();
		}
	}

}
