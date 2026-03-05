package edu.lifeuniversity.css.java.example2;

public class Pet {
	

	    private String name;
	   

	    // Default constructor
	    /**
	     * Default constructor.
	     * Initializes the name to "No name yet".
	     */
	    public Pet() {
	        name = "No name yet";
	        
	    }

	    /**
	     * Constructor that initializes the pet's name.
	     * 
	     * 
	     */
	    public Pet(String initialName) {
	        name = initialName;
	        
	    }
	    
	    /**
	     * Sets the pet's name.
	     * 
	     * 
	     */
	    public void setName(String newName) {
	        name = newName;
	       
	    }
	    
	    /**
	     * Returns the person's name.
	     * 
	     * 
	     */
	    public String getName() {
	        return name;
	    }
	   
	    
	    
	    
	    /**
	     * Displays the person's name to the console.
	     */

	    
	    public void writeOutput() {
	        System.out.println("Name: " + name);
	        
	    }
	    
}
