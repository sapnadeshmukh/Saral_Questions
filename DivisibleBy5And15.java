package allQuestion;

import java.util.Scanner;

public class DivisibleBy5And15 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = num.nextInt();
		if (number % 5 == 0) {
			if (number % 15 == 0) {
				System.out.println("Divisible hai");
			} else {
				System.out.println("Divisible nahi hai");
			}
		}

	}
}
