package ecerciseD;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = in.nextInt();
		while(num!=88) {
			System.out.println("Enter again:");
			num=in.nextInt();
		}
		System.out.println("Lucky you...");
	}
}
