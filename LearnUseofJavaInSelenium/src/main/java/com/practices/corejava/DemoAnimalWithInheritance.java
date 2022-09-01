package com.practices.corejava;

public class DemoAnimalWithInheritance extends Animal {

	public void getNameOfAnimal() {
		setAnimalType("DOG");
	}

	public static void main(String[] args) {
		DemoAnimalWithInheritance demo = new DemoAnimalWithInheritance();
		demo.getAnimalType();
		demo.getNameOfAnimal();

		System.out.println(demo.getAnimalType());
	}

	/// overriding example
	// it has to be always used from class that is inheriting as a child.
	// only methods from parent will be overridden.

	public String getAnimalType() {
		return "CAT";
	}

}
