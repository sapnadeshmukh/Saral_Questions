package allQuestion;

public class Method4 {
	
	static void display(int a[],int b[]) {
		int i;
		for ( i=0;i<a.length;i++) {
			
			int l=a[i]+b[i];
			System.out.println(l);
			System.out.println("--------------------");
		}
			
	}
	

	public static void main(String[] args) {
		int x[]= {50, 60, 10};
		int y[]= {10, 20, 13};
		display(x,y);
	}

}
