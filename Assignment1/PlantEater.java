/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public abstract class PlantEater extends Animal
{
	PlantEater (String name, String id, int numberOfLegs, HousingType housing) {
		super(name,id,numberOfLegs,housing);
	}
	/**
	 * toString
	 *
	 * @param  
	 * @return String
	 */
	public String toString( ) {
		return super.toString() + ",\t Category: Plant Eater";
	}
	
	/**
	 * eat
	 *
	 * @param food  What you want to feed this animal.
	 * @return Weather the animal like the food you tried to feed it.
	 */
	public String eat(String food ) {
		if( food.equalsIgnoreCase("Grass") || food.equalsIgnoreCase("Leaves") )
		{
			return likesFood();
		}
		return dislikesFood();
	}

}