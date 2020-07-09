package selenium4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//If file not present, file not found exception is thrown
		
		FileReader file = new FileReader("C:\\Users\\Nikhil Sharma\\Desktop\\text1.txt");
		
		BufferedReader br= new BufferedReader(file);
		String st;
		
		while((st=br.readLine())!=null) 
		{
			
			System.out.println(st);
		}

		
		br.close();
		
		// Second method
		
		FileReader file1 = new FileReader("C:\\Users\\Nikhil Sharma\\Desktop\\text1.txt");
		
		Scanner s = new Scanner(file1);
		
		while(s.hasNextLine()) {
			
			System.out.println(s.nextLine());
		}
		
		s.close();
		
	}

}
