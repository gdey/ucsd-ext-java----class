/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Horse extends PlantEater
{
	Horse (String name, String id, HousingType housing) {
		super(name,id,4,housing);
	}
	/**
	 * toString
	 *
	 * @param  
	 * @return 
	 */
	public String toString( ) {
		return super.toString() + ",\t Sort: Horse";
	}
}
