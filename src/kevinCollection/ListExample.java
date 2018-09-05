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
		//ExampleThree();
		iteratingOverAList();
	}
	
	public static void ExampleOne() {
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

	public static void ExampleTwo() {
	      List<String> list = new ArrayList<String>();
	      list.add("one");
	      list.add("two");
	      list.add("three"); 
	      list.add("two");
	      list.add("two");
	      
	      List<String> listOne = new ArrayList<String>();
	      listOne.add("five");
	      listOne.add("six");
	      listOne.add("seven"); 
	      listOne.add("six");
	      listOne.add("six");	  
	      
	      List<String> listTwo = new ArrayList<String>();
	      listTwo.addAll(list);
	      listTwo.addAll(listOne);
	      
	      Collections.sort(listTwo);
	      	
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + listTwo);

	}	
	
	public static void ExampleThree() {
	      List<String> list = new ArrayList<String>();
	      list.add("one");
	      list.add("two");
	      list.add("three"); 
	      list.add("four");
	      list.add("two");
	      list.add("five");
 
	      //list.sort(list);
	      //modify	
	      list.set(5, "new");
	  	//lambda
	  	//Output : A,B,C,D,E
	      list.forEach(item->System.out.println(item));
	  		
	  	//Output : C
	      list.forEach(item->{
//	  		if("C".equals(item)){
//	  			System.out.println(item);
//	  		}
	    	  System.out.println("item:"+item);	  
	  	});
	  		
	  	//method reference
	  	//Output : A,B,C,D,E
	      list.forEach(System.out::println);
	  	
	  	//Stream and filter
	  	//Output : B
	      list.stream()
	  		.filter(s->s.contains("B"))
	  		.forEach(System.out::println);
	      
	      System.out.println(" ArrayList Elements");
	      System.out.print("\t" + list);
	      System.out.print(" three: \t" + list.get(2));
	      //remove
	      list.removeAll(list);
	      
 	      System.out.print("\t" + list.size());
	}	
	
	public static void iteratingOverAList() {
		List<String> listStrings = new ArrayList<String>();
		// OK to add Strings:
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		// But this will cause compile error
		//listStrings.add(123);
		
		List<Number> linkedNumbers = new LinkedList<>();
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));
 		
		Iterator<String> iterator = listStrings.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}
 
//		Iterator<Number> iterator = linkedNumbers.listIterator();
//		while (iterator.hasNext()) {
//		    System.out.println(iterator.next());
//		}		
	}
}
