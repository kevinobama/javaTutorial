package kevinGates;

import java.util.HashMap;
import java.util.Map;

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
	   
	   System.out.println(users);
	   System.out.println(users.get(2));
	   users.remove(3);
	   System.out.println(users.get(3));	   
	   users.clear();
	   System.out.println(users.get(1));
   }
}
