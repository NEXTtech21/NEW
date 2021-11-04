package com.nexttech.java;

public class Lec7InheritanceChild extends Lec7Inheritance {

	public static void main(String[] args) {
		Lec7InheritanceChild inherit= new Lec7InheritanceChild();
		inherit.a=90;
		System.out.println(inherit.a);
		inherit.method2();
		inherit.method5();
		inherit.method4(25, 25);
		//inherit.drug;
		System.out.println(inherit.drug);
		//inherit.fruits;
		System.out.println(inherit.fruits);
		inherit.drug="nasal";
		
	}

}
