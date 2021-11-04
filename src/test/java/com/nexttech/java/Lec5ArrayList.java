package com.nexttech.java;

import java.util.ArrayList;

public class Lec5ArrayList {

	public static void main(String[] args) {
		ArrayList<String>Fruits= new ArrayList<String>();
		// to add
		Fruits.add("Mango");
		Fruits.add("Kiwi");
		Fruits.add("Mist");
		Fruits.add("papaya");
		Fruits.add("orange");
		//System.out.println(Fruits);
		// to access
		Fruits.get(3);
		//System.out.println(Fruits.get(3));
		// to change/replace value we use  set method
		Fruits.set(0,"Mango");
		//Fruits.set(2,"water");
		//System.out.println(Fruits.set(2,"water"));
		//System.out.println(Fruits);
		
		// to remove
		//Fruits.remove(2);
		//System.out.println(Fruits.remove(2));
		//System.out.println(Fruits);
		
		
		// to search 
		for(int i=0;i<Fruits.size();i++) {
			System.out.println(Fruits.get(i));
			
		}
		
		for (int n=0; n<Fruits.size();n+=2) {
			System.out.println(Fruits.get(n));
		}
		for (int m=1;m<Fruits.size();m+=2)
     {
	 System.out.println(Fruits.get(m));
     }
		// find how many elements
		Fruits.size();		
		
		
		
		
	}

	ArrayList<Integer>NumOfStudents=new ArrayList();
	
	
	
	
	
}
