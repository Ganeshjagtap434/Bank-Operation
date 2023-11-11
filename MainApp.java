package com.corejava.bankingopeartion;
	

	import java.time.LocalDate;
	import java.util.Arrays;
	import java.util.Date;
	import java.util.Scanner;

	public class MainApp {
		
		Date[] transaction = new Date[20];
		
		Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			MainApp obj = new MainApp();
			
		
			
			obj.showData();

			obj.processes();
			
		}

		public int size() {
			
			System.out.print("Enter the no.of account are opened: ");
			int size = scanner.nextInt();
			
			return size;
			
		}
		
		Account[] account = new Account[size()];
		
		public void showData()
		{
			int choice = 0;
			
			for(int ctr = 0;ctr<account.length;ctr++)
			{
				System.out.println("\n*****************NEW ACCOUNT***********************\n");
				
				System.out.println("\n1.Saving Account");
				
				System.out.println("\n2.Salary Account");
				
				System.out.println("\n3.Current Account");
				
				System.out.println("\n4.Loan Account");
				
				System.out.print("Enter Your Choice : ");
				choice = scanner.nextInt();
				
				System.out.print("Please Enter Account No : ");
				int accno = scanner.nextInt();
				System.out.print("Please Account Holder Name : ");
				String accName = scanner.next();
				System.out.print("Please Enter The Balance : ");
				double balance = scanner.nextDouble();
				System.out.print("Please Enter account Open Date(yy-mm-dd) : ");
				String date = scanner.next();
				LocalDate d = LocalDate.parse(date);
				
				
				
				if(choice == 1)
				{
					
					if(balance >= 10000)
					{
						System.out.println("\nAccount Successfully Created");
						account[ctr] = new SavingAccount(accno, accName, balance, 0.4, date,d);
					
						
						
					}
					else
					{
						System.out.println("\nAccount Not Created..");
						System.out.println("Balance Should Be More Than 10000.\n");
					}
					

				}
				else if(choice == 2)
				{
					System.out.println("Account Successfully Created");
					account[ctr] = new SalaryAccount(accno, accName, balance, 0.2, date, d);
					
				}
				else if(choice == 3)
				{
					System.out.println("\nAccount Successfully Created");
					account[ctr] = new CurrentAccount(accno, accName, balance,0.3, date, d);
					
					
				}
				else if(choice == 4)
				{
					System.out.println("Account Successfully Created");
					account[ctr]= new LoanAccount(accno, accName, balance, 0.5,date, d);
					
					
				}
				else
				{
					System.out.println("Invalid Choice!!");
				}
			
				  
			}
		}
		
				
		
		public void processes()
		{
			int choice=-1;
			int index=-1;
			
			do {
				
				System.out.println("\n*******ALL ACCOUNT DETAILS*********\n");
				System.out.println("\t\t1.Open account");
				System.out.println("\t\t2.Close Account");
				System.out.println("\t\t3.Deposite amount");
				System.out.println("\t\t4.Withdraw amount");
				System.out.println("\t\t5.Loan Amount");
				System.out.println("\t\t6.Interest amount");
				System.out.println("\t\t7.EndOfDayReport");
				System.out.println("\t\t0.Exit");
				System.out.println("\n****************************************\n");
				System.out.print("Enter Your Choice : ");
				choice = scanner.nextInt();
				
				switch(choice)
				{
				case 1:
				{
					
					int flag=0;
					System.out.println("open account");
					System.out.println("Enter The Account Number : ");
					int accNo = scanner.nextInt();
					
					
					for(int ctr=0;ctr<account.length;ctr++)
					{	
							if(accNo == account[ctr].getAccNo())
							{
								System.out.println("Date "+account[ctr].getOpenDate());
								flag++;
								break;
							}
									
					}
					
					if(flag==0)
					{
						System.out.println("Please enter valid Account Number..");	
					}
					
				}
				break;
				
				case 2:
				{
					int flag=0;
					int ctr;
					System.out.println("delete account");
					System.out.println("Enter The Account Number : ");
					int accNo = scanner.nextInt();
					
					for(ctr=0;ctr<account.length;ctr++)
					{
							
						if(accNo == account[ctr].getAccNo())
						{
							flag++;
							break;

						}
							
					}
					if(flag==0)
					{
					
						System.out.println("Please enter valid Account Number..");
						
					}
					else
					{
						int x, y;
						for (x = 0, y = 0; y < account.length; y++)
						
							if (account[y]!=account[ctr]) {

								account[x++] = account[y];
							}

						account = Arrays.copyOf(account, x);
						System.out.println("Account Deleted Successfully ..!");
						
					}
				}
				break;
				
				case 3 :
				{
					int flag=0;
					System.out.println("deposite amount");
					System.out.println("Enter The Account Number : ");
					int accNo = scanner.nextInt();
					
					for(int ctr=0;ctr<account.length;ctr++)
					{
							
						if(accNo == account[ctr].getAccNo())
						{
							System.out.println("Enter Deposite Amount : ");
							double depo = scanner.nextDouble();
									
							account[ctr].deposite(depo);
							
							flag++;
							break;

						}
							
					}
					if(flag==0)
					{
					
						System.out.println("Please enter valid Account Number..");
						
					}
					else
					{
						
						transaction[++index] = new Date();
						
						System.out.println("Date "+transaction[index]);
						
					}
				}
				break;
				
					case 4:
					{
						int flag=0;
						System.out.println("withdraw amount");
						System.out.print("Enter The Account Number : ");
						int accNo = scanner.nextInt();
						
						for(int ctr=0;ctr<account.length;ctr++)
						{
							
								if(accNo == account[ctr].getAccNo())
								{
									System.out.print("Enter Withdraw Amount : ");
									double wamount = scanner.nextDouble();			
									account[ctr].withdraw(wamount);
									
									flag++;
									break;
								}
			
						} 
						if(flag==0)
						{
						
							System.out.println("Account Number Not Found..");
							
						}
						else
						{
							
							transaction[++index] = new Date();
							System.out.println("Date "+transaction[index]);
						
						}
						
					}
					break;
					
					case 5:
					{
						int flag=0;
						System.out.println("loanAmount");
						System.out.println("Enter The Account Number : ");
						int accNo = scanner.nextInt();
						
						for(int ctr=0;ctr<account.length;ctr++)
						{
								
							if(accNo == account[ctr].getAccNo())
							{
						
								account[ctr].calInterest();
								flag++;
								break;
							}
								
						}
						if(flag==0)
						{
						
							System.out.println("Please enter valid Account Number..");
							
						}
					}
					break;
					
					case 6 :
					{
						int flag=0;
						System.out.println("interest");
						System.out.println("Enter The Account Number : ");
						int accNo = scanner.nextInt();
						
						for(int ctr=0;ctr<account.length;ctr++)
						{
								
							if(accNo == account[ctr].getAccNo())
							{
								account[ctr].calInterest();
								account[ctr].currentBalance();
								
								flag++;
								break;
							}
								
						}	
						if(flag==0)
						{
						
							System.out.println("Please enter valid Account Number..");
							
						}
						
					}
					break;
					
					
					case 7:
					{
						int flag=0;
						System.out.println("EndOfDayReport");
						System.out.println("Enter The Account Number : ");
						int accNo = scanner.nextInt();
						
						for(int ctr=0;ctr<account.length;ctr++)
						{
								
							if(accNo == account[ctr].getAccNo())
							{
								
								account[ctr].display();
								flag++;
								break;
							}
								
						}
						if(flag==0)
						{
						
							System.out.println("Please enter valid Account Number..");
							
						}
					}
					break;
					
					
					case 0 :
					{
							System.out.println("Existing the Program ...!Thank You....!");
					}
					break;
					
					default :
					{
							System.out.println("Invalid Choice!1");
					}
					break;
									
				}
						
			}while(choice!=0);	
		}

	}


