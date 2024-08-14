package exerciseG;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] arr = new double[12];
		String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		for(int i=0;i<12;i++) {
			System.out.println("Enter the "+(i+1)+" month's data");
			arr[i]=in.nextInt();
		}
		double max=0;
		double min=arr[0];
		String maxMonth="";
		String minMonth="";
		double avg = 0;
		for(int i=0;i<12;i++) {
			if(arr[i]>=max) {
				max=arr[i];
				maxMonth=month[i];
			}
			if(arr[i]<=min) {
				min=arr[i];
				minMonth=month[i];
			}
			avg+=arr[i]/12;
		}
		System.out.println("Max Sale Month is "+maxMonth+";Min Sale Month is "+minMonth+";Average is "+avg);
	}
}
