package kevinGates;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVExample {

	public static void main(String[]args) throws FileNotFoundException{
		//exportAsCsv();
		String pairDays = "LTC_06/15";
		
		//String s1="java string split method by javatpoint";  
		String[] pairDaysArray=pairDays.split("_");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		System.out.println(pairDaysArray[0]);
		System.out.println(pairDaysArray[1]);
		
//		for(String pairDay:pairDaysArray){  
//		   System.out.println(pairDay);  
//		}  

    }
	
	public static void exportAsCsv() throws FileNotFoundException{
		String path = "/var/www/java/javaTutorial/src/kevinGates/holdings.csv";
		//String path = "/var/www/java/javaTutorial/src/kevinGates/trades.csv";
		String pairDays = "LTC_06/15";
        PrintWriter pw = new PrintWriter(new File(path));
                
        StringBuilder sb = new StringBuilder();
        sb.append("id");
        sb.append(',');
        sb.append("Name");
        sb.append('\n');
        int k = 1;
        while(k<20) {
        	
	        sb.append("1");
	        sb.append(',');
	        sb.append("Prashant Ghimire" + k);
	        sb.append('\n');
	        k++;
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
}
