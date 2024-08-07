package ExerciseB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		DecimalFormat df = new DecimalFormat("0.000");
		double num = in.nextFloat();
		in.close();
		double ans = Math.sqrt(num);
		System.out.println("Answer is "+df.format(ans));
	}

}
