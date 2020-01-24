package allQuestion;

public class Difference {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int a1[] = { 2, 3, 1, 0, 6, 7 };
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a1.length; j++) {
				if (a[i] == a1[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(a[i] + " ");
			}
		
		}
		
	}

}
