package com.java.prcatice;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a =30.9,b=40.5 ,c=30.9;
		int d=20,e=50,f=30;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a++);
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		
		System.out.println(a<b&&a==c);
		System.out.println(!(d<e || e<f));
		System.out.println(a+=b);
		
		String value = d>e?"Passed" : "Failed";
		
		System.out.println(value);

	}

}
