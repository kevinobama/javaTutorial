package kevinGates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
}

class Dog extends Animal {
	public void move() {
	   System.out.println("Dogs can walk and run");
	}
}

class KevinArrayList<E> extends ArrayList<E> {
	
	public boolean add(E e) {
		System.out.println("value="+e);
		return true;
	}
	
   /**
      * Appends the specified element to the end of this list.
      *
      * @param e element to be appended to this list
      * @return <tt>true</tt> (as specified by {@link Collection#add})
      */
//     public boolean add(E e) {
//         ensureCapacityInternal(size + 1);  // Increments modCount!!
//         elementData[size++] = e;
//         return true;
//     }	
}

public class Overriding {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.move();
		
		ArrayList<String> user = new KevinArrayList<String>();
		user.add("one");
		user.add("two");
		
		System.out.println(user);
	}
}

