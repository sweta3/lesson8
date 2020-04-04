package com.lesson8;

public class AvgMax {
	//declare instance variables
	private int numbers[];
	private double average;
	private int max;
	
	public AvgMax() {
		//numbers [] = null;
		//average = 0.0;
		//max = 0;
	}
	//setter
	public void setNumbres(int numbers [] ) {
		this.numbers = numbers;
	}
	
	//compute the average  of all the numbers the array
	public void calculateAverage() {
		int sum;//to store the sum of all the elements
		int currentElement; // to store the current element from the array
		
		sum = 0;
		for (int i =0; i<numbers.length; i++) {
			//retrieve the element at the index i
			sum = sum + numbers[i]; //updat			
		}
		
		//compute
		average = (double)sum/numbers.length;	
	}
	public double getAverage() {
		return average;
	}
	public int computeMax() {
		max = numbers[0];
		for (int i = 1; i <numbers.length; i++) {
			//if the current element of [] located at i>than the value stored in max
			//update the element
			if(numbers[i] >max) {
				//update the max with current value
				max = numbers[i];
			}
		}
		return max;
	}
	//getter
	public int getMax() {
		return max;
	}
	
}//end 
