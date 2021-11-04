package com.nexttech.java;

import java.util.HashMap;

public class Lec6HashMap {

	public static void main(String[] args) {
		HashMap<String,String> CapitalOfCountry= new HashMap<String,String>();
		// to add
		CapitalOfCountry.put("Texas", "USA");
		CapitalOfCountry.put("NYC","USA");
		CapitalOfCountry.put("PO","Maxico");
		//System.out.println(CapitalOfCountry);
		
		
		// to access
		CapitalOfCountry.get("Texas");
		CapitalOfCountry.get("NYC");
		//System.out.println(CapitalOfCountry.get("Texas"));
		//System.out.println(CapitalOfCountry.get("NYC"));
		// to delete
		CapitalOfCountry.remove("PO");
		//System.out.println(CapitalOfCountry.remove("PO"));
		//System.out.println(CapitalOfCountry);
		
		
		
		// 
		HashMap<Integer,String>NameofStudentsAndId=new HashMap<Integer,String>();
		NameofStudentsAndId.put(2, "Nahar");
		NameofStudentsAndId.put(3,"KK");
		NameofStudentsAndId.put(5,"PP");
		//System.out.println(NameofStudentsAndId);
		
		NameofStudentsAndId.get(3);
		//System.out.println(NameofStudentsAndId.get(2));
		
		NameofStudentsAndId.size();
		//System.out.println(NameofStudentsAndId.size());
		
		for (int p: NameofStudentsAndId.keySet()) {
			System.out.println(p);
		}
		
		for (String s: CapitalOfCountry.values())
		{
			System.out.println(s);
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
