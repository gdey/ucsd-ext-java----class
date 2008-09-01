/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public final class InvalidAnimalParamater extends Exception {
	private String field;
	private String message;
	
    public InvalidAnimalParamater() {
        super("Error: Represented Animal Can not be created due to bad field.");
		this.message = "";
		this.field = "";
    }

	public InvalidAnimalParamater( String field, String message) {
		super("Error: " + field + " -- " + message);
		this.field = field;
		this.message = message;
	}
	
	public String getField() {
		return this.field;
	}
	
	public String getMessage(){
		return this.message;
	}
}
