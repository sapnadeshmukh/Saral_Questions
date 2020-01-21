package allQuestion;

public class Debug4 {

	public static void main(String[] args) {
		int[] marks = { 10,32, 42, 65, 67, 89, 76, 38, 67};

		int total_marks = 0;
		int counter = 0;
		while (counter < marks.length) {
					total_marks = total_marks + marks[counter];
					counter = counter + 1;
		}
		System.out.println(total_marks);

	}

}
