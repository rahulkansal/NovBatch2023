package com.java.prcatice;

public class ChildAbstractExample extends SuperAbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstractExample ChildAbstractExample1 = new ChildAbstractExample();
		ChildAbstractExample1.display();
		ChildAbstractExample1.display1();
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("child display");
	}

}
