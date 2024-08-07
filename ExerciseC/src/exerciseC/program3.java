package exerciseC;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your grade:");
		int grade = in.nextInt();
		
		if (grade<0 || grade>100) {
			System.out.println("**Error**");
		}else if(grade>=0 && grade<40) {
			System.out.println("You Scored "+grade+" marks which is F grade");
		}else if(grade>=40 && grade<60) {
			System.out.println("You Scored "+grade+" marks which is C grade");
		}else if(grade>=60 && grade<80) {
			System.out.println("You Scored "+grade+" marks which is B grade");
		}else if(grade>=80 && grade<=100) {
			System.out.println("You Scored "+grade+" marks which is A grade");
		}
	}
}
