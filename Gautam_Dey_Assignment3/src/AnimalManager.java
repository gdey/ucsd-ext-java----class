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
	private int[] animalCount = new int[AnimalSort.values().length];

/**
 * getNumOfItems
 *
 * @param  
 * @return nmber of Animals being Managed.
 */
public int getNumOfItems() {
	return animals.size();
}

public void addElement(int index, Animal animal){
	if(index < 0 || index >= animals.size() ){
		index = 0;
	}
	AnimalSort sort = animal.getSort();
	animal.setID(sort.getAbbrv()+(++animalCount[sort.ordinal()]));
	this.animals.add(index,animal);


}
/**
 * addElement
 *
 * @param animal An animal to manage.
 * @return 
 */
public void addElement(Animal animal) {
   addElement(0,animal);
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
public Animal getElement(int index){
	Animal ani = animals.get(index);
	switch(ani.getSort()){
		case DEER:
		   Deer deer = (Deer) ani;
		   return (Deer)deer.clone();
		case DOG:
		   Dog dog = (Dog) ani;
		   return (Dog)dog.clone();
	    case GIFRAFFE:
		   Gifraffe gifraffe = (Gifraffe) ani;
		   return (Gifraffe)gifraffe.clone();
		case HORSE:
			Horse horse = (Horse) ani;
			return (Horse)horse.clone();
		case LION:
			Lion lion = (Lion) ani;
			return (Lion)lion.clone();
		case WOLF:
			Wolf wolf = (Wolf) ani;
			return (Wolf)wolf.clone();
		case CHEETAH:
			Cheetah cheetah = (Cheetah) ani;
			return (Cheetah)cheetah.clone();
		default:
		  // Don't know that type of creature.
		    return (Animal)ani.clone();
	}
}

public ArrayList<Animal> getAnimals(){
	ArrayList<Animal> o = new ArrayList<Animal>();
	o.addAll(animals);
	return o;
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

public void removeElement(int index)
{
	if(! (index < 0 || index >= animals.size() ) ){
		animals.remove(index);
	}
}
public void replaceElement(int index, Animal animal)
{
	if(! (index < 0 || index >= animals.size() ) ){
		removeElement(index);
		addElement(index,animal);
	} else {
		addElement(animal);
	}
}
/**
 * addTestValues
 *
 * @param  
 * @return 
 */
public void addTestValues( ) {
	addElement(new Horse("Black Beauty"));
	addElement(new Horse("White Beauty"));
	addElement(new Dog("Rits"));
	addElement(new Wolf("Rocky"));
	addElement(new Gifraffe("Giggy",HousingType.Stable));
}

}