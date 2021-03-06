/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public abstract class MeatEater extends Animal
{
	MeatEater (String name, String id, int numberOfLegs, HousingType housing) {
		super(name,id,numberOfLegs,housing);
	}
	
	/**
	 * eat
	 *
	 * @param food  What you want to feed this animal.
	 * @return Weather the animal like the food you tried to feed it.
	 */
	public String eat(String food ) {
		if( food.equalsIgnoreCase("Pork") || food.equalsIgnoreCase("Beef") )
		{
			return likesFood();
		}
		return dislikesFood();
	}
	public String category() {
		return "Meat Eater";
	}

}
