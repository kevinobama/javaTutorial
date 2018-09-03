package kevinCollection;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {

 public static void main(String[] args) {
      Map m1 = new HashMap(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      m1.put("gates", "70");

      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      System.out.print("\t" + m1.get("gates"));
   }
}
