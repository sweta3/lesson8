package com.lesson8;

public class AvgMaxMin {
	//declare instance variables
	private int numbers[];
	private double average;
	private int min;
	private int max;
	
	//declare default constructor
	public AvgMaxMin() {
	}

	 //setter
	public void setNumber(int[] numbers) {
		this.numbers = numbers;
	}
	
	//calculate min 
	public void calculateMin() {
	min = numbers[0]	;
	for (int i = 1; i<numbers.length; i++) {
		if (numbers[i]<min) {
			min=numbers[i];
		}
	}

	}
    //getter
	public int getMin() {
		return min;
	}
	
	//calculate max
	public void calculateMax() {
	max=numbers[0];
	for(int i= 1; i<numbers.length;i++) {
		if(numbers[i]>max) {
			max=numbers[i];
		}
	}
	
	}
	//getter
	public int getMax() {
		return max;
	}
	
	//calculate average of all numbers of array
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
}
