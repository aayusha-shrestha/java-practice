import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		// Arrays have fixed size: can't grow or shrink
		// Can hold primitive data type: int, boolean and objects: Cat, Dog
		String[] friendsArray = new String[4];
		String[] friendsArray2 = {"Aayu", "Berry", "Roz"};
		
		// diamond operator holds the data type for ArrayList
		// Dynamic sizing
		// Can hold objects only
		// If we need to use primitive data type, use its wrapper class. 
		// int --> Integer, boolean --> Boolean
		ArrayList<String> friendsAl = new ArrayList<>(); 
		ArrayList <String> friendsAl2 = new ArrayList<>(Arrays.asList("Aayu","Berry","Roz"));
		
		// Accessing elements. index for both starts at 0
		System.out.println(friendsArray2[0]);
		System.out.println(friendsAl2.get(0));
		
		// Accessing size
		// .length does not have () since it is a field which is public static instance variable
		System.out.println(friendsArray2.length);
		System.out.println(friendsAl2.size());
		
		// Add element
		// Can't do for Array
		friendsAl2.add("Ben");
		System.out.println(friendsAl2.get(3));
		
		// Set element
		friendsArray2[0] = "Kate";
		System.out.println(friendsArray2[0]);
		
		friendsAl2.set(0, "Kate");
		System.out.println(friendsAl2.get(0));
		
		//Remove element
		// Can't do for Array
		System.out.println(friendsAl2);
		friendsAl2.remove(3); // or friendsAl2.remove("Ben");
		System.out.println(friendsAl2);
		
		// Printing out Array
		// Java gives memory address
		System.out.println(friendsArray2);
		
		// Looping through Array
		for (int i = 0; i<friendsArray2.length; i++) {
			System.out.println(friendsArray2[i]);
		}
		

	}

}