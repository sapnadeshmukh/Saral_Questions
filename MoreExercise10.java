package allQuestion;

public class MoreExercise10 {

	public static void main(String[] args) {
		int arr[][]= {{45, 21, 42, 63}, {12, 42, 42, 53}, {42, 90, 78, 13}, {94, 89, 78, 76}, {87, 55, 98, 99}};
	

				int i;
				for ( i=0; i<arr.length;i++) {
					int small_list_length = arr[i].length;
					
				    int j;
				    int max_num=0;
				    for( j=0; j<small_list_length;j++) {
				        if (max_num<arr[i][j]) {
				            max_num=arr[i][j];
				        }
				    }
				    System.out.println(max_num);
				}
	}
				    

}
