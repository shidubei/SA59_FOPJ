package exerciseC;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Enter your Gender(M/F):");
		String gender = in.next();
		
		if (gender.equals("M")) {
			System.out.println("Good Morning Mr."+name);
		}else {
			System.out.println("Good Morning Mrs."+name);
		}
	}
}
