package kevinCollection;
//import java.util.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setString();
	}
	
	public static void setInteger() {
		Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
 
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
 
	}
	
	public static void setString() {
		// TODO Auto-generated method stub
		Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("one");
        hash_Set.add("two");
        hash_Set.add("three");
        hash_Set.add("four");
        hash_Set.add("four");
        System.out.print("Set output without the duplicates");
        System.out.println(hash_Set);
 
        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);
	}	
}
