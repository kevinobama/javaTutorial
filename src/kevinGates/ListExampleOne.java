package kevinGates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;

public class ListExampleOne {

	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();		
		List<SettingRepository> personList=new ArrayList<SettingRepository>();  
		SettingRepository b1=new SettingRepository("Let us C","Yashwant Kanetkar","BPB");
		SettingRepository b2=new SettingRepository("Let us C","Yashwant Kanetkar","BPB");  
		personList.add(b1);
		personList.add(b2); 
		
		String arrayToJson = objectMapper.writeValueAsString(personList);
		
		System.out.println(arrayToJson);
		
//		ObjectMapper objectMapper = new ObjectMapper();
//    	//Set pretty printing of json
//    	//objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//    	
// 
//		Map<String,SettingRepository> list=new HashMap<String, SettingRepository>();  
//	    //Creating Books  
//		SettingRepository b1=new SettingRepository("Let us C","Yashwant Kanetkar","BPB");  
//	    SettingRepository b2=new SettingRepository("Data Communications & Networking","Forouzan","Mc Graw Hill");  
//	    
//	    //Adding Books to list  
//	    list.add("one",b1);  
//	    list.add("two",b2);  
//	    
//	    String arrayToJson = objectMapper.writeValueAsString(list);
//	    
//	    //Map<String, String> robots = new HashMap<String, String>();
//	    System.out.println(b1.robotName);
	    //System.out.println(personList);
	}

}
