/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
import java.util.ArrayList; 

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
	static public FoodItem[] getFoods(FoodType type){
		
		FoodItem[] a = new FoodItem[1];
		
		ArrayList<FoodItem> items = new ArrayList<FoodItem>();
		for( FoodItem item : FoodItem.values() ){
			if(item.getType().equals(type))
			   items.add(item);
		}
		
		a = items.toArray(a);
		return a;
	}
}