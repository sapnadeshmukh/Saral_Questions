package allQuestion;

import java.util.Scanner;

public class MoreExercise3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = s.nextLine();

		if ((password.length() >= 6) && (password.length() <= 16)
				&& (password.contains("$") && (password.contains("2") || password.contains("8"))
						&& (password.contains("A") || password.contains("Z")))) {
			System.out.println("It's Strong password");
		}else {
			System.out.println("It's Weak password");

		}
	}

}
