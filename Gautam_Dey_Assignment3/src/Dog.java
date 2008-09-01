/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */

public class Dog extends MeatEater
{
	Dog (String name, String id, HousingType housing) {
		super(name,id,4,housing);
		setSort(AnimalSort.DOG);
	}
	Dog (String name, HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.DOG);
	}
	Dog (String name) {
		super(name,4,HousingType.Indoor);
		setSort(AnimalSort.DOG);
	}
	public Dog clone(){
		return (Dog)super.clone();
	}
}
