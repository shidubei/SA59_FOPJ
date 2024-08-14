package exerciseG;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Num:");
		int stuNum = in.nextInt();
		System.out.println("Enter Subject Num:");
		int subNum = in.nextInt();
		double[][] table = new double[stuNum][subNum];
		for(int i=0;i<table.length;i++) {
			System.out.println("Enter the "+(i+1)+"Student's Grade");
			for(int j=0;j<table[0].length;j++) {
				System.out.println("Enter the "+(j+1)+"Subject Grade");
				table[i][j]=in.nextDouble();
			}
		}
		double[] total=new double[stuNum];
		double[] stuAvg=new double[stuNum];
		double[] subAvg=new double[subNum];
		for(int i=0;i<table.length;i++) {
			double sum=0;
			for(int j=0;j<table[0].length;j++) {
				sum+=table[i][j];
			}
			total[i]=sum;
			stuAvg[i]=sum/subNum;
		}
		for(int i=0;i<table[0].length;i++) {
			double sum=0;
			for(int j=0;j<table.length;j++) {
				sum+=table[j][i];
			}
			subAvg[i]=sum/stuNum;
		}
		System.out.println("The total grade for each student is: ");
		for(int i=0;i<stuNum;i++) {
			System.out.print(total[i]+" ");
		}
		System.out.println("The average grade for each student is: ");
		for(int i=0;i<stuNum;i++) {
			System.out.print(stuAvg[i]+" ");
		}
		System.out.println("The average grade for each subject is: ");
		for(int i=0;i<subNum;i++) {
			System.out.print(subAvg[i]+" ");
		}
	}
}
