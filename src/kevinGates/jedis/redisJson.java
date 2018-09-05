package kevinGates.jedis;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;

//import controllers.ObjectMapper;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParser;

public class redisJson {

	public static void main(String[] args)  {
				
		Jedis jedis = new Jedis("localhost",7963);
		jedis.auth("viewfin333");
		
		String key = "huanghe_maker_3_status_set";

		String[] keyArray = key.split("_");
		
		//key = key.replace("huanghe_", "");
		System.out.println(keyArray[0]);
		
//		String robotsJson = jedis.hget("user_id", key);
//		System.out.println(robotsJson);
//		try {
//		  String newJson = stringJsonRemoveOneKey(robotsJson, "maker_2");
//		  jedis.hset("user_id", "kevin_set", newJson);
//		} catch(Exception e){
//			System.out.println(e);
//		}
				
	}
	
	/**
	 * 
	 * @param stringJson
	 * @param key
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static String stringJsonRemoveOneKey(String stringJson, String key) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		
		HashMap<String,String> stringHash =  new ObjectMapper().readValue(stringJson, HashMap.class);
				
		if(key != null && !key.isEmpty()) stringHash.remove(key);//remove hash
		
		String data = "";
		StringBuilder newJson=new StringBuilder("{");  
		
		int k = 1;
		for (Map.Entry<String, String> entry : stringHash.entrySet()) {

			newJson.append("\""+entry.getKey() + "\": \"" + entry.getValue()+"\"");
			
			if(k < stringHash.size()) newJson.append(", ");
			
			k++;
		}
		newJson.append("}");
				
		return newJson.toString();
	}
	
}
