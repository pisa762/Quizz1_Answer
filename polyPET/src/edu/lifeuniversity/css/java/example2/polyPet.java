package edu.lifeuniversity.css.java.example2;

public class polyPet {
	 public static void main(String[] args) {

	        Pet[] pets = new Pet[3];

	        pets[0] = new Pet("Kitty");
	        pets[1] = new Dog("Buddy", "Golden Retriever");
	        pets[2] = new Dog("Max", "Bulldog");

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


