package allQuestion;

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = n.nextInt();
		if (number < 10) {
			System.out.println("10 se bada hai");
		} else if (number > 10 && number < 20) {
			System.out.println("20 se chota hai");
		} else {
			System.out.println("20 se bada hai");

		}
	}

}
