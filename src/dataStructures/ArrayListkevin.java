package dataStructures;

import java.util.List;
import java.util.ListIterator;

public class ArrayListkevin<T> implements CollectionKevin {
 
  private static final int MINIMUM_SIZE = 1024;

  private int size = 0;
  private T[] array = (T[]) new Object[MINIMUM_SIZE];  
  
  public void add(Object obj) {
	  add(size, obj);
  }  
  
  public void add(int index, Object obj) {
	  array[index] = (T) obj;
	  size ++;
  }
  
  public boolean addAll(int index, CollectionKevin c) {
	  //array[index] = c;
	  //for(int i=0;i<c.)
	  return false;
  }
  
  public Object get(int index) {
	  return array[index];
  }
  public int indexOf(Object obj) {
	  return 0;
  }
  public int lastIndexOf(Object obj) {
	  return 0;
  }
  public ListIterator listIterator( ) {
	  return null;
  }
  public ListIterator listIterator(int index) {
	  return null;
  }
  public Object remove(int index) {
	  array[index] = null;
	  return array;
  }
  public Object set(int index, Object obj) {
	  array[index] = (T) obj;
	  return array;
  }
  public List subList(int start, int end) {
	  return null;
  }
}
