enum FoodItem {
		
	GRASS(FoodType.PLANT),
	LEAVES(FoodType.PLANT),
	FRUIT(FoodType.PLANT),
	HERBS(FoodType.PLANT),
	PORK(FoodType.MEAT),
	BEEF(FoodType.MEAT),
	LAMB(FoodType.MEAT),
	GOAT(FoodType.MEAT),
	ZEBRA(FoodType.MEAT),
	GIFRAFFE(FoodType.MEAT),
	CHICKEN(FoodType.MEAT);
	
	private FoodType type;
	FoodItem(FoodType type) { this.type = type; }
	public FoodType getType(){ return this.type; }
	public String toString(){ return this.name().toLowerCase(); }
}