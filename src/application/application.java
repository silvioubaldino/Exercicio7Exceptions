package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			System.out.println("");
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			Account account = new Account(number, holder, balance, withdrawLimit);
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		sc.close();
	}

}
