package com.exception;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception{
	Double amount;
	
	InsufficientFundsException(Double amount){
		this.amount=amount;
	}
	
	public Double getAmount() {
		return amount;
	}
}
