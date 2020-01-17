package allQuestion;

public class Average_Of_Even_Odd_From_Array {
	public static void main(String[] args) {
		int[] elements = { 23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43 };
		int count_odd = 0;
		int count_even = 0;
		int average_even = 0;
		int average_odd = 0;
		int sum_even = 0;
		int sum_odd = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				count_even = count_even + 1;

				sum_even = sum_even + elements[i];
				average_even = sum_even / count_even;
			} else {

				count_odd = count_odd + 1;

				sum_odd = sum_odd + elements[i];
				average_odd = sum_odd / count_odd;

			}
		}
		System.out.println(average_even + " " +"Even number ka average hai");
		System.out.println(average_odd + " " + "Odd number ka average hai") ;

	}
}
