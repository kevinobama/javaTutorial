package kevinGates;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0.5~1.5
//		Double min = 0.5;
//		Double max = 1.5;
//				 
//		Random randomNum = new Random();
	 
		//Double showMe = min + randomNum.nextDouble(max);
		//Double showMe = min + randomNum.nextDouble();
	 
		double min = 0.5D;
	    double max = 1.5D;
	    double generatedDouble = min + new Random().nextDouble() * (max - min);
		
		System.out.println("past24HoursVolume:"+ generatedDouble);
	}

}
