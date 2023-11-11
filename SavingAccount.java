package com.corejava.bankingopeartion;

import java.time.LocalDate;

public class SavingAccount extends Account{
	
	double minBalance=10000;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double minBalance) {
		super();
		this.minBalance = minBalance;
	}

	public SavingAccount(int accNo, String accName, double balance, double interest, String branchNo,
			LocalDate openDate) {
		super(accNo, accName, balance, interest, branchNo, openDate);
		// TODO Auto-generated constructor stub
	}
	

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public void accOpen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accClose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposite(double amount) {
		 if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited Rs. " + amount + " into Savings Account.");
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
		
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && (balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawn Rs. " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
	}

	@Override
	public void calInterest() {
		double annualInterestRate = 0.03; 
        double monthlyInterest = (balance * annualInterestRate) / 12;
        balance += monthlyInterest;
        System.out.println("Interest of Rs. " + monthlyInterest + " credited to Savings Account.");
		
	}

	@Override
	public void currentBalance() {
		System.out.println("Minimum Balance : "+this.getMinBalance());
		System.out.println("Current Balance : "+this.getBalance());
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("Minimum Balance"+ this.getMinBalance());
	}
	

}
