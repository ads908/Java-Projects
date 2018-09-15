
/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. */


public class Multiples_3_5 {

	public static void main(String[] args) {
		
		int total;
		total=3+5;
		int i=0;
		
		for(i=6;i<1000;i++) {
			
			if(i%3==0) {
				total=total+i;
				continue;
			}
			
			if(i%5==0) {
				total=total+i;
				continue;
			}
		}//end of for
		
		System.out.println("Interval is "+i);
		System.out.println("The sum of the multiples is "+total);
		
	}//end of main

}
