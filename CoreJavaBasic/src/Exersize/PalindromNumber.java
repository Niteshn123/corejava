package Exersize;

public class PalindromNumber {

	public static void main(String[] args) {
		int n = 212;
		int j = n;
		int reverse=0;
		
		while(n>0)
		{
			int k = n%10;
			n = n/10;
			reverse = reverse*10 + k;
			 
			 System.out.println(reverse);
		}
		
		if (j == reverse) {
			 System.out.println("Given number is palandrom");	
		}else {
			 System.out.println("Given number is not palandrom");

		}

	}

}
