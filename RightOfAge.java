package allQuestion;

import java.util.Scanner;

public class RightOfAge {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a age");
		int age = num.nextInt();
		if (age > 5) {
			System.out.println("School ja skte ho");
		}
		if ( age > 18) {
			System.out.println("Vote de skte ho");
		}
		if (age > 21) {
			System.out.println("Car drive kr skte ho");
		}
		if (age > 24) {
			System.out.println("Shadi kr skte ho");
		}
		if (age > 25) {

			System.out.println("legally drink kar sakte ho");
		}else if (age<5){
			System.out.println("not eligible");
			
		
		}

	}

}
