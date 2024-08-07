import java.io.*;
import java.util.Scanner;

public class program2 {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter your name");
		String name = in.nextLine();
		in.close();
		System.out.println("Good Morning "+name);
	}
}
