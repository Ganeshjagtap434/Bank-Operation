package com.corejava.bankingopeartion;

import java.time.LocalDate;

public class SalaryAccount extends SavingAccount{
	
	int monthsLastTransaction;
	
	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int monthsLastTransaction) {
		super();
		this.monthsLastTransaction = monthsLastTransaction;
	}

	public SalaryAccount(double minBalance) {
		super(minBalance);
		// TODO Auto-generated constructor stub
	}

	public SalaryAccount(int accNo, String accName, double balance, double interest, String branchNo,
			LocalDate openDate) {
		super(accNo, accName, balance, interest, branchNo, openDate);
		// TODO Auto-generated constructor stub
	}

	public int getMonthsLastTransaction() {
		return monthsLastTransaction;
	}

	public void setMonthsLastTransaction(int monthsLastTransaction) {
		this.monthsLastTransaction = monthsLastTransaction;
	}

	@Override
	public double getMinBalance() {
		// TODO Auto-generated method stub
		return super.getMinBalance();
	}

	@Override
	public void setMinBalance(double minBalance) {
		// TODO Auto-generated method stub
		super.setMinBalance(minBalance);
	}

	@Override
	public void accOpen() {
		// TODO Auto-generated method stub
//		super.accOpen();
	}

	@Override
	public void accClose() {
		// TODO Auto-generated method stub
//		super.accClose();
	}

	@Override
	public void deposite(double amount) {
		if (amount > 0) {
            super.deposite(amount);
            monthsLastTransaction = 0;
            System.out.println("Deposited Rs. " + amount + " into Salary Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
		super.deposite(amount);
	}

	@Override
	public void withdraw(double amount) {
		 if (amount > 0 && (balance - amount) >= minBalance) {
	            super.withdraw(amount);
	            monthsLastTransaction = 0;
	            System.out.println("Withdrawn Rs. " + amount + " from Salary Account.");
	        } else {
	            System.out.println("Insufficient funds or invalid withdrawal amount.");
	        }
		super.withdraw(amount);
	}

	@Override
	public void calInterest() {
		double monthlyBonus = 500.0; 
        balance += monthlyBonus;
        System.out.println("Monthly bonus of Rs. " + monthlyBonus + " credited to Salary Account.");
		super.calInterest();
	}

	@Override
	public void currentBalance() {
		// TODO Auto-generated method stub
		super.currentBalance();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Account Type: Salary");
        System.out.println("Months Since Last Transaction: " + monthsLastTransaction);
		
	}
	
	

}
