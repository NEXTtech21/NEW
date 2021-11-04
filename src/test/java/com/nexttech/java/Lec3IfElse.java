package com.nexttech.java;

public class Lec3IfElse {

	public static void main(String[] args) {
		
		// if statement specify the block of code will be executed if
		// the condition is true
		 
		
		int grade1=90;
		 
		 if (grade1>100) {
			
			System.out.println("Grade A");
			
		}
		
		else if (grade1>80){
		
			System.out.println("Grade B");
		}
		
		else {
			System.out.println("absence");
		}
	
		 
		int gr= 103;
		char grade;
		
		if(gr<=70) { 
		grade='A';
		}
		else if(gr<=60) {
			grade='B';
		}
		else if (gr>=100) {
        grade='C';
		}
		else {
		grade='D';
		}
			System.out.println("grade is "+ grade);	
		}
	
	    
	
	
	
}
