package allQuestion;

import java.util.Scanner;

public class MoreExercise5 {

	public static void main(String[] args) {
			int i,fact=1;  
			Scanner num=new Scanner (System.in);
			System.out.println("Enter a  number");
			int number=num.nextInt();
			for(i=1;i<=number;i++){    
				fact=fact*i;    
			}    
			System.out.println("Factorial of "+number+" is: "+fact);    
		   
	}

}
