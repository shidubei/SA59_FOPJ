package ecerciseD;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		int rand = (int) (1+Math.random()*10);
		Scanner in = new Scanner(System.in);
		
		System.out.println("give me a number(between 1-10):");
		int num = in.nextInt();
		int cnt=1;
		while(num!=rand) {
			if(num<1 || num>10) {
				System.out.println("number error,should between 1-10:");
			}else {
				System.out.println("your guess is not right,try again!:");
				num=in.nextInt();
			}
			cnt++;
		}
		if (cnt<=2) {
			System.out.println("You are a Wizard!");
			System.out.println("Congraduations!your guess is right,the number is "+num+",You have tried "+cnt+" times");
		}else if (cnt<=5) {
			System.out.println("You are a good guess");
			System.out.println("Congraduations!your guess is right,the number is "+num+",You have tried "+cnt+" times");
		}else if (cnt>=8) {
			System.out.println("You are a lousy");
		}
		
	}
}
