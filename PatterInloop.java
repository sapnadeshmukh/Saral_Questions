package allQuestion;

public class PatterInloop {

	public static void main(String[] args) {
		int index;
		for (index=1;index<=100;index++) {
			if (index%2==0) {
				System.out.println(-index);
			}
			else {
				System.out.println(index);
			}
		}
	}

}
