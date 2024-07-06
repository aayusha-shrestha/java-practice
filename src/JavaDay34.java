
public class JavaDay34 {

	public static void main(String[] args) {
		Animal genericAnimal = new Animal();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		Catt kiwi = new Catt("Kiwi", "Tuna", "Rubber Mouse");
		
		System.out.println(kiwi.getName());
		System.out.println(kiwi.favFood);
		System.out.println(kiwi.favToy);
		
		// creating a new animal named tabby but its really a cat 
		Animal tabby = new Catt("Tabby", "Salmon", "Ball");
		acceptAnimal(tabby);
	}
	
	public static void acceptAnimal(Animal randomAnimal) {
		System.out.println();
		System.out.println(randomAnimal.getName());
		System.out.println(randomAnimal.favFood);
		System.out.println();
		
		// polymorphism: Java recognizes that tabby is a cat and calls
		// the walkAround method of the sub-class Catt instead of Animal
		randomAnimal.walkAround();
		
		// does not recognize
		// java cannot recognize the fields and methods that are defined only in the sub-class
		//System.out.println(randomAnimal.favToy);
		
		Catt tempCat = (Catt) randomAnimal;
		System.out.println(tempCat.favToy);
		
		System.out.println(((Catt)randomAnimal).favToy);
		
		if (randomAnimal instanceof Catt) {
			System.out.println(randomAnimal.getName() + " is a cat");
		}
		
		if (randomAnimal instanceof Animal) {
			System.out.println(randomAnimal.getName() + " is an animal");
		}
	}

}
