public class Cat { //1. made 'public' lowercase // removed 's' from Cat // also ignore my numbering system
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { // 3. Added another parameter ',String breed'
		this.name = name; //4. added 'this.'
		this. breed = breed; //5. added 'this.'
		this.isHungry = true; //6. 'yes' -> 'true'
		livesRemaining = 9;
	}

	public String getName() { //7. 'void' -> 'String'
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry(){ //8. 'void' -> 'boolean' //14. corrected to camalcase
		return isHungry;
	}

	public void feed() { //9. 'boolean' -> 'void'
		this.isHungry = false;

	}

	public boolean equals(Cat other) { 
		return this.name.equals(other.name) && this.breed.equals(other.breed) //11. changed == compaison to .equals comparison
			&& this.livesRemaining == other.livesRemaining; //12. '='' -> '=='
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining."; //13. returns String instead of printing it
	}
}