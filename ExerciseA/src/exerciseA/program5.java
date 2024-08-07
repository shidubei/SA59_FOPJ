import java.util.*;
import java.text.DecimalFormat;

public class program5 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		double num = in.nextDouble();
		
		in.close();
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.printf("Answer is "+df.format(num));
	}

}
