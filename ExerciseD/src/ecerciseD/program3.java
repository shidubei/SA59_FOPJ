package ecerciseD;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		int rand = (int) (1+Math.random()*10);
		Scanner in = new Scanner(System.in);
		
		System.out.println("give me a number(between 1-10):");
		int num = in.nextInt();
		int cnt=1;
		while(num!=rand) {
			cnt++;
			if(num<1 || num>10) {
				System.out.println("number error,should between 1-10:");
			}else {
				System.out.println("your guess is not right,try again!:");
				num=in.nextInt();
			}
			
		}
		System.out.println("Congraduations!your guess is right,the number is "+num+",You have tried "+cnt+" times");
		
	}
}
