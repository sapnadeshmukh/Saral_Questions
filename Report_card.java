package allQuestion;

public class Report_card {

	public static void main(String[] args) {
		int[][] arr = { { 78, 76, 94, 86, 88 }, { 91, 71, 98, 65 }, { 95, 45, 78 },{87, 67, 49, 68, 88}};

		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
		
					sum=sum+arr[row][col];
				}
		}
		

		System.out.println(sum); 
	}

}
