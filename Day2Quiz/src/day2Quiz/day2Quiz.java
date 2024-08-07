package day2Quiz;

import java.util.Scanner;

public class day2Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the length in cm: ");
		double lengthInCm = in.nextDouble();
		double lengthInInch = lengthInCm/2.54;
		in.close();
		System.out.printf("Inch is %.3f",lengthInInch);
	}

}
