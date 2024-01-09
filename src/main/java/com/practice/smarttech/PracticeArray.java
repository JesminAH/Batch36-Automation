package com.practice.smarttech;

import java.util.Arrays;

public class PracticeArray {
	int a = 2;
	int [] b = {2, 4,7,20,25,30};
	int [] c = {2,3,5,8};
	int [][] d = {b,c};
    int []e = {25,40,80,60,35};
    int []f = {50,17,19,38};
    int [][]g = {b,e,f};
	int[] h = {}; // null
	int[]j = {2,4,5,4,8,2}; // duplicate  value
	
	public void getArray() {
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.deepToString(g));		
	
	}

	public static void main(String[] args) {
		PracticeArray obj = new PracticeArray();
		obj.getArray();
	}
}
