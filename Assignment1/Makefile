#/***********
# * Name: Gautam Dey <gdey@anonymizerinc.com>
# * Date: Sunday, 3 Aug 2008
# * Assignment: 1
# * Class: Java Programming ][
# * Instructor: Farid Naisan
# */

AnimalFarm.class: UserInterface.class AnimalFarm.java
	javac AnimalFarm.java
	
AnimalManager.class: animals AnimalManager.java
	javac AnimalManager.java

UserInterface.class: AnimalManager.class UserInterface.java
	javac UserInterface.java
	
animals: Dog.class Lion.class Wolf.class Horse.class Gifraffe.class Deer.class

IAnimal.class: IAnimal.java
	javac IAnimal.java
	
HousingType.class: HousingType.java
	javac HousingType.java
	
Animal.class: IAnimal.class HousingType.class Animal.java
	javac Animal.java
	
MeatEater.class: Animal.class MeatEater.java
	javac MeatEater.java
	
PlantEater.class: Animal.class PlantEater.java
	javac PlantEater.java
	
Dog.class: MeatEater.class Dog.java
	javac Dog.java

Lion.class: MeatEater.class Lion.java
	javac Lion.java

Wolf.class: MeatEater.class Wolf.java
	javac Wolf.java

Horse.class: PlantEater.class Horse.java
	javac Horse.java
	
Gifraffe.class: PlantEater.class Gifraffe.java
	javac Gifraffe.java

Deer.class: PlantEater.class Deer.java
	javac Deer.java

clean:
	rm *.class