package Exersize;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 212;
		int j=i;
		int r=0;
		int reverse = 0;
		
		while(i>0)
		{ 
			 r =i%10;
			  reverse = reverse*10+(r);
			 System.out.println(reverse);
			 i = i/10;		
	}
		if(j==reverse)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}	
	}
}

