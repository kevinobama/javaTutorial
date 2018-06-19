package kevinGates;

import java.util.*;  

public class SettingRepository {
 
	public String robotName;
	public String strategy; 
	public String status;
	
	public SettingRepository(String robotName, String strategy, String status) {  
	    this.robotName = robotName;  
	    this.strategy = strategy;  
	    this.status = status;  
	}  	
	
	public String toString() {
	    return "[" + robotName + " " + strategy +
		       " " + status +"]";
	}	
}

