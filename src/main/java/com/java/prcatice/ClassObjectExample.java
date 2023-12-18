package com.java.prcatice;

public class ClassObjectExample {
	
	String name;
	int age;
	public static String profession;
	
	public ClassObjectExample(){
		System.out.println("no parameter constructor");
	}
	
	public ClassObjectExample(String nameValue){
		System.out.println("parameter constructor");
		name = nameValue;
		
	}
	
	public ClassObjectExample(String nameValue,int ageValue){
		System.out.println("parameter constructor");
		name = nameValue;
		age = ageValue;
	}
	
	public void addition(int a,int b) {
		int c;
		System.out.println(a+b);;
		
	}
	
	public int addition(int a,int b,int c) {
		int d = a+b+c;
		//System.out.println(a+b);;
		return d;
		
	}
	
	public void display() {
		System.out.println("display");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObjectExample classObjectExample = new ClassObjectExample();
		ClassObjectExample classObjectExample1 = new ClassObjectExample();
		
		ClassObjectExample classObjectExample2 = new ClassObjectExample("AutomationStudio");
		
		
		classObjectExample.name ="Rahul";
		classObjectExample.age = 30;
		
		classObjectExample1.name ="ragfhg";
		classObjectExample1.age = 31;
		
		System.out.println(classObjectExample.name);
		System.out.println(classObjectExample.age);
		
		System.out.println(classObjectExample1.name);
		System.out.println(classObjectExample1.age);
		
		
		classObjectExample.addition(30, 20);
		classObjectExample.display();
		
		classObjectExample1.addition(44, 20);
		classObjectExample1.display(); 
		
		ClassObjectExample.profession = "IT";
		classObjectExample.profession = "NonIT";
		
		System.out.println(classObjectExample.profession);
		System.out.println(classObjectExample1.profession);
		System.out.println(classObjectExample2.profession);
		
		System.out.println(classObjectExample2.name);
		
		System.out.println(classObjectExample2.addition(30, 20, 40));
		
	}

}
