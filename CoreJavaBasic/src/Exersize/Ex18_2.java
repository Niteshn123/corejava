package Exersize;

public class Ex18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 4, 3, 2, 1 };

		Ex18_2 e = new Ex18_2();

		int z = e.position1(a, 1);

		System.out.println(z);

	}

	public int position1(int[] b, int c){
		
		int k = 0;
		for (int i = 0; i < b.length; i++) {
			
			if(c == b[i]) {
				k = i;
				
				return k;
			}

	public int position(int[] b, int c) {

		int k = 0;

		for (int i = 0; i < b.length; i++) {

			if (c == b[i]) {
				k = i;

				return k;
			}
		}
		if (k == 0) {

			return -1;
		}
		return k;
	}

}
