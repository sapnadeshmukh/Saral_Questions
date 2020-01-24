package allQuestion;

import java.util.ArrayList;
import java.util.List;

public class MoreExercise7 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(342);
		list.add(75);
		list.add(23);
		list.add(98);

		List<Integer> list1 = new ArrayList<>();
		list1.add(75);
		list1.add(23);
		list1.add(98);
		list1.add(12);
		list1.add(78);
		list1.add(10);
		list1.add(1);

		List<Integer> new_list = new ArrayList<Integer>(list);
		new_list.retainAll(list1);
		System.out.println("new_list = " + new_list);

	}

}
