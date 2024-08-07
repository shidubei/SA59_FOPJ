package day1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DataFormatting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        String num = in.nextLine();
        double number = Double.parseDouble(num);
        System.out.println(number);
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(df.format(number));	
        DecimalFormat df1 = new DecimalFormat("#.###");
        System.out.println(df1.format(number));
        DecimalFormat df2 = new DecimalFormat("#.###");
        System.out.println(df2.format(number));
        System.out.println(String.format("%.1f", number));
        System.out.println(String.format("%.3f", number));
        // using decimal format won't be able to use money format, this is getting messy...
        System.out.println(String.format("%,.2f", number));
        System.out.println("DecimalFormat examples");
        double a = 6543.21;
        int b = 7;
        DecimalFormat decimalFormatter = new DecimalFormat("###");
 
        System.out.println("Formatted Number: " + decimalFormatter.format(b));
     


        
        
        in.close();
    }
}
