package exerciseF;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = in.next();
		boolean isPalindrome = true;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)==str.charAt(str.length()-i-1)) {
				if(i==str.length()/2-1) {
					System.out.println("This is a palindrome");
				}
			}else {
				isPalindrome=false;
				break;
			}
		}
		if(!isPalindrome) {
			System.out.println("This is not a palindrome");
		}
	}
}
