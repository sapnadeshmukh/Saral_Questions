package allQuestion;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=s.nextLine();
		
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		if (input.equals(reverse)) {
			System.out.println("Given String is palindrome.");
			
		}else {
			System.out.println("Given String is not palindrome.");
		}
		}

}
