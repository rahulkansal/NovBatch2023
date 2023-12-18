package com.java.prcatice;

public class ExceptionHandling {
	
	public void addition() throws ArrayIndexOutOfBoundsException {
		int a[] = new int[2];
        System.out.println("Access element three :" + a[3]);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		ExceptionHandling exceptionHandling = new ExceptionHandling();
		try {
		exceptionHandling.addition();
		}
		catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
		finally {
			System.out.println("Finaaly");
		}
		
		//System.out.println(10/0);
		
		/*try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      } */

		System.out.println("After Exception");

	}

}
