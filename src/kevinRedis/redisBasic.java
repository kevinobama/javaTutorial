package kevinRedis;

import redis.clients.jedis.Jedis;

public class redisBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("redis start");
			
		  Jedis jedis = new Jedis("localhost");
		  		  
		  jedis.set("userName", "billgates");
		  String userName = jedis.get("userName");
		  
		  System.out.println("userName="+userName);
		  
		  System.out.println("redis end");
	}

}
