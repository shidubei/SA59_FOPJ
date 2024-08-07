package ExerciseB;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter your salary:");
		double salary = in.nextDouble();
		double salaryInTotal = salary*1.13;
		System.out.printf("Total salary is $%.2f",salaryInTotal);
	}
}
