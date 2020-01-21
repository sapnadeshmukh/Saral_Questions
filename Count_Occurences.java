package allQuestion;

public class Count_Occurences {

	public static void main(String[] args) {
		char[] list = {'a', 'n', 't', 'a', 'a', 't', 'n', 'n', 'a', 'x', 'u', 'g', 'a', 'x', 'a'};
		int i,count = 0;
		for(i=0;i<list.length;i++) {
			for (int j=i+1;j<list.length-1;j++) {
				if (list[i]==list[j]){
					count=count+1;
					
					
					
				}
			}
			System.out.println(count);

		}
		  
				
					
					
					
					

	}

}
