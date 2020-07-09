package selenium4;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		int num= s.nextInt();
		
		s.close();
		
		if(num%2==0) {
			
			System.out.println("Even");
		}
		
		else {
			System.out.println("Odd");
		}
		
	}

}


