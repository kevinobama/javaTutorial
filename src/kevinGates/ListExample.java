package kevinGates;

import java.util.*;  
class Book {  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
}  

public class ListExample {
	public static void main(String[] args) {
		//Creating list of Books  
	    List<Book> books=new ArrayList<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"kevin gates","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"bill gates","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"obama","Galvin","Wiley",6);  
	    //Adding Books to list  
	    books.add(b1);  
	    books.add(b2);  
	    books.add(b3);  
 
	    for(Book book:books) {  
	    	System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);  
	    }  		
	}
}
