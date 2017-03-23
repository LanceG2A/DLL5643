

public class Test {

	

public static void main(String[] args) //Main Method
{

	
	DoublyLinkedList test = new DoublyLinkedList();
	
	System.out.println("First, Links will be added to a doubly linked list\n using the addStart"
			+ " method just to demonstrate \nthat the list is functional and can be\n printed "
			+ "forwards and backwards");
	
	test.addStart("Yellow");
	test.addStart("Blue");
	test.addStart("Green");
	test.addStart("Purple");
	
	System.out.println("\n Links containing the strings: Yellow, Blue, Green, and Purple,\n "
			+ "have been created and added to the front of the list"
			+" in that order.\n  Now we will print the list forwards and backwards");
	
	test.printListForward();
	System.out.println();
	test.printListBackward();
	System.out.println();
	
	System.out.println("Now I will create a new listing adding the strings: "
			+ "\nOrange, Red, Blue, and Maroon and they will be alphabetically ordered"
			+ "\n Now the list will be printed forwards and then backwards: \n");
	DoublyLinkedList test2 = new DoublyLinkedList();
	test2.addAlphabetical("Orange");
	test2.addAlphabetical("Red");
	test2.addAlphabetical("Blue");
	test2.addAlphabetical("Maroon");
	
	test2.printListForward();
	System.out.println();
	test2.printListBackward();
	System.out.println();
	
	System.out.println("Deleting the Link containing Maroon and printing forwards and backwards: ");
	test2.deleteLink("Maroon");
	test2.printListForward();
	System.out.println();
	test2.printListBackward();
	
	System.out.println("\nNow finding the Link that contains Blue: ");
	
	System.out.println(test2.find("Blue"));
	
	System.out.println("\nNow destroying the second list and trying to print it forwards and backwards: ");
	test2.destroyList();
	test2.printListForward();
	test2.printListBackward();
	
	System.out.println("\nNow trying to find the Links containing Blue, Red, and Orange");
	System.out.println(test2.find("Blue"));
	System.out.println(test2.find("Red"));
	System.out.println(test2.find("Orange"));
	
	System.out.println("Or we can simply use the isEmpty method to see that the list is empty"
			+ "if it is empty we will get a value of true,\n if not it will be false: ");
	System.out.println(test2.isEmpty());
	
	System.out.println("The first list that was created has not been deleted so we can test "
			+ "the isEmpty method with that list as well.");
	System.out.println("The first list is empty? : " + test.isEmpty());
	
	
	
}
}