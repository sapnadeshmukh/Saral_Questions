package allQuestion;

import java.util.ArrayList;

public class MoreExercise11 {
	
	static void add(String s) {
		int a;
		ArrayList<String> list = new ArrayList<String>();

		String[] words=s.split(" ");//splits the string based on whitespace 
		String s1[] = s.split(" ");
		for (a = 0; a < s1.length ; a++)
			list.add ("\"" + s1[a] + "\"");
		System.out.println(list);

		
		
	}

	public static void main(String[] args) {
		
		add( "NavGurukul is an alternative to higher education reducing the barriers of current formal education system");

		
	}

}
