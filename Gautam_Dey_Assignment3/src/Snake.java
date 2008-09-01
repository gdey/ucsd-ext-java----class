/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 3
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */

public class Snake extends MeatEater
{
	Snake (String name, String id, HousingType housing) {
		super(name,id,0,housing);
		setSort(AnimalSort.SNAKE);
	}
	Snake (String name, HousingType housing) {
		super(name,0,housing);
		setSort(AnimalSort.SNAKE);
	}
	Snake (String name) {
		super(name,0,HousingType.Cage);
		setSort(AnimalSort.SNAKE);
	}
	public Snake clone(){
		return (Snake)super.clone();
	}
}
