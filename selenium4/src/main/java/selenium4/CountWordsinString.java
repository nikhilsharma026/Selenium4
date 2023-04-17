package selenium4;

import java.util.Scanner;

public class CountWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s= new Scanner(System.in);
		
		String str= s.nextLine();
		
		s.close();
		
		int count=1;			//To count number of words
		
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
				count++;
						
			}
			
			
		}
		
		System.out.println("Number of words:" + count);

		
		
		
		
	}

}
