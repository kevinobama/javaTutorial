package dataStructures;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public interface CollectionKevin<E> {
	void add(int index, Object obj);
	boolean addAll(int index, Collection<? extends E> c);
	Object get(int index);
	int indexOf(Object obj);
	int lastIndexOf(Object obj);
	ListIterator listIterator( );
	ListIterator listIterator(int index);
	Object remove(int index);
	Object set(int index, Object obj);
	List subList(int start, int end);
}
