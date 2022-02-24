package Exersize;

public class ReverseDigitNum {

	public static void main(String[] args) {
		int n =1235;
		//int n = i%100;
		//int j = n%10;
		//int sum = +j *100 ;
		//System.out.println(sum);
		
		while(n>0)
		{ 
			int r =n%10;
			 n = n/10;
			
			System.out.print(r);
		}
	}

}
