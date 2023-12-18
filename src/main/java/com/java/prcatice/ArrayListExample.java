package com.java.prcatice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list=new ArrayList<Object>();//Creating arraylist  
		list.add(40);//Adding object in arraylist  
		list.add(50);  
		list.add(40);  
		list.add(null); 
		list.add(null); 
		list.add("Rahul");
		//Traversing list through Iterator  
	/*	Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} */
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i)); 
		}

	}

}
