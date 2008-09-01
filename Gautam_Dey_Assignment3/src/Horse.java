/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Horse extends RunningPlantEater 
{

	Horse (String name, String id, HousingType housing) {
		super(name,id,4,housing);
		setSort(AnimalSort.HORSE);
		setSpeed(50);
	}
	Horse (String name, HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.HORSE);
		setSpeed(50);
	}
	Horse (String name) {
		super(name,4,HousingType.Stable);
		setSort(AnimalSort.HORSE);
		setSpeed(50);
	}
	public Horse clone(){
		return (Horse)super.clone();
	}
	
}
