package forEachmethod;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Nitesh 21");
		
		list.forEach(lit->System.out.println(list));
		
		for(String s : list) {
			System.out.println(list);
		}

	}

}
