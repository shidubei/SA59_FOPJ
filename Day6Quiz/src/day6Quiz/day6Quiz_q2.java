package day6Quiz;

import java.util.Scanner;

public class day6Quiz_q2 {
	public static void main(String[] args) {
		String upperPlainText=ReturnUpperInputSentence();
		
		String encryptedText=EncryptSentence(upperPlainText);
		
		PrintEncryptedSentence(encryptedText);
		
		String decryptedText=DecryptSentence(encryptedText);
		
		PrintDecryptedSentence(decryptedText);
		
		System.out.println("\nType any key to exit");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		in.close();
	}
	public static String ReturnUpperInputSentence() {
		System.out.println("Please enter the sentence:");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		text=text.toUpperCase();
		return text;
	}
	public static String EncryptSentence(String upperPlainText) {
		String encryptedText="";
		for(int i=0;i<upperPlainText.length();i++) {
			if(Character.isLetter(upperPlainText.charAt(i))) {
				char replaceChar = (char) ('A'+(upperPlainText.charAt(i)-'A'+3)%26);
				encryptedText+=Character.toString(replaceChar);
			}else {
				encryptedText+=Character.toString(upperPlainText.charAt(i));
			}
		}
		return encryptedText;
	}
	public static void PrintEncryptedSentence(String encryptedText) {
		System.out.println("The encrypted sentence is:"+encryptedText);
	}
	public static String DecryptSentence(String encryptedText) {
		String decryptedText="";
		for(int i=0;i<encryptedText.length();i++) {
			if(Character.isLetter(encryptedText.charAt(i))) {
				char replaceChar = (char) ('A'+(encryptedText.charAt(i)-'A'+23)%26);
				decryptedText+=Character.toString(replaceChar);
			}else {
				decryptedText+=Character.toString(encryptedText.charAt(i));
			}
		}
		return decryptedText;
	}
	public static void PrintDecryptedSentence(String decryptedText) {
		System.out.println("The decrypted sentence is:"+decryptedText);
		System.out.printf("");
	}
}
