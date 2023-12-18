package com.java.prcatice;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int x = 1; x < 10; x ++) {
	         System.out.println("value of x : " + x );
	      } */
		
		
		/*int x = 5;
	      while( x <= 20 ) {
                     System.out.println("value of x : " + x );
  	     x++;
 	   } */
		
		/* int x = 10;
	      do {
	       	  System.out.println("value of x : " + x );
	        	 x*=2;
		}while( x <= 20 ); */

	     /* for(int x = 1; x < 10; x*=2) {
	          System.out.println("value of x : " + x );
	 	if(x == 5){
	 	break; }
	      } */
	      
	      for(int x = 1; x < 10; x ++) {
	            if(x == 4 || x== 6){
	            	continue; }
	            System.out.println("value of x : " + x );
	        }



	}

}
