enum FoodItem {
		
	GRASS(FoodType.PLANT),
	LEAVES(FoodType.PLANT),
	FRUIT(FoodType.PLANT),
	HERBS(FoodType.PLANT),
	PORK(FoodType.MEAT),
	BEEF(FoodType.MEAT),
	CHICKEN(FoodType.MEAT);
	
	private FoodType type;
	FoodItem(FoodType type) { this.type = type; }
}