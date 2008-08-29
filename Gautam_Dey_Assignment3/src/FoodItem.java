/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
enum FoodItem {
		
	GRASS(FoodType.PLANT),
	LEAVES(FoodType.PLANT),
	FRUIT(FoodType.PLANT),
	HERBS(FoodType.PLANT),
	APPLE(FoodType.PLANT),
	BANNANNA(FoodType.PLANT),
	ORANGE(FoodType.PLANT),
	LETTUS(FoodType.PLANT),
	PORK(FoodType.MEAT),
	BEEF(FoodType.MEAT),
	LAMB(FoodType.MEAT),
	GOAT(FoodType.MEAT),
	ZEBRA(FoodType.MEAT),
	GIFRAFFE(FoodType.MEAT),
	FISH(FoodType.MEAT),
	EGGS(FoodType.MEAT),
	CHICKEN(FoodType.MEAT);
	
	private FoodType type;
	FoodItem(FoodType type) { this.type = type; }
	public FoodType getType(){ return this.type; }
	public String toString(){ return this.name().toLowerCase(); }
}