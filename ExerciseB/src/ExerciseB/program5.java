package ExerciseB;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = in.nextInt();
		int y = 5*x*x-4*x+3;
		System.out.println("Answer is "+y);
	}
}
