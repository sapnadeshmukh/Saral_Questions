package allQuestion;

import java.util.Scanner;

public class WaterFilter {

	public static void main(String[] args) {
		Scanner num=new Scanner (System.in);
		System.out.println("Enter how many litre of water");
		int litre=num.nextInt();
		if (litre<1) {
			System.out.println("pani bharna hai");
		}else if(litre >=1 &&litre <10) {
			System.out.println("pani  nahi bharna hai");
			
		}else {
			System.out.println("overflow");
		}
	}

}
