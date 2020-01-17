package allQuestion;

public class Count_Sum__Of_Even_Odd_From_Array {

	public static void main(String[] args) {
		int[] elements = { 23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43 };

		int sum_even = 0;
		int sum_odd = 0;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				sum_even = sum_even + elements[i];
			} else {
				sum_odd = sum_odd + elements[i];

			}
		}
		System.out.println(sum_even + " " + "Even number ka sum hai");
		System.out.println(sum_odd + " " + "Odd number ka sum hai");

	}

}
