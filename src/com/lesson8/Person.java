package com.lesson8;
/** 
Person.java demonstrates
	-- how to declare an instantiable class
	-- how to declare multiple constructors
		 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
	-- how to implement a class's attributes by declaring instance variables
	-- how to implement a class's behaviour by implementing a method (i.e. displayMe())
*/
//instantiable class
public class Person {
	
	//declare instance variables
	private String name;
	private int age;
	private boolean enjoysReading;
	//default
	public Person() {
	}
	//1 params
	public Person(String name) {
		this.name = name;
	}
	//2 params
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//3 params
	public Person(String name, int age, boolean enjoysReading) {
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}
	//3 params
	public Person(boolean enjoysReading, String name, int age) {
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}
	public void displayMe() {
		System.out.println("Person's name: " + name);
		System.out.println("Person's age: " + age);
		System.out.println("Person's enjpys to read: " +enjoysReading);
		System.out.println("==============");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isEnjoysReading() {
		return enjoysReading;
	}
	
}//end class
