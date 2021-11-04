package com.nexttech.java;

public class Lec6Method1 {

	final int a= 10;
	int b=20;
	String City ="Dallas";
	final double L= 2.7;
	
	
	
	void method1(){
		
	}
	
	void method2() {
		
	}
	
	static void method3() {
		int x=25;
		int y=32;
		int sum=y+x;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		Lec6Method1 obj = new Lec6Method1();
		//obj.a=20;
		//obj.L=25;
	    obj.b=20;
	    obj.method3();
	    //obj.City="NYC1";
	 System.out.println(obj.b);
		System.out.println(obj.a);
		System.out.println(obj.City);
	
		
	
		
		
	}

}
