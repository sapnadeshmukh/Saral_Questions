package allQuestion;

public class Reverse_order {

	public static void main(String[] args) {
		String[] places= {"delhi", "gujrat", "rajasthan", "punjab", "kerala"};
		
		for (int i = places.length-1; i >= 0; i--) {  
            System.out.println(places[i] );  
		}
	}

}
