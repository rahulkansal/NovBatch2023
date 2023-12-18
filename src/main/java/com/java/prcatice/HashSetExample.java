package com.java.prcatice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();//Creating arraylist  
		set.add(40);//Adding object in arraylist  
		set.add(50);  
		set.add(40);  
		set.add(null);
		set.add(null);
		//Traversing list through Iterator  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		
		
	}

}
