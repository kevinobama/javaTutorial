package kevinGates;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = new String("{ref_1=0.1, ref_2=0.2}");
		System.out.println(replaceExample(Str));
		
		String data = "";
		if(data.length() <= 2) {
			System.out.println("enough");
		} else {
			System.out.println("".substring(0,2));
		}
		
		String  reference_set= "reference_set: {'balance_change': '[\r\n  {\r\n    \"account_id\": \"bitz/a7f6b7f23521f49fa5a53e9c90c6918b\",\\r\\n    \"currency\": \"BTC\",\\r\\n    \"enable\": true,\\r\\n    \"max_amount\": 0.6,\\r\\n    \"min_amount\": 0.2,\\r\\n    \"response\": \"\"\\r\\n  },\\r\\n  {\\r\\n    \"account_id\": \"bitz/a7f6b7f23521f49fa5a53e9c90c6918b\",\\r\\n    \"currency\": \"ETH\",\\r\\n    \"enable\": true,\\r\\n    \"max_amount\": 2.2,\\r\\n    \"min_amount\": 2,\\r\\n    \"response\": \"\"\\r\\n  }\\r\\n]', 'timeout_hour': '{\"enable\": true, \"order\": 0.05, \"trade\": 0.0, \"response\": \"stop\"}', 'status_change': '{\"enable\": false, \"response\": \"\"}', 'email_address': '[\"huanghe4996798@sina.com\", \"18801966660@139.com\"]', 'run_error': '{\"enable\": false, \"response\": \"\"}'}";
		reference_set= reference_set.replace("\r\n", "");
		System.out.println(reference_set);
		
		System.out.println("data");
		System.out.println("data");
		
	}
	
	public static String replaceExample(String stringData) {
	       
		stringData = stringData.replace('{', ' ');
		stringData = stringData.replace('}', ' ');
	    
		return stringData;
	}
	
	
}
