/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public final class AnimalDontEatThisException extends Exception {
	String message;
    public AnimalDontEatThisException() {
        super("Error: This animal doesn't eat this type of food.");
		this.message = "Error: This animal doesn't eat this type of food.";
	}

	public AnimalDontEatThisException( String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}
