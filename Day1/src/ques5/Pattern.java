//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 5 6 
//		1 2 3 4 5 6 7 
//		1 2 3 4 5 6 7 8
	
package ques5;

public class Pattern {

		public static void main(String[] args) {
			
			for(int i=1;i<=8;i++){
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	
}
