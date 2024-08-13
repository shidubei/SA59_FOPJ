package exerciseE;

import java.util.Scanner;

public class program5 {
	public static void main(String []args) {
		int cnt=0;
		for (int i=5;i<=10000;i++) {
			cnt = 0;
			for (int j=2;j<=(int)Math.sqrt(i);j++) {
				if(i%j==0) {
					cnt=1;
					break;
				}
			}
			if (cnt==0) {
				System.out.println(i);
			}
		}
	}
}
