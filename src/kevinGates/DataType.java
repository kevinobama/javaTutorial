package kevinGates;

import java.text.DecimalFormat;
import java.util.Random;

public class DataType {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double qyt = 0.0000000389283283;
		double qytOne = 800.0000000389283283;
		
		System.out.println(qyt);
 		
		DecimalFormat decimalFormat = new DecimalFormat("#.########");
		System.out.println(decimalFormat.format(qyt));  
		System.out.println(decimalFormat.format(qytOne));

        Random random = new Random();

        // create a big random number - maximum is ffffff (hex) = 16777215 (dez)
        
        // format it as hexadecimal string (with hashtag and leading zeros)
        String colorCode = String.format("#%06x", random.nextInt(256*256*256));

        // print it
        System.out.println(colorCode);
         
	}
}
