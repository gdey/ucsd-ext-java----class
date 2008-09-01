/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */

public class HouseCat extends MeatEater
{
	HouseCat (String name, String id, HousingType housing) {
		super(name,id,4,housing);
		setSort(AnimalSort.HOUSECAT);
	}
	HouseCat (String name, HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.HOUSECAT);
	}
	HouseCat (String name) {
		super(name,4,HousingType.Indoor);
		setSort(AnimalSort.HOUSECAT);
	}
	public HouseCat clone(){
		return (HouseCat)super.clone();
	}
}
