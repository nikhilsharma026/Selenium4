package selenium4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Prime number gets divided by 1 and itself
		
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		s.close();
		
		int count=0; 	// To check how many times number got divided by other numbers
		
		if(num>1) {
			
			for(int i=1 ;i<=num;i++) {
				
				if(num%i==0) {				
					count++;
				}						
			}
			
			
			if(count==2) {				//Number got divided only twice i.e by 1 and itself
				
				System.out.println("Prime number");
			}
			
			else {
				System.out.println("Not prime");
			}
			
			
		}
		
		else {
			System.out.println("enter a number more than one");
		}
		
	}

}
