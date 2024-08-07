package ecerciseD;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A:");
		int aI = in.nextInt();
		System.out.println("Enter B:");
		int bI = in.nextInt();
		
		int a = aI;
		int b = bI;
		int HCF;
		int LCM;
		while(a!=b) {
			if(a<b) {
				b-=a;
			}else{
				a-=b;
			}
		}
		HCF=a;
		LCM=aI*bI/HCF;
		System.out.println("A is "+aI+";B is "+bI+";HCF is "+HCF+";LCM is "+LCM);
	}
}
