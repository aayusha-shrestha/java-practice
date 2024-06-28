
public class Cat {
	// static var
	public static int catCount = 0;
	// non-static variables
	String name;
	int age;
	int livesRemaining;
	
	// non-static method
	public void meow() {
		System.out.println("Meow");
	}
	
	// When obj is created for this class, the constructor gets called
	public Cat() {
		catCount++;
	}
	
	// static method
	public static int getCatCount() {
		return catCount;
	}
}
