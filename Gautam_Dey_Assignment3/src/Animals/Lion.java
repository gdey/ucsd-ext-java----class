package Animals;
/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Lion extends MeatEater
{
	Lion (String name, String id, HousingType housing) {
		super(name,id,4,housing, AnimalSortType.Lion);
	}
	Lion (String name, HousingType housing) {
		super(name,"L00",4,housing, AnimalSortType.Lion);
	}
	Lion (String name) {
		super(name,"L00",4,HousingType.Outdoor, AnimalSortType.Lion);
	}
}