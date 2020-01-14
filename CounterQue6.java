package allQuestion;

import java.util.Scanner;

public class CounterQue6 {

	public static void main(String[] args) {
		int result=0;
		Scanner n=new Scanner(System.in);
		System.out.println("enter a number ");
		int number=n.nextInt();
		for(int i=1;i<=number;i++) {
			if (number%i==0) {
				result=result+1;
			}
		}if (result==2) {
			System.out.println(number + " " +"is prime.");
		}else {
			System.out.println(number + " " +"is not prime.");
		}
	}

}
