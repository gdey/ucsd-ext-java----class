/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class RunningPlantEater extends PlantEater implements IRunningAnimal{
 
	private int speed;
	
	RunningPlantEater (String name, String id, int numberOfLegs, HousingType housing) {
		super(name,id,numberOfLegs,housing);
		setSpeed(0);
	}
	RunningPlantEater (String name, int numberOfLegs, HousingType housing) {
		super(name,numberOfLegs,housing);
		setSpeed(0);
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
	public RunningPlantEater clone(){
		RunningPlantEater clone = (RunningPlantEater) super.clone();
		clone.setSpeed(speed);
		return clone;		
	}
}
