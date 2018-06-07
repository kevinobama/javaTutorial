package kevinGates;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kevinGates.java.util.HashMapKevin;

public class HashMapExample {

   public static void main(String args[]) {
	   
	   //hashMapExampleOne();
	   hashMapExampleTwo();
   }
   
   public static void hashMapExampleOne() {
	   Map<Integer, String>  users = new HashMap<Integer, String>();
	   Map<Integer, String>  usersClone = new HashMap<Integer, String>();
	   users.put(1, "kevingates");
	   users.put(2, "billgates");
	   users.put(3, "obama");
	   
	   int size = users.size();
	   boolean isEmpty = users.isEmpty();
	   Set<Integer> keys = users.keySet();
	   Collection<String> values = users.values();
	   
	   System.out.println(size);
	   System.out.println(isEmpty);
	   System.out.println(keys);
	   System.out.println(values);
	   
	   System.out.println(users);
	   System.out.println(users.get(2));
	   users.remove(3);
	   System.out.println(users.get(3));	   
	   users.clear();
	   System.out.println(users.get(1));
   }
   
   public static void hashMapExampleTwo() {
	   HashMapKevin users = new HashMapKevin<Integer, String>();
	   //users.echo("map");
	   users.echo("data");
	   
	   HashMapKevin usersOne = new HashMapKevin<Integer, String>(88);
	   usersOne.echo("usersOne="+usersOne.currentKey);
   }
}
