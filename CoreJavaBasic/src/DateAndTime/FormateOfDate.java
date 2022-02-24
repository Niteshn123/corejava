package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormateOfDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		 String s=sdf.format(d);
		 System.out.println(d);
		System.out.println(s);
		
		String a="12/04/1995";
		Date d1=sdf.parse(a);
		System.out.println(d1);
	}

	}


