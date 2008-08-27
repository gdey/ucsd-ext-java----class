/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
public class UserInterface	
{
	private AnimalManager animalMngr;
	

	public void start( ) {
		startTest();
	}

	public void startTest( ) {
		// Let's make a new AnimalManager with no animals.
		String[] animalsToPrint;
		animalMngr = new AnimalManager();
		// First let's add some Animals
		animalMngr.addTestValues();
		// Now let's print out all the animals.
		animalsToPrint = animalMngr.getAnimalList();
		System.out.println("\tAll Animals in the Animal Farm");
		System.out.println("*****\t**********\t******\t**********\t*****");
	    for(int i = 0; i < animalsToPrint.length; i++){
			 if( animalsToPrint[i] != null )
			  {
		  		System.out.println(animalsToPrint[i]);
			 }
		}
		System.out.println("*****\t**********\t******\t**********\t*****");
		
		// Now let's print out all the horses.
		animalsToPrint = animalMngr.getHorseList();
		System.out.println("\n\n\n\tAll Horses in the Animal Farm");
		System.out.println("*****\t**********\t******\t**********\t*****");
	    for(int i = 0; i < animalsToPrint.length; i++){
		  if( animalsToPrint[i] != null )
		  {
		    System.out.println(animalsToPrint[i]);
		  }
		}
		System.out.println("*****\t**********\t******\t**********\t*****");
	}
	
}
