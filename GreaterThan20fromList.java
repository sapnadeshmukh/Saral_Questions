package allQuestion;

public class GreaterThan20fromList {

	public static void main(String[] args) {
		int[] number= {50, 40, 23, 70, 56, 12, 5, 10, 7,};
		int index;
		int count = 0;
		for(index=0;index < number.length;index++) {
			if (number[index]>20 && number[index]<40) {
				count=count+1;
			}
			
		}
		System.out.print(count);

		

	}

}
