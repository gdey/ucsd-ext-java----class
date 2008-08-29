/***********
 * Name: Gautam Dey <gdey@anonymizerinc.com>
 * Date: Sunday, 3 Aug 2008
 * Assignment: 1
 * Class: Java Programming ][
 * Instructor: Farid Naisan
 */
/**
  Animal Interface.
**/
public interface IAnimal
{
	public String eat( String food );
	public void setID( String id );
	public void setName( String name );
	public void setNumberOfLegs( int numOfLegs );
	public AnimalSort getSort();
	public void setSort(AnimalSort sort);
	public AnimalCategoryType getCategory();
	public void setCategory(AnimalCategoryType category);
}