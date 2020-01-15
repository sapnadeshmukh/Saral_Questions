package allQuestion;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner n=new Scanner (System.in);
		System.out.println("enter a number ");
		int no=n.nextInt();
		int temp=no;
		int rev=0,rem;
		while (temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}if (no==rev) {
			System.out.println(no +" " + "Is palindrome number");
			
		}else {
			System.out.println(no +" " + "Is not palindrome number");
		}
		
	}

}
