package dataStructures;

public class ArrayListkevinTest {

	public static void main(String[] args) {		
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

}
