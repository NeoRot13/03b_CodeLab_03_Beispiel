package com.cc.java;

public class MA_Advertising extends MA{

	public MA_Advertising(String familyName, String firstName, int birthYear, String workID, String department, String role, int hiredYear) {
		super(familyName, firstName, birthYear, workID, department, role, hiredYear);
	}
	
	/**
	 *  Ausgabe --> advertising
	 */
	
	public String doYourWork() {
		return "Hi, I'm " + getFirstName() + " " + getFamilyName() + " and I'm posting a phothograph on IG!";		
	}

}
