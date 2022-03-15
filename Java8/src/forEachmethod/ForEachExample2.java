package forEachmethod;

import java.util.ArrayList;

public class ForEachExample2 {
	
	public static void main(String[] args) {
		
		ArrayList e = new ArrayList();
		 e.add("one");
		 e.add("two");
		 e.add("three");
		 e.add("four");
		 e.add("five");
		 
		 e.forEach(li-> System.out.println(li));
		
	}
	

}
