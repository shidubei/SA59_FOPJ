package exerciseF;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = 'A'-'a';
		System.out.println("Enter a String");
		String s = in.nextLine();
		StringBuffer str = new StringBuffer(s);
		for(int i=0;i<str.length();i++) {
			if(i==0||str.charAt(i-1)==' ') {
				if(str.charAt(i)<='z'&&str.charAt(i)>='a') {
					str.setCharAt(i, (char)(str.charAt(i)+value));
				}
			}
		}
		System.out.println(str);
	}
}
