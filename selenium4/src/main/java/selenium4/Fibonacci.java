package selenium4;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0 1 1 2 3 5 8
		
		
		int n1=0,n2=1;
		int sum=0;
		System.out.print(n1+ "\t");
		System.out.print(n2+ "\t");
		
		for(int i=2; i<15;i++) {
			
			sum=n1+n2;
			System.out.print(sum + "\t");
			
			n1=n2;			//Swapping the numbers so they can be added again in loop
			n2=sum;
			
		}
		
		
		
		
		
		
	}

}
