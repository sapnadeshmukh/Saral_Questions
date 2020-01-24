package allQuestion;

public class Second_Max {

	public static void main(String[] args) {
		int[] numbers = {50, 123456,40, 23, 70, 56, 12, 5, 10, 7};
		int temp;
		int index;
		int j = 0;

		for( index=0;index<numbers.length;index++) {
			for(j=index+1;j<numbers.length;j++) {
				if(numbers[index]<numbers[j]) {
					temp=numbers[index];
					numbers[index]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		
		System.out.println("Second maximun number is :" + numbers[1]);


	}

}
