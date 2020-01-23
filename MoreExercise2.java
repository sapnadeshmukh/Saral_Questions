package allQuestion;

import java.util.Scanner;

public class MoreExercise2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number of student ");
		int student=s.nextInt();
		Scanner l=new Scanner(System.in);
		System.out.println("Ek student ka kharcha");
		int expense=l.nextInt();
		int total=student*expense;
		System.out.println(total);
		if (total<=50000) {
			System.out.println("Hum budget ke andar hain");
		}else {
			System.out.println("budget ke bahar hain.");
		}
		
	}

}
