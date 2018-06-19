package kevinGates;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class LongDemo {
	   public static void main(String[] args) {

	      // parses the string argument
	      //long a = Long.parseLong("1452");
	      //long b = Long.parseLong("26");
	      //long c = Long.parseLong("1529375816");

	      //long m = c;
	  long unixSeconds = 1529375816;
	  
	  
	  ;
	  System.out.println("1529375816.0".replaceAll(".0", ""));
	  
	   // convert seconds to milliseconds
//	   Date date = new java.util.Date(unixSeconds*1000L); 
//	   // the format of your date
//	   SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//	   
//	   //dateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT-4")); 
//	   
//	   String formattedDate = dateFormat.format(date);
	  
	   System.out.println(unixTimeToDate(unixSeconds));
	   

	   }
	   
	   public static String unixTimeToDate(long unixSeconds) {
		   if(unixSeconds>0) {
			   Date date = new java.util.Date(unixSeconds*1000L); 
			   
			   SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			   
			   //dateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+8")); 
			   return dateFormat.format(date);
		   } else {
			   return "";
		   }
		   
		   

		}
}
