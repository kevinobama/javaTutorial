package dataStructures;

public class ArrayListkevinTest {

	public static void main(String[] args) {		
		addAllExample();
	}
	
	public static void basicExample() {
		ArrayListkevin<String> countries = new ArrayListkevin<String>();
		countries.add("canada");
		countries.add("United states");
		countries.add("United Kindom");
		
		System.out.println("get:"+countries.get(2));
		
		int[] cities= new int[1024];
		
		for(int i=1;i<20;i++) {
			cities[i] = i;
		}
		
		System.out.println("data:"+cities[2]);
	}	
	
	public static void addAllExample() {
		ArrayListkevin<String> countries = new ArrayListkevin<String>();
		countries.add("Canada");
		countries.add("United State");
		countries.add("United Kindom");
 		
		ArrayListkevin<String> cities = new ArrayListkevin<String>();
		cities.add("New York");
		cities.add("WC");
		cities.add("silicone sealant");
		
		ArrayListkevin<String> countriesAndCities = new ArrayListkevin<String>(); 		
		//countriesAndCities.addAll(countries);
		//countriesAndCities.addAll(cities);
		
		System.out.println(countriesAndCities);
	}	
}
