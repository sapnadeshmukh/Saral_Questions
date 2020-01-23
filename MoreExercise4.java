package allQuestion;

import java.util.Scanner;

public class MoreExercise4 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1=num.nextInt();
		Scanner num2=new Scanner(System.in);
		System.out.println("Enter Second Number");
		int number2=num.nextInt();
		Scanner num3=new Scanner(System.in);
		System.out.println("Enter Third  Number");
		int number3=num.nextInt();
		if (number1>number2 && number1>number3) {
			System.out.println(number1);
		}else if (number2>number1 && number2>number3) {
			System.out.println(number2);
		}else {
			System.out.println(number3);
			
		}
	}

}
