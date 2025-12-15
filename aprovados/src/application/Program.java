package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double average = 0;
		
		System.out.print("How many students will be digitized? ");
		int quantity = sc.nextInt();
		
		Student[] stu = new Student[quantity];
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println("Enter the name, first and second grades of the " + (i+1) + " student:");
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			stu[i] = new Student(name, grade1, grade2);
		}
		System.out.println("Students who passed: ");
		for (int i = 0; i < stu.length; i++) {
			average = (stu[i].getGrade1() + stu[i].getGrade2()) / 2;
			if (average >= 6.0) {
				System.out.println(stu[i].getName());
			}
		}
		sc.close();
	}
}