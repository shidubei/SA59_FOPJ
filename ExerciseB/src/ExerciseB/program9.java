package ExerciseB;

import java.util.Scanner;

public class program9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first side's length:");
		double a = in.nextInt();
		System.out.println("Enter second side's length:");
		double b = in.nextInt();
		System.out.println("Enter third side's length:");
		double c = in.nextInt();
		double s =(a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));  
		System.out.println("Area is "+area);
	}
}
