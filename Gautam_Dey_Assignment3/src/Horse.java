/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class Horse extends PlantEater implements IRunningAnimal
{
	private int speed;
	
	Horse (String name, String id, HousingType housing) {
		super(name,id,4,housing,AnimalSort.HORSE);
		this.setSpeed(50);
	}
	Horse (String name, HousingType housing) {
		super(name,4,housing,AnimalSort.HORSE);
		this.setSpeed(50);		
	}
	Horse (String name) {
		super(name,4,HousingType.Stable,AnimalSort.HORSE);
		this.setSpeed(50);		
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
}
