package allQuestion;

public class Max_num {

	public static void main(String[] args) {
		int[] numbers = { 50, 40, 23, 70, 56, 12, 5, 10, 7 };
		int max_num = numbers[0];
		int index;
		for (index = 0; index < numbers.length; index++)
			
		{

			if (numbers[index] > max_num) {
				max_num = numbers[index];

			}

		}
		System.out.println(max_num);

	}
}
