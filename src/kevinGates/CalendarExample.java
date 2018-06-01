package kevinGates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CalendarExample {

    private static final DateFormat dateFormatMinute = new SimpleDateFormat("HH:mm");
    
	public static void main(String[] args) {
//		int currentMinute = getCurrentMinute();
//				
//		int i=currentMinute-15;
//		
//		while(i<1440) {
//			  String each15Minutes = getDateTimePlusMinute(-i);
//			  System.out.print(each15Minutes+"  ");
//			  i=i+15;
//		}

		ArrayList minutesArray = new ArrayList();
		int currentMinute = getCurrentMinute();

		int k=currentMinute-15;

		while(k<1440) {
			String each15Minutes = getDateTimePlusMinute(-k);
			minutesArray.add(each15Minutes);

			k = k + 15;
		}
		Collections.reverse(minutesArray);
		//Map<String, ArrayList> mapMinutes = new HashMap<String, ArrayList>();
		//mapMinutes.put("minutes", minutesArray);
		
		//return mapMinutes;		
		
	}

    public static String getDateTimePlusMinute(int minutes) {
    	
        Date currentDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        calendar.add(Calendar.MINUTE, minutes);

        return dateFormatMinute.format(calendar.getTime());
    }	
    
    public static int getCurrentMinute() {    	
        Date currentDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
       
        return calendar.get(Calendar.MINUTE);
    }
}
