package ExerciseB;

import java.util.Scanner;

public class program8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int[] arr = new int[4];
//		for (int i=0;i<4;i++) {
//			System.out.printf("Enter the %d number",i);
//			int a = in.nextInt();
//			arr[i]=a;
//		}
//		for (int i=0;i<4;i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println("Enter the distance:");
		double distance = in.nextDouble();
		double charge = 2.4+distance*0.4;
		charge = Math.ceil(charge*10);
		charge /=10;
		System.out.println("The charge is "+charge);
	}
}
