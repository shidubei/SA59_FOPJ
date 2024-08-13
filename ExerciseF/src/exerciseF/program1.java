package exerciseF;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a phrase");
		String phrase = in.next();
		int[] cnt = new int[5];
		int sum=0;
		for(int i=0;i<phrase.length();i++) {
			if(phrase.substring(i, i+1).equals("a")) {
				cnt[0]++;
			}else if(phrase.substring(i, i+1).equals("e")) {
				cnt[1]++;
			}else if(phrase.substring(i, i+1).equals("i")) {
				cnt[2]++;
			}else if(phrase.substring(i, i+1).equals("o")) {
				cnt[3]++;
			}else if(phrase.substring(i, i+1).equals("u")) {
				cnt[4]++;
			}
		}
		for(int i=0;i<cnt.length;i++) {
			sum += cnt[i];
			if(i==0) {
				System.out.println("This phrase have "+cnt[i]+" a vowels");
			}else if(i==1) {
				System.out.println("This phrase have "+cnt[i]+" e vowels");
			}else if(i==2) {
				System.out.println("This phrase have "+cnt[i]+" i vowels");
			}else if(i==3) {
				System.out.println("This phrase have "+cnt[i]+" o vowels");
			}else if(i==4) {
				System.out.println("This phrase have "+cnt[i]+" u vowels");
			}
		}
		System.out.println("This phrase have "+sum+" vowels");
		
	}
}
