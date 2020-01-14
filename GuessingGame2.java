package allQuestion;

import java.util.Scanner;

public class GuessingGame2 {

	public static void main(String[] args) {
		int guess_num = 8;
		for (int index = 1; index <= 10; index++) {
			Scanner num = new Scanner(System.in);
			System.out.println("guess a number betwwen 0 to 10");
			int guess = num.nextInt();
			if (guess < guess_num) {
				System.out.println(" aapka number chota hai! Ek aur baar try karo.");
			
			}else if (guess>guess_num) {
				System.out.println("aapka number bada hai! Ek aur baar try karo.");
			}else if (guess==guess_num) {
				System.out.println(" waah! Aapne number guess kar liya.");
				break;
							
			}
		}
		
			
		
	}

}
