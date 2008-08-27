package Animals;
/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Wolf extends MeatEater
{
	Wolf (String name, String id, HousingType housing) {
		super( name, id, 4, housing, AnimalSortType.Wolf );
	}
	Wolf (String name, HousingType housing) {
		super( name, "W00", 4, housing, AnimalSortType.Wolf );
	}
	Wolf (String name) {
		super( name, "W00", 4, HousingType.Outdoor, AnimalSortType.Wolf );
	}
}
