package allQuestion;

public class Count_Occurences {

	public static void main(String[] args) {
		char[] list = {'a', 'n', 't', 'a', 'a', 't', 'n', 'n', 'a', 'x', 'u', 'g', 'a', 'x', 'a'};
		
		  
				
					
					int i,j,k;
					char[] ch = list.length;
					int len=ch.length;
					for ( i = 0; i < len; i++) {
					int counter = 0;
					char c=list.charAt(i);
					for ( j = 0; j < len; j++) {
					if (c==ch[j]){
					counter++;
					ch[j]='\u0000';
					}
					}
					if(counter>0)System.out.println(c+"="+counter){

					
					}
					}

	}

}
