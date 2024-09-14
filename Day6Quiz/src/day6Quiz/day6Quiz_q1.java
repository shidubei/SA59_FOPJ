package day6Quiz;

import java.util.Scanner;

public class day6Quiz_q1 {
	static int[] minIncomeArray = new int[] {
			20000,30000,40000,80000,120000,160000,200000,320000
	};
	static double[] taxRateArray = new double[] {
			0.02,0.035,0.07,0.115,0.15,0.17,0.18,0.20
	};
	static int[] basePayableAmountArray =new int[] {
			0,200,550,3350,7950,13590,20750,42350
	};
	
	public static void main(String []args) {
		int annualIncome=askForIncome();
		int taxBracket=getTaxBracket(annualIncome);
		double taxPayable = calculateIncomeTax(annualIncome,taxBracket);
		printResult(annualIncome,taxPayable);
	}
	
	public static int askForIncome() {
		System.out.println("Please enter your annual taxable income:");
		Scanner in =new Scanner(System.in);
		int income=in.nextInt();
		return income;
	}
	
	public static int getTaxBracket(int annualIncome) {
		if(annualIncome<20000) {
			return -1;
		}
		int index=0;
		for(;index<minIncomeArray.length;index++) {
			if(minIncomeArray[index]>annualIncome) {
				break;
			}
		}
		return index-1;
	}
	
	public static double calculateIncomeTax(int annualIncome,int taxBracket) {
		if(taxBracket==-1) {
			return 0.0;
		}
		int minIncome=minIncomeArray[taxBracket];
		double rate=taxRateArray[taxBracket];
		int basePayableAmount = basePayableAmountArray[taxBracket];
		
		double taxPayable = (annualIncome-minIncome)*rate+basePayableAmount;
		return taxPayable;
	}
	
	public static void printResult(int annualIncome,double taxPayable) {
		System.out.printf("For taxable annual income of $%.2f.the tax payable amount is $%.2f",(double)annualIncome,taxPayable);
	}
}
