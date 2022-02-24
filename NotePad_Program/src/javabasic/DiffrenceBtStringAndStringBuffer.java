package javabasic;

public class DiffrenceBtStringAndStringBuffer {

	public static void main(String[] args) {
		String s = "rays technologies";
		s.concat("hello");
		
		System.out.println(s);
		
		StringBuffer sb =new StringBuffer("hello");
		sb.append("rays");
		
		System.out.println(sb);
		
}
}
  