/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
import java.util.ArrayList; 

public class AnimalManager extends Object
{
	private ArrayList<Animal> animals;
	AnimalManager () {
		animals = new ArrayList<Animal>();
	}


/**
 * getNumOfItems
 *
 * @param  
 * @return nmber of Animals being Managed.
 */
public int getNumOfItems() {
	return animals.size();
}

/**
 * addAnimal
 *
 * @param animal An animal to manage.
 * @return 
 */
public void addAnimal(Animal animal) {
	this.animals.add(animal);
}
/**
 * getAnimalList
 *
 * @param  
 * @return Strings of the animals managed.
 */
public String[] getAnimalList( ) {
	String[] animalsAsStrings = new String[10] ;
	for(int i=0; i < getNumOfItems(); i++)
	{
		animalsAsStrings[i] = animals.get(i).toString();
	}
	return animalsAsStrings;
}

public String[] getHorseList(){
	String[] horsesAsStrings = new String[10];
	for(int i=0; i < getNumOfItems(); i++)
	{
		if( animals.get(i) instanceof Horse ){

			horsesAsStrings[i] = animals.get(i).toString();	
		}
	}
	return horsesAsStrings;
}

/**
 * addTestValues
 *
 * @param  
 * @return 
 */
public void addTestValues( ) {
	addAnimal(new Horse("Black Beauty","0",HousingType.Stable));
	addAnimal(new Horse("White Beauty","1",HousingType.Stable));
	addAnimal(new Dog("Rits","2",HousingType.Indoor));
	addAnimal(new Wolf("Rocky","3",HousingType.Outdoor));
	addAnimal(new Gifraffe("Giggy","4",HousingType.Stable));
}

}