package edu.lifeuniversity.css.java.example2;

public class Dog extends Pet{
	/** The dog breed */
	private String Dogbreed;
	
	
	/* default constructor
	 * call the parent constructor and set the dog breed to not yet
	 * (indicating no name yet
	 */
	public Dog() {
		super();
		Dogbreed = "not yet" ;
	}
	
	/**
	 * constructor that initialize the dog's name and breed */
	public Dog(String initialName, String initialDogbreed ) {
		super(initialName);
		
		Dogbreed = initialDogbreed;
		
	}
	
	/**
	 * reset the dog name and breed
	 */
	public void reset(String newName, String newDogbreed) {
        setName(newName);
       
        Dogbreed = newDogbreed;
}
	/**
	 * return the dog breed */
public String getDogbreed() {
	return Dogbreed;
}
public void setDogbreed(String newDogbreed) {
	Dogbreed= newDogbreed;
}

/**
 * print out the dog's bark if it a dog*/
public void bark() {
    System.out.println("Woof!");
}
/**
 * Displays the dog's information.
 * Overrides the writeOutput() method from pet.
 */
@Override
public void writeOutput() {
    System.out.println("Dog Name: " + getName());
    System.out.println("Dog breed: " + Dogbreed);
}

}
