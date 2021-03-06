/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Deer extends PlantEater
{
	Deer (String name, String id, HousingType housing) {
		super(name,id,4,housing);
		setSort(AnimalSort.DEER);
	}
	Deer (String name, HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.DEER);
	}
	Deer (String name) {
		super(name,4,HousingType.Stable);
		setSort(AnimalSort.DEER);
	}
	public Deer clone(){
		return (Deer)super.clone();
	}	
}