package allQuestion;

import java.util.Scanner;

public class IsDivisible {

	public static void main(String[] args) {
		Scanner num=new Scanner (System.in);
		System.out.println("Enter a number");
		String number=num.nextLine();
		int i=Integer.parseInt(number); //*To convert string to integer/*
		if (i%2==0) {
			System.out.println("2 se Divisible hai");
		}else {
			System.out.println("2 se divisible nhi hai");
			
		}
	}
	

}
