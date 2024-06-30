import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPractice {
	public static void main (String[]args) {
		
		/* Linked List */
		
		LinkedList linkedList1 = new LinkedList();
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Aayu");
		names.add("Berry");
		
		names.addLast("Jane");
		names.addFirst("John");
		
		names.add(0, "Mary");
		
		names.set(1, "Lucy");
		
		names.remove(0);
		
		System.out.println("Name at first index: " + names.get(0));
		System.out.println("Name at last index: " + names.getLast());
		
		for(String name:names) {
			System.out.println(name);
		}
		
		/* Copying Linked List */
		
		LinkedList<String> namesCopy = new LinkedList<>(names);
		
		System.out.println("Names copy: " + namesCopy);
		
		if(names.contains("Berry")) {
			System.out.println("Berrys here");
		}
		
		if(names.containsAll(namesCopy)) {
			System.out.println("Collections the same");
		}
		
		System.out.println("The index of Jane is: " + names.indexOf("Jane"));
		
		System.out.println("Is Name Empty: " + names.isEmpty());
		
		System.out.println("How many names: " + names.size());
		
		System.out.println("Remove first element" + namesCopy.poll()); // remove first elements
		System.out.println("Remove last element" + namesCopy.pollLast()); // remove last element
		
		namesCopy.push("Lucy"); // add element at first
		System.out.println("Names copy: " + namesCopy);
		namesCopy.pop(); // remove first element
		System.out.println("Names copy: " + namesCopy);
		
		/* LinkedList to Array */
		
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));
		
	}
}
