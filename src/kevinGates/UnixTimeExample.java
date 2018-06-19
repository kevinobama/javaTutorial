package kevinGates;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class UnixTimeExample {
	//yyyy-MM-dd HH:mm:ss
	private static final DateFormat dateFormatMinute = new SimpleDateFormat("dd HH:mm");
	public static void main(String[] args) {
		//two();   
		//doCalendarTwo();

	      //dateExample();
	      //System.out.println(getMinutesOneDayOne());
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date currentDate = new Date();
		System.out.println(dateFormat.format(currentDate));
	}
	
	public static void one(String[] args) {
		long unixTime = System.currentTimeMillis() / 1000L;

        int k=1;
        ArrayList minutesArray = new ArrayList();
         k=1;
         while(k<=100) {
        	 minutesArray.add(unixTime);
           k++;
         }
         
       Map<String, ArrayList> mapMinutes = new HashMap<String, ArrayList>();
       mapMinutes.put("minutes", minutesArray);
       
       System.out.println(mapMinutes);
       
	}	
	
	public static void two() {
		long unixTime = System.currentTimeMillis() / 1000L;

        int k=1;
        ArrayList minutesArray = new ArrayList();
         k=1;
         while(k<=24) {
        	 minutesArray.add(k+":00");
        	 minutesArray.add(k+":15");
        	 minutesArray.add(k+":30");
        	 minutesArray.add(k+":45");
           k++;
         }
         
       Map<String, ArrayList> mapMinutes = new HashMap<String, ArrayList>();
       mapMinutes.put("minutes", minutesArray);
       
       System.out.println(mapMinutes);
       
	}	
    public static String getDateTimePlusMinute(int minutes) {
        Date currentDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        calendar.add(Calendar.MINUTE, minutes);

        return dateFormatMinute.format(calendar.getTime());
    }
    
	public static void doCalendar() {
		Calendar cal = GregorianCalendar.getInstance();
	    System.out.println("Minutes : "+ cal.get(Calendar.MINUTE));
	    System.out.println("Seconds :" + cal.get(Calendar.SECOND));
	    //cal.add(Calendar.SECOND, 50);
	    cal.add(Calendar.MINUTE, 2);
	    System.out.println("Minutes : "+ cal.get(Calendar.MINUTE));
	    System.out.println("Seconds :" + cal.get(Calendar.SECOND));	
	    
		int k=1;
		ArrayList minutesArray = new ArrayList();

		k=1440;
		while(k>=0) {
			minutesArray.add(getDateTimePlusMinute(-k));

			k=k-15;
		}
		
		Map<String, ArrayList> mapMinutes = new HashMap<String, ArrayList>();
		mapMinutes.put("minutes", minutesArray);
		
		System.out.println(mapMinutes);
		
		//System.out.println((24*60));		
		//Calendar now = Calendar.getInstance();
		//System.out.println(now.get(Calendar.MINUTE));
		System.out.println(getDateTimePlusMinute(3));
		
	}
	
	public static void doCalendarOne() {
 		
		Calendar now = Calendar.getInstance();
		now.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		int currentHour = now.get(Calendar.HOUR_OF_DAY);
		
		int k=1;
		ArrayList minutesArray = new ArrayList();

		k=currentHour+1;
		while(k <24) {			
			minutesArray.add(k+":00");
			minutesArray.add(k+":15");
			minutesArray.add(k+":30");
			minutesArray.add(k+":45");
			k++;
		}
		
//		k=1;
//		while(k<=now.get(Calendar.HOUR_OF_DAY)) {			
//			minutesArray.add(k+":00");
//			minutesArray.add(k+":15");
//			minutesArray.add(k+":30");
//			minutesArray.add(k+":45");
//			
//			k++;
//		}
		
		//Map<String, ArrayList> mapMinutes = new HashMap<String, ArrayList>();
		//mapMinutes.put("minutes", minutesArray);
		
		//System.out.println(mapMinutes);
						
	}
	
	public static void doCalendarTwo() {
		Calendar now = Calendar.getInstance();
		now.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		int currentHour = now.get(Calendar.HOUR_OF_DAY);
		int currentMinute = now.get(Calendar.MINUTE);
		int minuteRange =  getMinuteRange(currentMinute);
		System.out.println(currentHour);
		System.out.println(currentMinute);
		System.out.println(minuteRange);
	}
	
	public static int getMinuteRange(int Minute) {
		int minuteRange = 0;
		if(Minute>=0 && Minute <15) {
			minuteRange  = 00;
		} if(Minute>=15 && Minute <30) {
			minuteRange  = 15;
		} if(Minute>=30 && Minute <45) {
			minuteRange  = 30;
		} if(Minute>=45 && Minute <60) {
			minuteRange  = 45;
		} 
		return minuteRange;
	}
	
	public static void dateExample() {	      
//      Date now = new Date( );
//
//      SimpleDateFormat formatHour = new SimpleDateFormat ("HH");
//      SimpleDateFormat formatMinute = new SimpleDateFormat ("mm");
//      
//		int currentHour = Integer.parseInt(formatHour.format(now));	;
//		int currentMinute = Integer.parseInt(formatMinute.format(now));
//		int minuteRange =  getMinuteRange(currentMinute);
//		System.out.println(currentHour);
//		System.out.println(currentMinute);
//		System.out.println(minuteRange);
		
		  Calendar cal = Calendar.getInstance();   // GregorianCalendar
//	      System.out.println("Calendar's toString() is : " + cal + "\n");
//	      System.out.println("Time zone is: " + cal.getTimeZone() + "\n");
	  
	      // An Easier way to print the timestamp by getting a Date instance
	      Date date = cal.getTime();
	      System.out.println("Current date and time in Date's toString() is : " + date + "\n");
	      System.out.println(java.util.TimeZone.getDefault().getID());
	}
	
    public static Map<String, ArrayList> getMinutesOneDayOne() {
    	Calendar now = Calendar.getInstance();
    	now.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
		int k=1;
		int currentHour = now.get(Calendar.HOUR_OF_DAY);
		int currentMinute = now.get(Calendar.MINUTE);
		ArrayList minutesArray = new ArrayList();
		
		k=currentHour+1;
		while(k <24) {			
			minutesArray.add(k+":00");
			minutesArray.add(k+":15");
			minutesArray.add(k+":30");
			minutesArray.add(k+":45");
			k++;
		}
		
		k=0;
		while(k<= currentHour) {
			
			minutesArray.add(k+":00");
			minutesArray.add(k+":15");
			minutesArray.add(k+":30");
			minutesArray.add(k+":45");
			k++;
		}
		

		Map<String, ArrayList> mapMinutes = new HashMap<String, ArrayList>();
		mapMinutes.put("minutes", minutesArray);

		return mapMinutes;
	}	
}
