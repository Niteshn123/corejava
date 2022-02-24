package String;

import java.nio.charset.Charset;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		String s = "vishwakarma" ;
		char c = 'a' ;
		
		for(int i=0; i<s.length(); i++) {
			
			char b=s.charAt(i);
			if(b==c) {
				 count=count+1;
			}
		} System.out.println(count);
				
			}
		}
	


