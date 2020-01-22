package allQuestion;

public class Method3 {
	int c;
	void add (int a,int b){
		
		c=a + b;
		
	}

	
	public static void main(String[] args) {
		Method3 r=new Method3();
	
		r.add(56,12);
		System.out.println("Addition of two numbers is : "+r.c);
	}



}