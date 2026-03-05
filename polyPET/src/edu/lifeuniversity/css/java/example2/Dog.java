package edu.lifeuniversity.css.java.example2;

public class Dog extends Pet{
	private String Dogbreed;
	
	
	
	public Dog() {
		super();
		Dogbreed = "not yet" ;
	}
	public Dog(String initialName, String initialDogbreed ) {
		super(initialName);
		
		Dogbreed = initialDogbreed;
		
	}
	public void reset(String newName, String newDogbreed) {
        setName(newName);
       
        Dogbreed = newDogbreed;
}
	
public String getDogbreed() {
	return Dogbreed;
}
public void setDogbreed(String newDogbreed) {
	Dogbreed= newDogbreed;
}
public void bark() {
    System.out.println("Woof!");
}

@Override
public void writeOutput() {
    System.out.println("Dog Name: " + getName());
    System.out.println("Dog breed: " + Dogbreed);
}

}
