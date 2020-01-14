package allQuestion;

import java.util.Scanner;

public class SumOfNumByUserChoice {

	public static void main(String[] args) {
		int index;
		int sum=0;
		for(index=1;index<=10;index++) {
			Scanner num=new Scanner (System.in);
			System.out.println("Enter a number");
			int number=num.nextInt();
			sum=sum+number;
		}
		System.out.println("The sum of all number is :" + sum);
	}

}
