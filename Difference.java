package allQuestion;

public class Difference {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int a1[] = { 2, 3, 1, 0, 6, 7 };
		int k = a.length;
		int l = a1.length;
		
		for (int i = 0; i < k; i++) {
			int count = 0;
			for (int j = 0; j < l; j++) {
				if (a[i] == a1[j])
					count++;
			}
			if (count == 0)
				System.out.print(a[i] + " ");

		
		}
		
	}

}
