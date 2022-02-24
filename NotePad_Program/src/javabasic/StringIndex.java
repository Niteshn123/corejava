package javabasic;

public class StringIndex {

	public static void main(String[] args) {
		String s = "Nitesh vishvkarma" ;
		System.out.println(s.indexOf(" "));
		System.out.println(s.indexOf("Nitesh"));
		// its output is zero because "Nitesh" is not String type it is Character type.
        System.out.println(s.lastIndexOf("v"));
	}

}
