package allQuestion;

import java.util.Scanner;

public class GreaterNum {

	public static void main(String[] args) {
		Scanner num=new Scanner (System.in);
		System.out.println("Enter first number");
		int number1=num.nextInt();
		System.out.println("Enter second number");
		int number2=num.nextInt();
		if(number1>number2) {
			System.out.println(number1 +" "+ "Is Greater");
		}else {
			System.out.println(number2 +" "+ "Is Greater");
		}
	}

}
