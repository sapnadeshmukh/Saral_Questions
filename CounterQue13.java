package allQuestion;

import java.util.Scanner;

public class CounterQue13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=s.nextInt();
		System.out.println("Enter second number");
		int num2=s.nextInt();
		int multi=0;
		for (int index=0;index<num2;index++) {
			multi=multi+num1;
		
			
		}
		System.out.println("Multiplication of two number is :" + multi);
		
	}

}
