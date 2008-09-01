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
		setCategory(AnimalCategoryType.MeatEater);
	}
	MeatEater (String name, int numberOfLegs, HousingType housing) {
		super(name,numberOfLegs,housing);
		setCategory(AnimalCategoryType.MeatEater);
	}
	/**
	 * eat
	 *
	 * @param food  What you want to feed this animal.
	 * @return Weather the animal like the food you tried to feed it.
	 */
	public String eat(String food ) throws AnimalDontEatThisException {
		FoodItem foundFood = null;
		for( FoodItem aFood: FoodItem.values() ){
			if( food.equalsIgnoreCase(aFood.toString()) ){
				foundFood = aFood;
				break;
			}
		}
		if( foundFood != null && FoodType.MEAT.equals(foundFood.getType())  ) {
			return likesFood();
		} 
		// Throw an error
		throw new AnimalDontEatThisException(this.getName() + "  doesn't eat "+food);
	}
	public MeatEater clone() {
		return (MeatEater)super.clone();
	}
}
