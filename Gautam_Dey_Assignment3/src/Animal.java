/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public abstract class Animal implements IAnimal
{
	private String             name;
	private String             id;
	private int                numberOfLegs;
	private boolean            isAggressive;
	private HousingType        housing;
	private AnimalSortType     sort;
	private AnimalCategoryType category;
	
	/************* Constructors ***************************/
	public Animal (String name, String id, int numberOfLegs, HousingType housing, AnimalSortType sort, AnimalCategoryType categoryType, boolean isAggressive )
	{
		this.setName( name );
		this.setID( id );
		this.setNumberOfLegs( numberOfLegs );
		this.setHousing( housing );
		this.setSort( sort );
		this.setCategory( category );
		this.setIsAggressive( isAggressive );
	}
	
	public Animal(String name, String id, int numberOfLegs, HousingType housing, AnimalSortType sort, AnimalCategoryType category)
	{
		this.setName( name );
		this.setID( id );
		this.setNumberOfLegs( numberOfLegs );
		this.setHousing( housing );
		this.setSort( sort );
		this.setCategory( category );
		this.setIsAggressive( false );		
	}
	
	/************* Getters ***************************/	
	/**
	 * getName 
	 *   Returns the name of the Animal.
	 * @param 	
	 * @return Name of the Animal
	 */
	public String getName( ) {
		return name;
	}
	
	/**
	 * getIDNumber
	 *	Returns the IDNumber of the animal
	 * @param  
	 * @return Return the IDNumber of the animal.
	 */
	public String getID( ) {
		return id;
	}
	
	/**
	 * getNumberOfLegs
	 *    Returns the number of legs the animal has.
	 * @param  
	 * @return Returns the number of legs. 
	 */
	public Integer getNumberOfLegs( ) {
		return numberOfLegs;
	}
	/**
	 * getHousing
	 *   Returns the type of housing the animal is kept in.
	 * @param  
	 * @return The type of Housing. 
	 */
	public HousingType getHousing( ) {
		return housing;
	}
	
	/**
	 * isAggressive
	 *   Returns weather or not the animal is aggressive.
	 * @return boolean
	 */
	public boolean isAggressive() {
		return this.isAggressive;
	}
	
	/************* Setters ***************************/
	/**
	 * setHousing
	 *    Set the typing of housing the animal is kept in.
	 * @param housing 
	 * @return  None.
	 */
	public void setHousing(HousingType housing ) {
		this.housing = housing;
	}

	
	/**
	 * setName
	 *   Set the name of the Animal
	 * @param name 
	 * @return nothing
	 */
	public void setName(String name) {
		if(name == null || name.length() == 0) {
			throw new IllegalArgumentException("Empty string or null reference passed to setName");
		} else {
		    this.name = name;			
		}
	}
	/**
	 * setIDNumber
	 *   Sets the id number of the Animal
	 * @param id 
	 * @return nothing
	 */
	public void setID(String id) {
		this.id = id;
	}
	/**
	 * setNumberOfLegs
	 *
	 * @param numOfLegs 
	 * @return nothing
	 */
	public void setNumberOfLegs(int numOfLegs) {
		this.numberOfLegs = numOfLegs;	
	}
    /**
     * setIsAggressive
     *   Set weather or not the animal is aggressive.
     * @param isAggressive boolean.
     * @return nothing
     */
	public void setIsAggressive( boolean isAggressive ) {
		this.isAggressive = isAggressive;
	}

	/**
	 * toString
	 *    Stringfy the animal object. 
	 * @param  
	 * @return A string version of the animal object.
	 */
	public String toString( ) {
		return " ID: "          + id           + "," +
		       " Name: "        + name         + "," +
		       " Num of legs: " + numberOfLegs + "," +
		       " Living: "      + housing      + "," +
		       " Category: "    + category     + "," +
		       " Sort: "        + sort;
	}
	
	
	/**
	 * likeFood
	 *
	 * @param  
	 * @return "Nom Nom"
	 */
	public final String likesFood( ) {
		return "Nom Nom";
	}

	/**
	 * dislikesFood
	 *
	 * @param  
	 * @return "Yuck!"
	 */
	public final String dislikesFood( ) {
		return "Yuck!";
	}

	/**
	 * eat
	 *    Feed the animal something.
	 * @param food	What the animal is going to eat.
	 * @return String 'Nom nom nom' or 'Yuck' depending on what the animal likes.
	 */
	public String eat(String food) {
		// The default animal is an omnivor, it love everything you give it.
		return likesFood();
	}
	
	public void setCategory(AnimalCategoryType category) {
		this.category = category;
	}
	public AnimalCategoryType getCategory() {
		return category;
	}
	public void setSort(AnimalSortType sort) {
		this.sort = sort;
	}
	public AnimalSortType getSort() {
		return sort;
	}
	
}
