

public class Test {

	

public static void main(String[] args) //Main Method
{

	
	DoublyLinkedList test = new DoublyLinkedList();
	
	test.addStart("Yellow");
	test.addStart("Blue");
	test.addStart("Green");
	test.addStart("Purple");
	
	
	
	test.printListForward();
	System.out.println();
	test.printListBackward();
	System.out.println();
	
	System.out.println("Alphabetically: ");
	DoublyLinkedList test2 = new DoublyLinkedList();
	test2.addAlphabetical("Orange");
	test2.addAlphabetical("Red");
	test2.addAlphabetical("Blue");
	test2.addAlphabetical("Maroon");
	
	test2.printListForward();
	System.out.println();
	test2.printListBackward();
	System.out.println();
	
	System.out.println("Deleting the Link containing Maroon: ");
	test2.deleteLink("Maroon");
	test2.printListForward();
	System.out.println();
	test2.printListBackward();
	
	System.out.println("\nNow finding the Link that contains Blue: ");
	
	System.out.println(test2.find("Blue"));
	
	
}
}