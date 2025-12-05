package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		System.out.print("How many numbers will be entered? ");
		int quantity = sc.nextInt();
		double sum = 0.0;
		
		double[] arr = new double[quantity];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		System.out.print("Value= ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.printf("%nSum= %.2f%n", sum);
		System.out.printf("Average = %.2f", sum / quantity);
		sc.close();
	}

}
