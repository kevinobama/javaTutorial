package kevinGates;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = new String("{ref_1=0.1, ref_2=0.2}");
		System.out.println(replaceExample(Str));
	}
	
	public static String replaceExample(String stringData) {
	       
		stringData = stringData.replace('{', ' ');
		stringData = stringData.replace('}', ' ');
	       		
		return stringData;
	}
}
