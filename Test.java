
public class Test {


public static void main(String[] args) //Main Method
{
	DoublyLinkedList test = new DoublyLinkedList();
	test.addStart("Blue");
	test.addStart("Green");
	test.addStart("Purple");
	test.printListForward();
	System.out.println();
	test.printListBackward();
	
}
}