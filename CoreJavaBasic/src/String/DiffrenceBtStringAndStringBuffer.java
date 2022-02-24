package String;

public class DiffrenceBtStringAndStringBuffer {

		public static void main(String[] args) {
			String s = "rays technologies";
			String s1 = "rays technologies";
			
			s.concat("hello");
			
			System.out.println(s1);
			
			StringBuffer sb =new StringBuffer("hello");
			sb.append("rays");
			
			System.out.println(sb);
			
	}
	}
	  


