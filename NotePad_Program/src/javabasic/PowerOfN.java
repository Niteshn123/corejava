package javabasic;

import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k ;
		int j ;

		int multi=1;
		
		System.out.println("Number ");
		k = sc.nextInt();
		
		System.out.println("Power of given number ");
		j = sc.nextInt();
		
		
		for(int i=0; i<j; i++)
			
			multi=multi*k;

	
      System.out.println(multi);


}
}
