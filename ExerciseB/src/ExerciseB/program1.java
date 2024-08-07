package ExerciseB;

import java.math.*;
import java.util.*;
import java.text.DecimalFormat;

public class program1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		DecimalFormat df = new DecimalFormat("#.###");
		double num = in.nextFloat();
		in.close();
		double ans = Math.sqrt(num);
		System.out.println("Answer is "+df.format(ans));
	}
}
