package kevinRedis;


import redis.clients.jedis.Jedis;

public class Basic {

	public static void main(String[] args) {

	  System.out.println("data");
		
	  Jedis jedis = new Jedis("localhost");
	  jedis.set("foo", "bar");
	  String value = jedis.get("foo");
	  System.out.println("datatwo");
	}
}
