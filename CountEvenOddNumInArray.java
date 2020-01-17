package allQuestion;

public class CountEvenOddNumInArray {
	public static void main(String[] args) {
		int []elements = {23, 14, 56, 12, 19, 9, 15, 25, 31, 42, 43};
		int count_odd=0;
		int	count_even=0;
		for(int i=0;i<elements.length;i++) {
			if(elements[i]%2==0) {
				count_even=count_even+1;
			}else {
				count_odd=count_odd+1;
			}
	
		}
		System.out.println(count_even + " " +  " Even number hai array mai");
		System.out.println(count_odd +" " +  "Odd number hai array mai");
			
			
		}
}
