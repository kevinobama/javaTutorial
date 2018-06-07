package kevinGates;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

   public static void main(String args[]) {
	   
	   hashMapExampleOne();	   
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
}
