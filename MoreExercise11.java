package allQuestion;

public class MoreExercise11 {
	
	static void add(String s) {
		String[] words=s.split( " ,");//splits the string based on whitespace  
		for(String w:words){  
		System.out.print(w);  
		}
		
	}

	public static void main(String[] args) {
		add("java string split method by javatpoint" );

		
	}

}
