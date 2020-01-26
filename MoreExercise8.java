package allQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class MoreExercise8 {


	public static void main(String[] args) {
		ArrayList <Integer > list_name1 =new ArrayList<>(Arrays.asList(1, 5, 10, 12, 16, 20));
		ArrayList <Integer > list_name2 =new ArrayList<>(Arrays.asList(1, 2, 10, 13, 16));
		list_name1.addAll(list_name2);
//		System.out.println(list_name1);
		HashSet <Integer> new_list=new HashSet<Integer>();
		for (int index:list_name1) {
			new_list.add(index);
		}
		System.out.println(new_list);

		
	}

}
