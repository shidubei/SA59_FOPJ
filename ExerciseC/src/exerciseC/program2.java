package exerciseC;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Enter your Gender(M/F):");
		String gender = in.next();
		System.out.println("Enter your age:");
		int age = in.nextInt();
		
		if (gender.equals("M")) {
			if (age>=40) {
				System.out.println("Good Morning Uncle "+name);
			}else {
				System.out.println("Good Morning Mr."+name);
			}
		}else {
			if (age>=40) {
				System.out.println("Good Morning Aunty "+name);
			}else {
				System.out.println("Good Morning Mrs."+name);
			}
		}
	}
}
