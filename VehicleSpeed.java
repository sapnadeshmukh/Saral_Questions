package allQuestion;

import java.util.Scanner;

public class VehicleSpeed {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Gaadi ki speed daalo");
		int speed = num.nextInt();
		if (speed<=30) {
			System.out.println("speed bahot kam hai");
		}else if (speed >30 && speed <60) {
			System.out.println("speed kam hai");
		}else {
			System.out.println("Speed bahot fast hai ");
		}
	}

}
