package allQuestion;

import java.util.HashSet;

public class MoreExercise6 {

	public static void main(String[] args) {
		String[] list = { "Empathy", "Empathy", "Kindness", "Kindness", "Compassion", "Humble", "Humble" };

		HashSet<String> h = new HashSet<String>();
		for (String i : list) {
			h.add(i);

		}
		System.out.print(h);

	}

}
