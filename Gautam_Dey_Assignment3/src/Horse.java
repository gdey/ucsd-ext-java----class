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
		super(name,id,4,housing,AnimalSortType.HORSE);
	}
	Horse (String name, HousingType housing) {
		super(name,4,housing,AnimalSortType.HORSE);
	}
	Horse (String name) {
		super(name,4,HousingType.Stable,AnimalSortType.HORSE);
	}
}
