package exerciseG;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] arr = new double[12];
		String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		for(int i=0;i<12;i++) {
			System.out.println("Enter the "+(i+1)+" month's data");
			arr[i]=in.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for (int j=1;j<arr.length-i;j++) {
				if(arr[j-1]<arr[j]) {
					double temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					String temp2=month[j];
					month[j]=month[j-1];
					month[j-1]=temp2;
				}
			}
		}
		for(int i=0;i<12;i++) {
			System.out.println("Month: "+month[i]+";Sale: "+arr[i]);
		}
	}
}
