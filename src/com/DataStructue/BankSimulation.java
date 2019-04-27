package com.DataStructue;

import java.util.Scanner;

public class BankSimulation {

	double amount = 0;
	double balance;

	
	public void deposite(double balance) {
		amount = amount + balance;
		System.out.println("Current deposite amount is " + amount);
	}
	public void withdraw(double balance) {
		balance  = amount - balance;
		System.out.println("Current withdraw amount is " + balance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		BankSimulation bank = new BankSimulation();
		
		QueueBank queue = new QueueBank();
	
		System.out.println("---------------------Welcome to Bank--------------------- ");
	
		char ch1;
		
		do
		{
			System.out.println("Enter your choice ");
			int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Deposite");
			System.out.println("Enter the Person");
			queue.enqueue(scanner.nextInt());
			System.out.println(" Enter Deposite amount : ");
			bank.deposite(scanner.nextDouble());
			queue.dequeue();
			System.out.println("Exit Person");
			break;
			
		case 2: 
			System.out.println("Withdraw");
			System.out.println("Enter the Person");
			queue.enqueue(scanner.nextInt());
			System.out.println("Enter Withdraw amount");
			bank.withdraw(scanner.nextDouble());
			queue.dequeue();
			System.out.println("Exit Person");
			break;
		case 3:
			System.out.println("Exit choice");
			break;
			
		default :
			System.out.println("Invalid choice");
		}	System.out.println("Do you want to continue :[y/n]");
		 ch1=scanner.next().charAt(0);
		}
	while(ch1=='Y'||ch1=='y');
		
		
	}
	

}
