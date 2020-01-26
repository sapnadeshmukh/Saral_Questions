package allQuestion;

import java.util.Scanner;

public class Method6 {

	static double addition(double  num1, double num2) {
		double sum =  (num1 + num2);
		return (sum);
	}

	static double  substraction(double a, double b) {
		double substraction = a - b;
		return (substraction);
	}

	static double  multiplication(double a, double  b) {

		double multiplication = a * b;
		return (multiplication);

	}

	static double division(double a, double b) {
		double division = a / b;
		return (division);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		double  num1 = s.nextDouble ();
		System.out.println("Enter Second Number");
		double num2 = s.nextDouble();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a operator");
		String op = s1.nextLine();

		Method6 cal = new Method6();

		if (op.equals("addition")) {
			System.out.println(cal.addition(num1, num2));
		} else if (op.equals("substraction")) {
			System.out.println(cal.substraction(num1, num2));
		} else if (op.equals("multiplication")) {
			System.out.println(cal.multiplication(num1, num2));

		} else {
			System.out.println(cal.division(num1, num2));
		}
	
	}

}
