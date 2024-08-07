package exerciseE;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = in.nextInt();
		int sumIncre=1;
		int sumDecre=1;
		for (int i=1;i<=num;i++) {
			sumIncre*=i;
		}
		for (int i=num;i>=1;i--) {
			sumDecre*=i;
		}
		System.out.println("Answer is "+sumIncre+" "+sumDecre);
	}
}
