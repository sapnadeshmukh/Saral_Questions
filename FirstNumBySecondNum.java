package allQuestion;

import java.util.Scanner;

public class FirstNumBySecondNum {

	public static void main(String[] args) {
		Scanner num=new Scanner (System.in);
		System.out.println("Enter first number");
		int number1=num.nextInt();
		System.out.println("Enter second number");
		int number2=num.nextInt();
		if(number1 % number2==0) {
			System.out.println("Divisible hai");
		}else {
			System.out.println("Divisible nahi hai");
		}
	}

}
