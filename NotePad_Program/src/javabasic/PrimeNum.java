package javabasic;

public class PrimeNum {

	public static void main(String[] args) {
		
		int i=2;
		int n=2;
		if (n<i)
		{
			System.out.println("is not prime");
		}
		
		for(i=2; i<=n; i++)
		{
			if(n%i==0)
			{
				if(n==i)
				{
					System.out.println("Given Number is Prime Number") ;
				}else {
					System.out.println("Given Number is not Prime Number");
					break;
				}
			}
		}
	}
}
		 
		
		

	
	



