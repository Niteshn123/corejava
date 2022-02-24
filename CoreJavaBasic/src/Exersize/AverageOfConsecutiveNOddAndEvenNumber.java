package Exersize;

public class AverageOfConsecutiveNOddAndEvenNumber {

	public static void main(String[] args) {
		
		int n = 10;
		int sum = 0;
		int sum1 =0;
		for(int i=10; i>=0; i--) {
			
			if(i==0)
			{
			   sum = sum+i;
			}
			 // int average = sum/i;
			//  System.out.println(average);
			  
		/*	//}else
			{  sum1 = sum1+i;
			 // int average = sum1/i;
			//  System.out.println(average);
			}	*/
		}
		 int average = sum/n;
		  System.out.println(average);
	}
}


