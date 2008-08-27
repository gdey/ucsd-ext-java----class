package Animals;
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
		super(name,id,4,housing,AnimalSortType.Dog);
	}
	Dog (String name) {
		super(name,"D00",4,housing,AnimalSortType.Dog);
	}
	Dog (String name) {
		super(name,id,4,HousingType.Indoor,AnimalSortType.Dog);
	}
}