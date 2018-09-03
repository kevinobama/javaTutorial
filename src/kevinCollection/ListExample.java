package kevinCollection;

import java.util.*;

/**
 * An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.
Set<E>:

A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name, this interface models the mathematical set abstraction.
 * @author kevingates
 *
 */
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1();
	}
	
	public static void Example1() {
	      List a1 = new ArrayList();
	      a1.add("one");
	      a1.add("two");
	      a1.add("three");
	      a1.add(33);
	      a1.add("two");
	      a1.add("two");
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + a1);

	      List l1 = new LinkedList();
	      l1.add("Zara");
	      l1.add("Mahnaz");
	      l1.add("Ayan");
	      System.out.println();
	      System.out.println(" LinkedList Elements");
	      System.out.print("\t" + l1);
	}

}
