package co.edureka.io;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAPI {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(">> Its: "+date);
		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yy | hh:mm:ss");
		SimpleDateFormat format3 = new SimpleDateFormat("hh:mm:ss");
		
		String formattedDate1 = format1.format(date);
		String formattedDate2 = format2.format(date);
		String formattedDate3 = format3.format(date);
		
		System.out.println(">> formattedDate1 "+formattedDate1);
		System.out.println(">> formattedDate1 "+formattedDate2);
		System.out.println(">> formattedDate1 "+formattedDate3);
		
		// PS: Calendar API : Please explore it :)

	}

}
