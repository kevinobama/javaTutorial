package kevinGates;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Example {

	public static void main(String[] args) {
		 
        System.out.println(md5String("data"));		
	}
	
	public static String md5String(String stringToHash) {		
        String generatedString = null;
        try {             
            MessageDigest md = MessageDigest.getInstance("MD5");
             
            md.update(stringToHash.getBytes());
             
            byte[] bytes = md.digest();
 
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            generatedString = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return generatedString;		
	}		
}
