package allQuestion;

public class Total_sum {

	public static void main(String[] args) {
		int number = 30;
		int[] n = {10, 11, 12, 13, 14, 17, 18, 19};
		System.out.println("Pairs of elements and their sum : ");
		 
		  for (int i =  0; i < n.length; i++){
			  for (int j  = i+1; j < n.length; j++) {
		  
		  			if(n[i]+n[j] == number){
		  			  System.out.println(n[i]+" + "+n[j]+" =  "+number);

		  			}
			  }
		  }
	
	}
}
