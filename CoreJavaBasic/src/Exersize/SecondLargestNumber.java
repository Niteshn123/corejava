package Exersize;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int [] a = { 1000, 2000, 5500, 5200, 25};
		int [] b = a;
		int x = 0;
		int  y = 0;
		for (int i = 0; i < a.length; i++) {
			if(b[i] > x) {
				 y = x;
				 x = b[i];
			}else if (b[i] > y && b[i] <x) {
				y=b[i];
			}
			
		}
	System.out.println(y);
	}
}
