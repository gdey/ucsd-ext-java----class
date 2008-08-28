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
	private int[] animalCount = new int[AnimalSortType.values().length];

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
	AnimalSortType sort = animal.getSort();
	animal.setID(sort.getAbbrv()+(++animalCount[sort.ordinal()]));
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
	addAnimal(new Horse("Black Beauty"));
	addAnimal(new Horse("White Beauty"));
	addAnimal(new Dog("Rits"));
	addAnimal(new Wolf("Rocky"));
	addAnimal(new Gifraffe("Giggy",HousingType.Stable));
}

}