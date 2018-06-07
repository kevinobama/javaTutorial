package kevinGates.java.util;

 
public class HashMapKevin<K,V> extends AbstractMapKevin implements MapKevin  {
	 public  int currentKey;
	 public  HashMapKevin() {
 
	 }
	 
	 public  HashMapKevin(int key) {
		 this.currentKey = key;
	 }
	 
	 public boolean isEmpty() {
		 
		 return true;
	 }
}
