package GeterSeter;

public class Values {

	public static void main(String[] args) {

		Result r = new Result();
		r.setName("Nitesh");
		
		String s = r.getName();
		System.out.println(s);
		
		Result r1 = new Result();
		r1.setMarks(50);
		
		System.out.println(r1.getMarks());

	}

}
