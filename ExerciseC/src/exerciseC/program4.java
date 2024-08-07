package exerciseC;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the distance:");
		double distance = in.nextDouble();
		distance = Math.ceil(distance*10);
		distance /= 10;
		double charge;
		if (distance<=0.5) {
			charge=2.4;
		}else if (distance>0.5 && distance<=9) {
			charge=2.4+(distance-0.5)*0.4;
		}else {
			charge = 2.4+8.5*0.4+(distance-9)*0.5;
		}
		System.out.printf("Charge is %.1f",charge);
	}
}
