
public class ExceptionPrac {
	
	public static void main(String[] args) {
		divideByZero(2);
	}
	
	public static void divideByZero(int a) {
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't be done"); // custom message
			
			System.out.println(e.getMessage()); // print built-in message
			
			System.out.println(e.toString()); // print exception name and message
			
			/*
			 * a method of Java's throwable class which prints the throwable along with
			 * other details like the line number and class name where the exception
			 * occurred.
			 */
			e.printStackTrace();
		}
	}
}
