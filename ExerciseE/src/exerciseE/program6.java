package exerciseE;

import java.util.Scanner;

public class program6 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1;i<=1000;i++) {
			sum=0;
			for (int j=1;j<=(int)Math.sqrt(i);j++) {
				if (i%j==0) {
					sum = sum+j;
					sum= sum+i/j;
				}
			}
			if (sum-i==i) {
				System.out.print(i+" ");
			}
		}
	}
}
