package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/YY");
		
		
		String d = "04/02/1995";
		
		Date dob = f.parse(d);88
		
		try {
			dob = f.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dob);

	}

}
