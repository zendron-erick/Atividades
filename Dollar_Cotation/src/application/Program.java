package application;

import java.util.Locale;
import java.util.Scanner;

import service.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the Dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many Dollars will be bought? ");
		double amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(dollar, amount));
		
		
	
	sc.close();
	}

}
