package com.corejava.bankingopeartion;

import java.time.LocalDate;

public class LoanAccount extends Account{
	
	double loanAmount;
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}

	public LoanAccount(double loanAmount) {
		super();
		this.loanAmount = loanAmount;
	}
	
	
	public LoanAccount(int accNo, String accName, double balance, double interest, String branchNo,
			LocalDate openDate) {
		super(accNo, accName, balance, interest, branchNo, openDate);
		// TODO Auto-generated constructor stub
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public void accOpen() {
		System.out.println("Loan Account is already opened.");
		
	}

	@Override
	public void accClose() {
		 System.out.println("Cannot close Loan Account until the loan is fully paid.");
		
	}

	@Override
	public void deposite(double amount) {
		if (amount > 0) {
            balance += amount;
            System.out.println("Payment of Rs. " + amount + " made towards Loan Account.");
        } else {
            System.out.println("Invalid payment amount.");
        }
		
		
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Cannot withdraw from a Loan Account.");
		
	}

	@Override
	public void calInterest() {
		int interest = 0;
		double monthlyInterestRate = interest / 12;
        double interest1= balance * monthlyInterestRate;
        balance += interest1;
		
	}

	@Override
	public void currentBalance() {
		System.out.println("\nRemaining Loan Amount  : "+this.getLoanAmount());
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("Account Type: Loan");
        System.out.println("Loan Amount: Rs. " + -balance);
	}

	

}
