package basic;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Variousformate {
	public static void main(String[]args) {
		Date today= new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf= new SimpleDateFormat ("dd/mm/yy");
		String date= sdf.format(today);
		System.out.println(date);
		  
			
		
	}

}
