package com.java.prcatice;

public class SuperClassExample {

	public String name;
	int age;
	
	public SuperClassExample() {
		System.out.println("Super constructor");
	}
	
	public void addition(int a,int b) {
		int c;
		System.out.println(a+b);
		
	}
	
	public void addition(double a,double b) {
		
		System.out.println(a+b);;
		
	}
	
	public void subtraction(int a,int b) {
		System.out.println(a-b);;
		
	}
	
	
	public int addition(int a,int b,int c) {
		int d = a+b+c;
		//System.out.println(a+b);;
		return d;
		
	}
	
	
	
}
