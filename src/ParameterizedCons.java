
public class ParameterizedCons {
	
	int age;

	public ParameterizedCons(int age) {
		this.age = age;
	}
	
	public static void main (String[] args) {
		ParameterizedCons obj = new ParameterizedCons(30);
		System.out.println(obj.age);
	}
}
