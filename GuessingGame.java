package allQuestion;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int guess_num = 8;
		for (int index = 1; index <= 5; index++) {
			Scanner num = new Scanner(System.in);
			System.out.println("guess a number between 0 to 10");
			int guess = num.nextInt();
			if (guess == guess_num) {
				System.out.println("your guess is right,WELL DONE");
				break;
			}else
				System.out.println("your guess is wrong,TRY AGAIN");
				
			}

		}
		
	

}
