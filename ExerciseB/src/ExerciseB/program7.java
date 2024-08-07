package ExerciseB;

import java.util.Scanner;

public class program7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the distance:");
		double distance = in.nextDouble();
		System.out.println("The charge is "+(2.4+distance*0.4));
	}
}
