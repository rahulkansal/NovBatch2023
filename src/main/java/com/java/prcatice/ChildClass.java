package com.java.prcatice;

public class ChildClass extends SuperClassExample{
	
	public ChildClass() {
		super();
		System.out.println("child constructor");
	}
	
	public void addition(int a,int b) {
		System.out.println(a+b+a+b);
		
	} 
	
	public void display() {
		System.out.println("Child Display");
		super.addition(20, 20);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	SuperClassExample superClassExample = new SuperClassExample();
		//superClassExample.addition(10, 10);
		
		
		
		ChildClass childClass = new ChildClass();
		childClass.addition(30, 50);
		childClass.addition(23.3, 34.50);
		childClass.addition(30, 50);
		
		//SuperClassExample SuperClassExample1 = new ChildClass();
		//SuperClassExample1.addition(30, 50);
		//SuperClassExample1.addition(23.3, 34.50);
		
		childClass.display();
		
		
	}

}
