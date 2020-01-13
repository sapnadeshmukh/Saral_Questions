package allQuestion;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Aaj ka din kya hai? (monday/tuesday) ");
		String day = num.nextLine();
		System.out.println("Kaunse samay ka khana banana hai? (lunch/dinner) ");
		String time = num.nextLine();
		if (day.equals("tuesday") && time.equals("dinner")){ 
		    System.out.println( "pav bhaji bnegi aaj");
		}else if (day.equals("monday")||time.equals("lunch")) {
			System.out.println("Daal roti bnegi aaj ");
		}
	}

}
