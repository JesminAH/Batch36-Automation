package com.practice.smarttech;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList {
//	Interface<WrapperClass>CollectionObject = new ClassName<>();
//	ArrayList Class==> List Interface
	public List<Integer> getArrayValue() {
    List<Integer>myList = new ArrayList<>();//upcasting 
		// Add 2,4,4,,5,8,9
       // To insert value in List we use add() method
        myList.add(2);
        myList.add(4);
        myList.add(4);
        myList.add(5);
        myList.add(8);
        myList.add(9);
		System.out.println(myList);
		return myList;
		
	}
public static void main(String[] args) {
	PracticeArrayList obj = new PracticeArrayList();
	obj.getArrayValue();
	
	
}
	
	
}
