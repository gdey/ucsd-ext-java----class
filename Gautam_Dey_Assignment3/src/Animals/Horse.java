package Animals;
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
		super(name,id,4,housing,AnimalSortType.Horse);
	}
	Horse (String name, HousingType housing) {
		super(name,"H00",4,housing,AnimalSortType.Horse);
	}
	Horse (String name) {
		super(name,"H00",4,HousingType.Outdoor,AnimalSortType.Horse);
	}
}
