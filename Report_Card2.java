package allQuestion;

public class Report_Card2 {

	public static void main(String[] args) {
		int[][] arr = { { 78, 76, 94, 86, 88 }, { 91, 71, 98, 65 }, { 95, 45, 78 } };

		int sum = 0;
		int average = 0;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum = sum + arr[row][col];
			}
			average = sum / arr[row].length;
			System.out.println(average);
			sum = 0;
		}
		System.out.println(average);

	}

}
