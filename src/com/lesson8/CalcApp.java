package com.lesson8;
import java.util.*;

public class CalcApp {

	public static void main(String[] args) {
		//declare local variables
		int numbers [];
		int Max, Min;
		double average;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a size of an array: ");
		int size;
		size = sc.nextInt();
		
		numbers = new int[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Enter value " + (i+1));
			numbers[i] = sc.nextInt();
		}
		
		AvgMaxMin myAvgMaxMin = new AvgMaxMin ();
		myAvgMaxMin.setNumber(numbers);
		myAvgMaxMin.calculateAverage();
		myAvgMaxMin.calculateMax();
		myAvgMaxMin.calculateMin();
		
		double a = myAvgMaxMin.getAverage();
		double b = myAvgMaxMin.getMax();
		double c = myAvgMaxMin.getMin();
		
		System.out.println("Average is: " + a);
		System.out.println("Max is: " + b);
		System.out.println("Min is: " + c);
		
		
	}//end main

}//end class 

