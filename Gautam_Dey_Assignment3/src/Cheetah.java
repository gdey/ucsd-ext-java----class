/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Cheetah extends RunningMeatEater 
{
	Cheetah (String name, String id, HousingType housing) {
		super(name,id,4,housing);
		setSort(AnimalSort.CHEETAH);
		setSpeed(80);
	}
	Cheetah (String name, HousingType housing) {
		super(name,4,housing);
		setSort(AnimalSort.CHEETAH);
		setSpeed(80);
	}
	Cheetah (String name) {
		super(name,4,HousingType.Stable);
		setSort(AnimalSort.CHEETAH);
		setSpeed(80);
	}
	public Cheetah clone(){
		return (Cheetah)super.clone();
	}

}
