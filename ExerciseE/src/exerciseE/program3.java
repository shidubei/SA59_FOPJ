package exerciseE;

import java.util.Scanner;

public class program3 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		boolean isPrime = true;
		int num = in.nextInt();
		for (int i=2;i<=(int)Math.sqrt(num);i++) {
			if(num%i==0 && num!=2) {
				System.out.println("Not a Prime");
				isPrime=false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Is a Prime");
		}
	}
}
