import it.develhope.polymorphism02.Animal;
import it.develhope.polymorphism02.Cow;
import it.develhope.polymorphism02.Lion;

public class Main {
	public static void main(String[] args) {
		Animal animal= new Animal("animal");
		Cow  cow = new Cow("mu-mu");
		Lion lion = new Lion("mufasa");

		animal.animalSound();
		cow.animalSound();
		lion.animalSound();
	}
}