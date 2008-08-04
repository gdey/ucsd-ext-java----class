/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public abstract class Animal implements IAnimal
{
	private String name;
	private String idNumber;
	private int numberOfLegs;
	

	
	private HousingType housing;
	
	public Animal (String name, String id, int numberOfLegs, HousingType housing)
	{
		this.name = name;
		this.idNumber = id;
		this.numberOfLegs = numberOfLegs;
		this.housing = housing;
	}
	
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
	public String getIDNumber( ) {
		return idNumber;
	}
	/**
	 * getNumberOfLegs
	 *    Returns the number of legs the animal has.
	 * @param  
	 * @return Returns the number of legs. 
	 */
	public int getNumberOfLegs( ) {
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
	 * setHousing
	 *    Set the typing of housing the animal is kept in.
	 * @param housing 
	 * @return  None.
	 */
	public void setHousing(HousingType housing ) {
		this.housing = housing;
	}
	/**
	 * toString
	 *    Stringfy the animal object. 
	 * @param  
	 * @return A string version of the animal object.
	 */
	public String toString( ) {
		return " No "           + idNumber     + ":" +
		       "\t Name: "        + name         + "," +
		       "\t Num of legs: " + numberOfLegs + "," +
		       "\t Living: "      + housing;
	}
	
	/**
	 * setName
	 *   Set the name of the Animal
	 * @param name 
	 * @return nothing
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * setIDNumber
	 *   Sets the id number of the Animal
	 * @param id 
	 * @return nothing
	 */
	public void setIDNumber(String id) {
		this.idNumber = id;
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

	

	

	
	

	

	

	

	

	

	

	
}
