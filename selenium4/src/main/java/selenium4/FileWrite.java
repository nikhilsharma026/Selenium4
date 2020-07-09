package selenium4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//If file not present, it will create. If present, it will overwrite the existing content.
		
		FileWriter file = new FileWriter("C:\\Users\\Nikhil Sharma\\Desktop\\text1.txt");
		BufferedWriter bw = new BufferedWriter(file);
		
		bw.write("First Test Program");
		
		bw.write(RandomStringUtils.randomAlphanumeric(5));
		
		bw.close();
		
	}

}
