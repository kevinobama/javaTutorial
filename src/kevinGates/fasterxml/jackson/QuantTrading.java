package kevinGates.fasterxml.jackson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class QuantTrading {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		//arrayJson();
		//printArray();
		String emails = "[ \"huanghe4996798@sina.com\"\n \"18801966660@139.com\" ]";
		echo(replaceString(emails));
		//echo(prettyRedisJson("email_address", emails));
	}
		
	public static void jsonObject() throws JsonParseException, JsonMappingException, IOException {
		  //System.out.println("start  toMap");
		  ObjectMapper mapper = new ObjectMapper(); // create once, reuse	
		  String json = "{\"enable\": false, \"order\": 0.0, \"trade\": 0.0, \"response\": \"stop\"}";
		  Map<String, Integer> user = mapper.readValue(json, Map.class);
		  
		  echo(user);
		  echo(user.keySet());
		  for (Map.Entry<String, Integer> entry : user.entrySet())
		  {
		      echo(entry.getKey() + "/" + entry.getValue());
		  }
		  
	}	
	
	public static void arrayJson() throws JsonParseException, JsonMappingException, IOException {
		  //System.out.println("start  toMap");
		  ObjectMapper mapper = new ObjectMapper(); // create once, reuse	
		  String json = "[{\"account_id\": \"exx/c2fac6cc-9d22-4d1c-9f84-77d9ebf6656f\", \"currency\": \"BTC\", \"enable\": false, \"min_amount\": 0.0, \"max_amount\": 0.0, \"response\": \"\"}, {\"account_id\": \"exx/c2fac6cc-9d22-4d1c-9f84-77d9ebf6656f\", \"currency\": \"ETP\", \"enable\": false, \"min_amount\": 0.0, \"max_amount\": 0.0, \"response\": \"\"}]";
		  //String json = "{\"enable\": false, \"order\": 0.0, \"trade\": 0.0, \"response\": \"stop\"}";
//		  Map<String, Integer> user = mapper.readValue(json, Map.class);
//		  
//		  echo(user);
//		  echo(user.keySet());
//		  for (Map.Entry<String, Integer> entry : user.entrySet())
//		  {
//		      echo(entry.getKey() + "/" + entry.getValue());
//		  }
		  
		  //ObjectMapper mapper = new ObjectMapper();
		  //System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
		  prettyJSON(json);
		  
	}	
	
	public static String prettyJSON(String jsonString) throws JsonParseException, JsonMappingException, IOException {
		  ObjectMapper mapper = new ObjectMapper(); // create once, reuse	
		  Object jsonObject = mapper.readValue(jsonString, Object.class);	
		  String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
		  prettyJson = replaceString(prettyJson);
		  echo(prettyJson);
		  return prettyJson;
	}
	
	public static void echo(Object any) {
		System.out.println(any);
	}
	
	public static String replaceString(String stringData) {
		if(stringData != null && !stringData.isEmpty()) {
			stringData = stringData.replace("{", "");
			stringData = stringData.replace("}", "");
			stringData = stringData.replace("[", "");
			stringData = stringData.replaceAll("]", "");
			
			stringData = stringData.replaceAll("\"", "");
		}

		return stringData;
	}
	
	public static void printArray() {
		// array
//        String[] arrayStr = new String[]{"Java", "Node", "Python", "Ruby"};
//        System.out.println(Arrays.toString(arrayStr));
//        // Output : [Java, Node, Python, Ruby]
//
//		int[] arrayInt = {1, 3, 5, 7, 9};
//        System.out.println(Arrays.toString(arrayInt));
//        // Output : [1, 3, 5, 7, 9]
//
//        // 2d array, need Arrays.deepToString
//        String[][] deepArrayStr = new String[][]{{"mkyong1", "mkyong2"}, {"mkyong3", "mkyong4"}};
//        System.out.println(Arrays.toString(deepArrayStr));
        // Output : [[Ljava.lang.String;@23fc625e, [Ljava.lang.String;@3f99bd52]

//        System.out.println(Arrays.deepToString(deepArrayStr));
//        // Output : [[mkyong1, mkyong2], [mkyong3, mkyong4]
//
//        int[][] deepArrayInt = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};
//        System.out.println(Arrays.toString(deepArrayInt));
//        // Output : [[I@3a71f4dd, [I@7adf9f5f]
//
//        System.out.println(Arrays.deepToString(deepArrayInt));
//        // Output : [[1, 3, 5, 7, 9], [2, 4, 6, 8, 10]]

        //String[] email = new String[]{"huanghe4996798@sina.com", "18801966660@139.com" };
        
        //System.out.println(Arrays.toString(email));
        String emails = "[huanghe4996798@sina.com, 18801966660@139.com]";
        emails = replaceString(emails);
        String[] stringArray = emails.split(",");
        
        for (String element : stringArray) {
            System.out.println(element);
        }
        
        //echo(emails);
	}
	
	public static String prettyArray(String stringArray) {        		
		StringBuilder prettyString = new StringBuilder();
		stringArray = replaceString(stringArray);
        String[] stringArrayNew = stringArray.split(",");
        
        for (String value : stringArrayNew) {            
            prettyString.append(value+"\n");
        }
        
        return prettyString.toString();
	}
	
	public static String prettyRedisJson(String redisKey, String redisValue) throws JsonParseException, JsonMappingException, IOException {
		if(redisKey.equals("email_address")) {
			return prettyArray(redisValue);
		} else {
			return prettyJSON(redisValue);
		}
	}
	
 
 	
}



