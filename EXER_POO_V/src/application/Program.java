package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account ac;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.nextLine().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter the initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			ac = new Account(number, holder, initialDeposit);
		} else {
			ac = new Account(number, holder);
		}
		System.out.println("Account data:");
		System.out.println(ac);
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		ac.deposit(amount);
		
		System.out.println("Update account data:");
		System.out.println(ac);
		
		System.out.print("Enter a withdraw value: ");
		double amountWithdraw =sc.nextDouble();
		System.out.println("Update account data:");
		ac.withdraw(amountWithdraw);
		
		System.out.println(ac);
		sc.close();
	}

}
