package com.lesson8;

import java.util.Scanner;

/** 
Develop an application which creates multiple objects of type Person class
Store them in an array, retrieve the objects from the array and call different methods on these objects.
*/
public class PersonAppDemo {

	public static void main(String[] args) {
		//declare an array of type Peraon
		Person people [];
		
		//to store the number of Person to be created
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("How many Person will be created?");
		
		n = sc.nextInt();
		people = new Person[n];
		
		//local variables to store:
		String name;
		int age;
		boolean enjoysReading;
		
		//for loop to take the user input, in each iteration create an object of type Person
		//using the given input, and store it in the []
		for(int i = 0; i<n; i++) {
			System.out.println("Person's Name: ");
			name = sc.next();
			
			System.out.println("Person's Age: ");
			age = sc.nextInt();
			
			System.out.println("Does person enjoy reading?");
			enjoysReading = sc.nextBoolean();
			System.out.println("===============");
			
			people[i] = new Person(name, age, enjoysReading);
		}//end for
		
		//processing
		Person p;
		
		boolean enjoy;
		// traverse the array using loop
		for (int i = 0; i<people.length; i++) {
			//retrieve the Person object located at index i
			p = people [i];
			
			p.displayMe();
			
			enjoy = p.isEnjoysReading();
			if (enjoy == true) {
				System.out.println("Enjoy reading.");
			}else {
				System.out.println("Doesn't enjoy reading.");
			}
		}
			
	}//end main

}//end class
