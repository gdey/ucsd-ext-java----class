/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Cheetah extends RunningMeatEater 
{

	
	Horse (String name, String id, HousingType housing) {
		super(name,id,4,housing,AnimalSort.HORSE,80);
	}
	Horse (String name, HousingType housing) {
		super(name,4,housing,AnimalSort.HORSE,80);
	}
	Horse (String name) {
		super(name,4,HousingType.Stable,AnimalSort.HORSE,80);
	}
	
	Horse (String name, int speed){
		super(name,4, HousingType.Stable,AnimalSort.HORSE,speed);
	}

	
}
