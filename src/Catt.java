
public class Catt extends Animal {
	public String favToy = "Yarn";
	
	public void playWith() {
		System.out.println("I like " + favToy);
	}
	
	public void walkAround() {
		// access instance method using this keyword
		System.out.println(this.getName() + " stalks around");
	}
	
	public Catt() {
		
	}
	
	public Catt(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy= favToy;	}
}
