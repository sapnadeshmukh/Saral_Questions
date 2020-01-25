package allQuestion;

public class Method5 {

		
		
		static void  display(int a[],int b[]) {
			int i;
			for ( i=0;i<a.length;i++) {
				
				if (a[i]%2==0  && b[i]%2==0) {
					System.out.println("dono even hain");
				}else {
					System.out.println("dono even nahi hai");
				}
				System.out.println("--------------------");

			}
				
		}
		

		public static void main(String[] args) {
			int x[] = {2, 6, 18, 10, 3, 75}; 
			int y[] = {6, 19, 24, 12, 3, 87};
			display(x,y);
		}
	

}
