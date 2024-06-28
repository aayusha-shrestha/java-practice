
public class StaticVsNonStatic {
	public static void main (String[]args){
		System.out.println(Cat.getCatCount());
		
		Cat myCat = new Cat();
		
		// Cat.meow() gives error since the class does not have its own name and age, the individual object does
		// Class is just a blueprint for creating objects
		// Class cat is not an actual object
		myCat.meow();
		
		myCat.name = "Kio";
		myCat.age = 3;
		
		// directly access the static method
		System.out.println(Cat.getCatCount());
		// System.out.println(myCat.getCatCount()); does not give error but discouraged. this line of code
		// implies that the count applies to an individual cat, myCat, which is wrong since it implies
		// to the class as a whole

	}
}
