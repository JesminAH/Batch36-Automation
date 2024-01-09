package com.practice.smarttech;

public class PracticeCondition {
	public void getCondition(String name) {
		if (name.contains("Rez")) {
			System.out.println("Match found");
			
		}
		else {
			System.out.println("no match found.");
		}
	}

	public static void main(String[] args) {
		
		PracticeCondition obj = new PracticeCondition();
		obj.getCondition("Rezwan");
		obj.getCondition("Ullah");
		obj.getCondition("Reza");
		
	}
}
