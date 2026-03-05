package edu.lifeuniversity.css.java.example2;

public class Pet {
	

	    private String name;
	   

	    // Default constructor
	    public Pet() {
	        name = "No name yet";
	        
	    }
	    public Pet(String initialName) {
	        name = initialName;
	        
	    }
	    public void setName(String newName) {
	        name = newName;
	       
	    }
	    public String getName() {
	        return name;
	    }
	   
	    
	    
	    
	    

	    
	    public void writeOutput() {
	        System.out.println("Name: " + name);
	        
	    }
	    
}
