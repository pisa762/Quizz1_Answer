package edu.lifeuniversity.css.java.example2;

public class polyPet {
	 public static void main(String[] args) {
		 
           //Create an array of Pet objects
	        Pet[] pets = new Pet[3];
	     // Store different subclass objects inside Pet array
	        pets[0] = new Pet("Doggo");
	        pets[1] = new Dog("Buddy", "Golden Retriever");
	        pets[2] = new Dog("Max", "Bulldog");
	     // Demonstrate runtime polymorphism
	        for (Pet p : pets) {
	            p.writeOutput();

	            if (p instanceof Dog) {
	                Dog d = (Dog) p;
	                d.bark();
	            }

	            System.out.println();

	            
	        }
	    }
	}


