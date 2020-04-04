package com.lesson8;

public class Avg {
		//declare instance variables
		private int numbers[];
		private double average;
		private int max;
		
		public Avg() {
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
}
