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

	// To help with the creation of indexes.
		int horseCount    = 1;
		int dogCount      = 1;
		int lionCount     = 1;
		int deerCount     = 1;
		int gifraffeCount = 1;
		int wolfCount     = 1;

/**
 * getNumOfItems
 *
 * @param  
 * @return nmber of Animals being Managed.
 */
public int getNumOfItems() {
	return animals.size();
}

public void addAnimalIntoIndex(int index, Animal animal){
	if(index < 0 || index >= animals.size() ){
		index = 0;
	}
	if(animal == null )
	  return ;
	
	if(animal instanceof Dog){
		animal.setIDNumber("D"+dogCount);
		dogCount++;
	} else if( animal instanceof Deer ){
		animal.setIDNumber("Dr"+deerCount);
		deerCount++;
	} else if( animal instanceof Gifraffe ) {
		animal.setIDNumber("G"+gifraffeCount);
		gifraffeCount++;
	} else if( animal instanceof Lion ) {
		animal.setIDNumber("L"+lionCount);
		lionCount++;
	} else if( animal instanceof Wolf ) {
		animal.setIDNumber("W"+wolfCount);
		wolfCount++;
	} else if( animal instanceof Horse ) {
		animal.setIDNumber("H"+horseCount);
		horseCount++;
	}
	// If unknown leave the id alone.
	this.animals.add(index,animal);


}
/**
 * addAnimal
 *
 * @param animal An animal to manage.
 * @return 
 */
public void addAnimal(Animal animal) {
   addAnimalIntoIndex(0,animal);
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
public ArrayList<Animal> animals() {
	return animals;
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

public void removeIndex(int index)
{
	if(! (index < 0 || index >= animals.size() ) ){
		animals.remove(index);
	}
}
public void replaceAnimalAtIndex(int index, Animal animal)
{
	if(! (index < 0 || index >= animals.size() ) ){
		removeIndex(index);
		addAnimalIntoIndex(index,animal);
	} else {
		addAnimal(animal);
	}
}
/**
 * addTestValues
 *
 * @param  
 * @return 
 */
public void addTestValues( ) {
	addAnimal(new Horse("Black Beauty","H01",HousingType.Stable));
	addAnimal(new Horse("White Beauty","H02",HousingType.Stable));
	addAnimal(new Dog("Rits","D01",HousingType.Indoor));
	addAnimal(new Wolf("Rocky","W03",HousingType.Outdoor));
	addAnimal(new Gifraffe("Giggy","G04",HousingType.Stable));
}

}