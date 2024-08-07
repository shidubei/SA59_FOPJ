package exerciseC;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = in.nextInt();
		int oneDig = num%10;
		int twoDig = (num/10)%10;
		int threeDig = num/100;
		if (num == oneDig*oneDig*oneDig+twoDig*twoDig*twoDig+threeDig*threeDig*threeDig) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
