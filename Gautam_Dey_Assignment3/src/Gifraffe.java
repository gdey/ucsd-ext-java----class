/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Gifraffe extends PlantEater
{
	Gifraffe (String name, String id, HousingType housing) {
		super(name,id,4,housing,AnimalSortType.GIFRAFFE);
	}
	Gifraffe (String name,  HousingType housing) {
		super(name,"G00",4,housing,AnimalSortType.GIFRAFFE);
	}
	Gifraffe (String name) {
		super(name,"G00",4,HousingType.Outdoor,AnimalSortType.GIFRAFFE);
	}
}
