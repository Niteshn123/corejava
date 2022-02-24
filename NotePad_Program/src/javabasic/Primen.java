package javabasic;

public class Primen {

	public static void main(String[] args) {
		
		int i=1;
		int n=10;
		
		for(i=2; i<=n; i++)
		{
			if(n%i==0)
			{
				if(n==i)
				{
					System.out.println("Given Number is Prime Number") ;
				}else {
					System.out.println("Given Number is not Prime Number");
					
				}
			}
		}
	}
}
		 
		
		

	
	



