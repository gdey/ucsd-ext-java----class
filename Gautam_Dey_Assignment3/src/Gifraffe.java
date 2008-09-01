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
		super(name,id,4,housing);
		setSort(AnimalSort.GIFRAFFE);
	}
	Gifraffe (String name,  HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.GIFRAFFE);
	}
	Gifraffe (String name) {
		super(name,4,HousingType.Outdoor);
		setSort(AnimalSort.GIFRAFFE);
	}
	public Gifraffe clone(){
		return (Gifraffe)super.clone();
	}
}
