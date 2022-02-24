package Exersize ;

public class PalindromByString {

	public static void main(String[] args) {
		
		String s = "Nitesh";
		String s1 = "";
		System.out.println(s);
		
		if(s.length()==0) {
			System.out.println("a");
			
		}
		else {

		System.out.println(s.length());
		for (int i=s.length()-1;i>=0;i--) {
			
			char c = s.charAt(i);
			System.out.println(i);
			s1 = s1 + c;
		}
		System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s1.length());

		if (s1.equals(s)) {
		//if (newS!=s) {
		
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not palindrome");

		}
		}

	}

}
