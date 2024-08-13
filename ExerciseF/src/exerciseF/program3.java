package exerciseF;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String strLine = in.nextLine();
		String str=strLine;
		for(int i=0;i<strLine.length();i++) {
			if(!(strLine.charAt(i)<='z'&&strLine.charAt(i)>='a')&&!(strLine.charAt(i)<='Z'&&strLine.charAt(i)>='A')) {
				str=str.replace(strLine.substring(i, i+1),"");
			}
		}
		boolean isPalindrome = true;
		int value = 'a'-'A';
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)==str.charAt(str.length()-i-1)||str.charAt(i)==str.charAt(str.length()-i-1)-value||str.charAt(i)==str.charAt(str.length()-i-1)+value) {
				if(i==str.length()/2-1) {
					System.out.println("This is a Palindrome");
				}
			}else {
				isPalindrome=false;
				break;
			}
		}
		if(!isPalindrome) {
			System.out.println("This is not a Palindrome");
		}
	}
}
