package ExerciseB;

import java.util.Scanner;

public class program6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the x1:");
		double x1 = in.nextDouble();
		System.out.println("Please Enter the y1:");
		Double y1 = in.nextDouble();
		System.out.println("Please Enter the x2:");
		Double x2 = in.nextDouble();
		System.out.println("Please Enter the y2:");
		Double y2 = in.nextDouble();
		
		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The distance is "+distance);
	}
}