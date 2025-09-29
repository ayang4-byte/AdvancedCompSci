public class Cat { //changed Public to public, and Cats to Cat
	private String name;
	private String breed;
    private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { //made cat uppercase, added breed
		this.name = name; //added "this" to name
		this.breed = breed; //see modification above
		this.isHungry = true; //changed "yes" to "true"
		livesRemaining = 9;
	}
    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

//changed return type to String
	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//changed return type to boolean
	public boolean getIsHungry(){ //camelcase
		return isHungry;
	}
//added a return line to return a boolean
	public boolean feed() { 
		this.isHungry = false;
        return isHungry;
	}
//added another equals sign to the comparison of livesRemaining because we are not assigning a value to a variable
	public boolean equals(Cat other) { 
		return this.name == other.name && this.breed.equals(other.breed)
			&& this.livesRemaining == other.livesRemaining;
	}
//changed System.out.println to return
	public String toString() {
		return(name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
	}
}
