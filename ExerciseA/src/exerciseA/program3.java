import java.util.*;

public class program3 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = in.nextInt();
		in.close();
		System.out.println("Answer is "+num*num);
	}
}
