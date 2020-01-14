package allQuestion;

import java.util.Scanner;

public class CounterQue12 {

	public static void main(String[] args) {
		int sum=0;
		int average;
		for ( int index=1;index<=11;index++) {
			Scanner n=new Scanner(System.in);
			System.out.println("Enter a weight");
			int value=n.nextInt();
			sum=sum+index;
			
			
		}
		average=sum/11;
		System.out.println("average is;" +average);
		if (average%5==0) {
			System.out.println("5 se divisible hai");
			
		}else {
			System.out.println("5 se divisible nhi hai");
		}
		
		
	}

}
