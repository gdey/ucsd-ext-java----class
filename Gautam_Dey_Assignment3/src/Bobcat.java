/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */

public class Bobcat extends MeatEater
{
	Bobcat (String name, String id, HousingType housing) {
		super(name,id,4,housing);
		setSort(AnimalSort.BOBCAT);
	}
	Bobcat (String name, HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.BOBCAT);
	}
	Bobcat (String name) {
		super(name,4,HousingType.Outdoor);
		setSort(AnimalSort.BOBCAT);
	}
	public Bobcat clone(){
		return (Bobcat)super.clone();
	}
}
