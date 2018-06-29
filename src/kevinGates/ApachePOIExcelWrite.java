package kevinGates;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class ApachePOIExcelWrite {

	private static final String FILE_NAME = "/tmp/test.text";

    public static void main(String[] args) throws IOException {

    	excel();
        //System.out.println("Done");
    }
    
	public static void excel() throws IOException {
		String str = "Hello";
		BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
		writer.write(str);
	
		writer.close();
	}
}
