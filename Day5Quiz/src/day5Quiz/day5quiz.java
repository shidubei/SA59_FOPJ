package day5Quiz;

import java.util.Scanner;

public class day5quiz {
	public static void main(String[] args) {
		int[][] theArray= {
				{5,3},
				{2,9},
				{2,9},
				{5,1},
				{7,1},
				{8,3},
				{0,3},
				{2,2},
				{9,7}
		};
		int count =0;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number (0-9):");
		int input = in.nextInt();
		in.close();
		count = countNumber(theArray,input);
		if (count>0) {
			System.out.println("the count of the number "+input+" is "+count);
		}else {
			System.out.println("there is no number "+input);
		}
		
	}
	public static int countNumber(int[][] Array,int num) {
		int cnt=0;
		for(int i=0;i<Array.length;i++) {
			for (int j=0;j<Array[0].length;j++) {
				if(Array[i][j]==num) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
