package allQuestion;

import java.util.HashSet;

public class Duplicates {

	public static void main(String[] args) {

//		ArrayList<Character> list=new ArrayList<Character>();
			
			int [] arr1 = {19, 17, 12, 17, 17, 18, 10, 17, 14, 12, 19, 17, 12, 13, 11};

			HashSet<Integer>arr = new HashSet<Integer>();
			for(int i : arr1) {
				arr.add(i);
			}
		
			System.out.println(arr);
			 
			
			
			
	}
	

}
