package exerciseH;

import java.util.Scanner;

public class program1 {
	public static int ReadInteger(String message) {
		Scanner in =new Scanner(System.in);
		int res = 0;
		System.out.println(message);
		while(true) {
			if(in.hasNextInt()) {
				res=in.nextInt();
				break;
			}else {
				System.out.println("Please Enter a Integer");
				in.next();
			}
			
		}
		System.out.println("You have enter a Integer");
		return res;
	}
	public static void main(String[] args) {
		ReadInteger("Enter a Integer");
	}
}
