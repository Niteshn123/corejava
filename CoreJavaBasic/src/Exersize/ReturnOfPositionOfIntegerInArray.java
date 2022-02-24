package Exersize;

public class ReturnOfPositionOfIntegerInArray {

	public static void main(String[] args) {
		
		int [] i = {5,4,3,2,1};
		test(i, 4);
		

	}
	
	public static int test(int[]i, int j) {
		 
		
		System.out.println(j);
		System.out.println(i.length);
		
		


		
		for (int k = 0; k < i.length; k++) {
			
			int l=i[k];
			
			if (l == j) {
				System.out.println("position" + k+1);

			}
			
			//System.out.println(l);
		
		return 0;
		
	}
		return j;

}}
