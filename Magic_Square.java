package allQuestion;

public class Magic_Square {

	public static void main(String[] args) {
		
		int[][]magic_square = {
				{8, 3, 3},
			    {1, 4, 6},
			    {6, 7, 1}};
		//For row
		int index;
		int average1=0;
		int sum1=0;

		for (index=0;index<magic_square.length;index++) {
			int j;

			for(j=0;j<magic_square[index].length;j++) {
				sum1=sum1+magic_square[index][j];
			}
//			System.out.println(sum1);
			average1=sum1/magic_square.length;
			
		}
//		System.out.println(average1);
		
		//		for column
		int row;
		int average2 = 0;
		int sum2=0;

		for (row=0;row<magic_square.length;row++) {
			int colm;
			for(colm=0;colm<magic_square[row].length;colm++) {
				sum2=sum2+magic_square[row][colm];
			}
		
//			System.out.println(sum2);
			average2=sum2/magic_square.length;
		}
//		System.out.println(average2);
	
		
//		for left to right diagonal
		
		int sum3 = 0;
		for (int i=0;i<magic_square.length;i++) {

			
			for(int j=0;j<magic_square[i].length;j++) {
				if (magic_square[i]==magic_square[j]) {
					sum3=sum3+magic_square[i][j];
				
				}
			}
			
		}
//			System.out.println(sum3);

			
		
//				for right to left diagonal

		int i;
		int sum4=0;
		int j=0;
		
		for(i=magic_square.length-1; i >= 0; i--) {
			sum4+=magic_square[i][j];
			j+=1;
		}
//		System.out.println(sum4);
	
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(sum3);
		System.out.println(sum4);
	if ((average1 ==average2) && (sum3==sum4) && (sum3==average1)){
		System.out.println("It is magic square");
		
	}else {
		System.out.println("It is not magic square");
	}
		
	}
	

}
