package allQuestion;

public class Duplicates {

	public static void main(String[] args) {
		int [] n = {1,2,3,3,4,5,4,6,9,
};
	
		for (int i=0;i<n.length;i++) {
			for (int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					System.out.println(n[j]);
				}
				
			}
			
		}		
	}

}
