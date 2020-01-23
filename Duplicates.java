package allQuestion;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
//			List<String> list = new LinkedList<String>();
//			for (int i = 0; i < 10; i++) {
//				list.add(String.valueOf(i));
//			}
//			for (int i = 0; i < 5; i++) {
//				list.add(String.valueOf(i));
			
			int [] abc = [19, 17, 12, 17, 17, 18, 10, 17, 14, 12, 19, 17, 12, 13, 11];
		
	}
		public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
	 
			final Set<String> setToReturn = new HashSet<String>();
			final Set<String> set1 = new HashSet<String>();
	 
			for (String yourInt : listContainingDuplicates) {
				if (!set1.add(yourInt)) {
					setToReturn.add(yourInt);
				}
			}
			return setToReturn;
		}
	

	}




