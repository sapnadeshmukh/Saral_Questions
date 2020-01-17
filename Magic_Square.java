package allQuestion;

public class Magic_Square {

	public static void main(String[] args) {
		int[][]magic_square = {
		                       {8, 4, 4},
		                       {1, 10, 9},
		                       {9, 7, 2}};
		//For row
		int i;
		for (i=0;i<magic_square.length;i++) {
			int j;
			int sum=0;
			for(j=0;j<magic_square[i].length;j++) {
				sum=sum+magic_square[i][j];
			}
			System.out.println(sum);
		}
//		for column
		int i;
		for (i=0;i<magic_square.length;i++) {
			int j;
			int sum=0;
			for(j=0;j<magic_square[i].length;j++) {
				sum=sum+magic_square[j][i];
			}
			System.out.println(sum);
		}
		
//		for left to right diagonal
		int i;
		int sum = 0;
		for (i=0;i<magic_square.length;i++) {

			
			for(int j=0;j<magic_square[i].length;j++) {
				if (magic_square[i]==magic_square[j]) {
				sum=sum+magic_square[i][j];
				
				}
			}
			
		}
		System.out.println(sum);
	}

	
		
	
	
	
}
