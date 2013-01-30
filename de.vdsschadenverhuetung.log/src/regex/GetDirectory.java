package regex;

import java.util.*;
import java.text.*;
//import GetAllFiles.*;



public class GetDirectory {
		
	public static  String [] regExYesterday (String [] alldir){
		 //System.out.println(alldir.length);
		
		// String  helpDate =".*"+ getDate()+".*"; //EIGENTLICHERREGEX
		
		String helpDate =".*"+ "27.11.2012" +".*";  // TESTWERT
		
		
		int y= 0; //INDEXVAR
		 for (int g = 0; g < alldir.length; g++) {
			if (alldir[g] != null){
				if (alldir[g].matches(helpDate) == true){
					y++;
				}
			}
		 }
		 
		//System.out.println("ph1");
		 
		 String [] exactdir = new String[y]; 
		 int i= 0;
		 for (int j = 0; j < alldir.length; j++) {
			if (alldir[j] != null){
				if (alldir[j].matches(helpDate) == true){
					 exactdir [i] = alldir[j];
					 i++;
					
				 }
			}
		}
		
		// System.out.println("test " + exactdir[0]); 
		return exactdir;
		
	}
	
	
	private static String getDate() {
		Date dt = new Date();
		String yesterday; 
		// Festlegung des Formats:
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.YYYY");
		dt = deleteDay(1,dt);
		yesterday =df.format(dt);
		return yesterday;
		}
	
	private static Date deleteDay(int dayCount,Date incomingDate){
		Calendar cal = Calendar.getInstance();
		cal.setTime(incomingDate);
		cal.add(Calendar.DATE,-dayCount); //minus number would decrement the days
		return cal.getTime();
		}

		

	
	
	
}