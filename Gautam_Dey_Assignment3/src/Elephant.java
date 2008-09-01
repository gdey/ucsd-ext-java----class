/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */

public class Elephant extends PlantEater
{
	Elephant (String name, String id, HousingType housing) {
		super(name,id,4,housing);
		setSort(AnimalSort.ELEPHANT);
	}
	Elephant (String name, HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.ELEPHANT);
	}
	Elephant (String name) {
		super(name,4,HousingType.Outdoor);
		setSort(AnimalSort.ELEPHANT);
	}
	public Elephant clone(){
		return (Elephant)super.clone();
	}
}
