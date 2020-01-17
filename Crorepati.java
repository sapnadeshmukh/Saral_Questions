package allQuestion;

public class Crorepati {

	public static void main(String[] args) {
		int[] kitna_paisa_hai = { 3000, 600000, 324990909, 90990900, 30000, 5600000, 690909090, 31010101, 532010, 510,
				4100 };
		int count_lakhpati = 0;
		int count_crorepati = 0;
		int count_dilwale = 0;
		for (int i = 0; i < kitna_paisa_hai.length; i++) {

			if (kitna_paisa_hai[i] >= 10000000) {
				count_crorepati = count_crorepati + 1;
			} else if (kitna_paisa_hai[i] >= 100000 && kitna_paisa_hai[i] < 10000000) {
				count_lakhpati = count_lakhpati + 1;
			} else {
				count_dilwale = count_dilwale + 1;

			}

		}
		System.out.println(count_crorepati + " "+"Crorepati hai");

		System.out.println(count_lakhpati + " "+"Lakhpati hai");
		System.out.println(count_dilwale + " "+" Dilwale hai");
	}

}
