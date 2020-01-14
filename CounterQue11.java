package allQuestion;

public class CounterQue11 {

	public static void main(String[] args) {
		int sum = 0;
		for(int index=30;index<=420;index++) {
			if (index%8==0) {
				sum=sum+index;
			}
		}System.out.println(sum);
	}

}
