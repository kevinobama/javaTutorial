package kevinGates.fasterxml.jackson;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Basic {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		objectMapper();
		toMap();
	}
	
	public static void objectMapper() throws JsonParseException, JsonMappingException, IOException {
		  System.out.println("start");
		  ObjectMapper mapper = new ObjectMapper(); // create once, reuse	
		  		  
		  MyValue user = mapper.readValue("{\"name\":\"billgates\", \"age\":28}", MyValue.class);
		  
		  System.out.println(user.name);
		  System.out.println(user.age);
		  
		  System.out.println("end");
	}
	
	public static void toMap() throws JsonParseException, JsonMappingException, IOException {
		  System.out.println("start  toMap");
		  ObjectMapper mapper = new ObjectMapper(); // create once, reuse	
		  		  
		  Map<String, Integer> user = mapper.readValue("{\"name\":\"billgates\", \"age\":28}", Map.class);
		  
		  System.out.println(user);
		  
		  System.out.println("end");
	}	
}



