package day4Quiz;

import java.util.Scanner;

public class day4Quiz {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String pin = "zy12345";
		System.out.println("Welcome to the Bank of ISS");
		int times = 1;
		while(true) {
			System.out.println("Enter your pin:");
			String pw = in.next();
			if(pw.equals(pin)) {
				System.out.println("PIN accepted.You can access your account now!");
				break;
			}else{
				System.out.println("Incorrect PIN,Please try again.");
			}
			if(times==3) {
				System.out.println("Too many wrong PIN entried,Your account is locked now");
				break;
			}
			times++;
		}
	}
}
