package edu.lifeuniversity.css.java.example2;

public class inheritancePet {
	
	/**
     * The main method is the entry point of the program.
     * 
     * 
     */
	 public static void main(String[] args) {

	        //create a dog object
	        Dog s = new Dog();

	       //set the dog name
	        s.setName("Totomaru");
	        
	        // set the dog breed
	        s.setDogbreed("husky");

	        // Display the student's information
	        s.writeOutput();
	    }
	}