package com.practices.corejavaInterface;

public class InterfaceDemo {

	
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.getAnimalType();
		System.out.println(animal.getAnimalType());
	
	Cat cat = new Cat();
	System.out.print(cat.getAnimalType());
		
	}
}
