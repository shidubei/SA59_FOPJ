package exerciseF;

import java.util.Scanner;

public class program6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a matriculation number");
		String matriculationNum = in.next();
		StringBuffer str = new StringBuffer(matriculationNum);
		char[] matchChar = {'O','P','Q','R','S'};
		int value='A'-'a';
		if(str.length()!=7) {
			System.out.println("Invalid");
		}else {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)<='z'&&str.charAt(i)>='a') {
					str.setCharAt(i, (char)(str.charAt(i)+value));
				}
			}
			int sum=0;
			for(int i=1;i<str.length()-1;i++) {
				if(i==1) {
					sum+=(str.charAt(i)-'0')*6;
				}else if (i==2) {
					sum+=(str.charAt(i)-'0')*5;
				}else if(i==3) {
					sum+=(str.charAt(i)-'0')*4;
				}else if(i==4) {
					sum+=(str.charAt(i)-'0')*3;
				}else if(i==5) {
					sum+=(str.charAt(i)-'0')*2;
				}
			}
			if(str.charAt(str.length()-1)==matchChar[sum%5]) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}
	}
}
