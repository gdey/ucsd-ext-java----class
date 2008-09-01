/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
/** The basic enums for Animals Sorts, also acts as a factory! **/ 

public enum AnimalSort
{
	/*
	 * If Modify this list, be sure to modify the getAnimal function 
	 *   and the AnimalManager getElement function.
	 */
	DEER("DR"),
	DOG("D"),
	GIFRAFFE("G"),
	HORSE("H"),
	LION("L"),
	CHEETAH("C"),
	WOLF("W"),
	BOBCAT("BC"),
	ELEPHANT("E"),
	SNAKE("S"),
	HOUSECAT("HC");
	
	private String abbrv;
	
	AnimalSort(String abbrv) {
		this.abbrv = abbrv;
	}
	public Animal getAnimal( String name ){
		
		switch( this ){
			case DEER:
				return new Deer(name);
			case DOG:
				return new Dog(name);
			case GIFRAFFE:
				return new Gifraffe(name);
			case HORSE:
				return new Horse(name);
			case LION:
				return new Lion(name);
			case WOLF:
				return new Wolf(name);
			case CHEETAH:
				return new Cheetah(name);
			case BOBCAT:
				return new Bobcat(name);
			case HOUSECAT:
				return new HouseCat(name);
			case ELEPHANT:
				return new Elephant(name);
			case SNAKE:
				return new Snake(name);
			default:
				// Throw exception here.
				return null;
		}	
	}
	public String getAbbrv(){
		return abbrv;
	}
	public String toString(){
		return this.name().toLowerCase();
	}
};