package allQuestion;

import java.util.Scanner;

public class CounterQue5 {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Kitni baar input lein? ");
		int chance=n.nextInt();
		int index;
		int sum=0;
		for(index=1;index<=chance;index++) {
			Scanner num=new Scanner (System.in);
			System.out.println("Enter a number");
			int number=num.nextInt();
			sum=sum+number;
		}
		System.out.println("The sum of all number is :" + sum);
	}

	

}
