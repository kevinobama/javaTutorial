package kevinGates;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

class Person {
	public String firstName;
	public String lastName;
	public int age;
	public Person() {		
	}
	public Person(String firstName, String lastName,
				int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String toString() {
	    return "[" + firstName + " " + lastName +
		       " " + age +"]";
	}
}

public class JSONListConverter {
	public static void main( String[] args ) throws IOException
    {
    	ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of json
    	//objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

    	//Define map which will be converted to JSON
//    	List<Person> personList = Stream.of(
//				new Person("Mike", "harvey", 34),
//			  	new Person("Nick", "young", 75),
//				new Person("Jack", "slater", 21 ),
//				new Person("gary", "hudson", 55))
//				.collect(Collectors.toList());

    			List<Person> personList=new ArrayList<Person>();  
    			Person b1=new Person("Mike", "harvey", 34);
    			Person b2=new Person("Mike", "harvey", 34);  
    			personList.add(b1);
    			personList.add(b2); 
    	//1. Convert List of Person objects to JSON
//    	String arrayToJson = objectMapper.writeValueAsString(personList);
//    	System.out.println("1. Convert List of person objects to JSON :");
//    	System.out.println(arrayToJson);
    	System.out.println(personList);
    	//2. Convert JSON to List of Person objects
    	//Define Custom Type reference for List<Person> type
    	//TypeReference<List<Person>> mapType = new TypeReference<List<Person>>() {};
    	//List<Person> jsonToPersonList = objectMapper.readValue(arrayToJson, mapType);
    	
    	//System.out.println("\n2. Convert JSON to List of person objects :");
    	
    	//Print list of person objects output using Java 8
    	//jsonToPersonList.forEach(System.out::println);
    }
}
