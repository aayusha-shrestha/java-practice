public class Animal {
	private String name = "Animal";
	public String favFood = "Food";
	
	protected final void changeName(String newName) {
		this.name = newName;
	}
	
	protected String getName() {
		return this.name;
	}
	
	public void eatStuff() {
		System.out.println("Yum " + favFood);
	}
	
	public void walkAround() {
		System.out.println(name + " stalks around");
	}
	
	public Animal() {}
	
	public Animal(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}
	
}
