package allQuestion;

import java.util.Scanner;

public class CounterQue3 {

	public static void main(String[] args) {
		int counter;
		int sum=0;
		for (counter=50;counter>40;counter--) {
	
			Scanner s=new Scanner(System.in);
			System.out.println("enter number");
			int num=s.nextInt();
			sum=sum+num;
			
		}
		System.out.println(sum);
		
	}

}
