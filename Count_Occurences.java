package allQuestion;

import java.util.HashMap;

public class Count_Occurences {

	public static void main(String[] args) {
		char[] arr = { 'a', 'n', 't', 'a', 'a', 't', 'n', 'n', 'a', 'x', 'u', 'g', 'a', 'x', 'a' };
		

		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char i : arr) {
			if (hm.containsKey(i))
				hm.put(i, hm.get(i) + 1);
			else
				hm.put(i, 1);
		}
		System.out.println(hm);
		


	}

}
