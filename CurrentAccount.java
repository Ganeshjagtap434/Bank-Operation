package com.corejava.bankingopeartion;

import java.time.LocalDate;

public class CurrentAccount extends Account{
	
	double overdraft = 0;
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int overdraft) {
		super();
		this.overdraft = overdraft;
	}

	public CurrentAccount(int accNo, String accName, double balance, double interest, String branchNo,
			LocalDate openDate) {
		super(accNo, accName, balance, interest, branchNo, openDate);
		// TODO Auto-generated constructor stub
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
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
		if (amount > 0)
		{
            balance += amount;
            System.out.println("Deposited Rs. " + amount + " into Current Account.");
        } else 
        {
            System.out.println("Invalid deposit amount.");
        }
		
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) 
		{
            double availableBalance = balance + overdraft;
            if (availableBalance >= amount) 
            {
                balance -= amount;
                System.out.println("Withdrawn Rs. " + amount + " from Current Account.");
            } else 
            {
                System.out.println("Insufficient funds or exceeded overdraft limit.");
            }
        } else 
        {
            System.out.println("Invalid withdrawal amount.");
        }
		
	}

	@Override
	public void calInterest() {
		if (balance > 0)
		{
	        double annualInterestRate = 0.03; 
	        double interest = balance * (annualInterestRate / 12);
	        balance += interest;
	        System.out.println("Interest of " + interest + " applied to your account.");
	    } else 
	    {
	        System.out.println("No interest applied as your account balance is not positive.");
	    }
		
	}

	@Override
	public void currentBalance() {
		System.out.println("Remaining Balance  : "+this.getBalance());
		System.out.println("OverDraft Balance  : "+this.getOverdraft());
		
	}
	
	

}
