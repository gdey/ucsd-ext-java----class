/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
/** The basic enums for Animals Sorts, also acts as a factory! **/ 

public enum AnimalSortType
{
	DEER,
	DOG,
	GIFRAFFE,
	HORSE,
	LION,
	WOLF;
	
	public Animal getAnimal( String name ){
		
		switch( this )
		{
			case DEER:
				return new Deer(name);
				break;
			case DOG:
				return new Dog(name);
				break;
			case GIFRAFFE:
				return new Gifraffe(name);
				break;
			case HORSE:
				return new Horse(name);
				break;
			case LION:
				return new Lion(name);
				break;
			case WOLF:
				return new Wolf(name);
				break;
			default:
				// Throw exception here.
		}	
	}
};