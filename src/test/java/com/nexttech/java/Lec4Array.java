package com.nexttech.java;

public class Lec4Array {

	public static void main(String[] args) {
		
		// Array: in array we store multiple values in single variable.
		String[] City= {"Dhaka", "Dallas", "New York","Houston","Philadephia", "Pompano beach"};
		System.out.println(City[2]);
		System.out.println(City[1]);
		// to add or change value
		City[3]= "Chicago";
		
		City[5]="Bombay";
		
		
		// check the size we use lenghth method
	System.out.println(City.length);
	
	City[4]= "NewJersey";
	System.out.println(City[4]);
		
		
		int []Numbers= {1,2,3,4,5,6};
		System.out.println(Numbers.length);
		
		// store 4 decimals by using array
		
		double[] Num= {2.3,2.5,2.8,3.0};
		System.out.println(Num[3]);
				
	
	}

}
