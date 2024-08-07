package day3Quiz;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		System.out.printf("Welcome to ISS Gadget Shop \nNumber of items to purchase:");
		Scanner in = new Scanner(System.in);
		double num = in.nextInt();
		
		double value = 500*num;
		
		if (value>2000 && value <=3000) {
			value = value*0.97;
		}else if (value >3000 && value <=6000) {
			value = value*0.95;
		}else if(value > 6000){
			value = value*0.92;
		}
		System.out.printf("Please pay $%.2f",value);
	}
}
