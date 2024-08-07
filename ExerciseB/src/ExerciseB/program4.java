package ExerciseB;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature in Centigrade: ");
		double centigrade = in.nextDouble();
		in.close();
		double fahrenheit = (centigrade*1.8)+32;
		System.out.println("Temperature in Fahrenheit is "+fahrenheit);
	}
}
