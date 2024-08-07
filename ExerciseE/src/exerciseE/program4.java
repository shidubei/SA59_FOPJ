package exerciseE;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = in.nextInt();
		int sum = 0;
		for (int i=1;i<=(int)Math.sqrt(num);i++) {
			if (num%i==0) {
				sum = sum+i;
				sum= sum+num/i;
			}
		}
		
		if (sum-num==num) {
			System.out.println("It is a Perfect Number!");
		}
	}
}
