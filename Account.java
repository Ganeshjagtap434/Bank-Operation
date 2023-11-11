package com.corejava.bankingopeartion;

import java.time.LocalDate;

public abstract class Account {
	
	int accNo;
	String accName;
	double balance;
	double interest;
	String BranchNo;
	LocalDate openDate;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String accName, double balance, double interest, String branchNo, LocalDate openDate) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
		this.interest = interest;
		BranchNo = branchNo;
		this.openDate = openDate;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String getBranchNo() {
		return BranchNo;
	}

	public void setBranchNo(String branchNo) {
		BranchNo = branchNo;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}
	
	public abstract void accOpen();
	
	
	public abstract void accClose();
	
	
	public abstract void deposite(double amount);
	
	
	public abstract void withdraw(double amount);
	
	
	public abstract void calInterest();
	
	public abstract void currentBalance();

	public void dailyTransationReport()
	{
		
		System.out.println("Account No   : "+this.getAccNo());
	}
	
	public void display()
	{
		System.out.println("Account No is : " +this.getAccNo());
		System.out.println("Account Name is : " +this.getAccName());
		System.out.println("Balance is    : "+ this.getBalance());
		System.out.println("Interest is   : "+this.getInterest()+"%");
		System.out.println("Branch NO is : "+this.getBranchNo());
		//System.out.println("Minimum Balance is"+this.getMin);
	}
	
	

}
