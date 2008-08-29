/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class RunningPlantEater extends PlantEater implements IRunningAnimal{
 
	private int speed;
	
  	RunningPlantEater (String name, String id, int numberOfLegs, HousingType housing, AnimalSort sort, int speed) {
		super(name,id,numberOfLegs,housing,sort);
		this.setSpeed(speed);
	}
	RunningPlantEater (String name, int numberOfLegs, HousingType housing, AnimalSort sort,int speed) {
		super(name,numberOfLegs,housing,sort);
		this.setSpeed(speed);
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public String toString( ) {
		return super.toString()  + "," +
		       " Speed: " + speed;
	}
}
