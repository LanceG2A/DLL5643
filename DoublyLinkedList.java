
public class DoublyLinkedList {

	private Link head; //field to store the first Link
	private int size;  //field to hold the size of the list
	
	public DoublyLinkedList(){  //Base constructor to create an empty list
		head = null;
		size = 0;
	}
	
	public void addStart(String color)//to add a link in the list at the beginning
	{
		if(head == null)		//checks if the list is empty
		{						//if it is empty it sets the first Link to "color"
			head = new Link(null, color, null); //and since it is the only Link, 
		}										// next and previous are null (empty)
		else
		{
			Link newLink = new Link(null, color, head);// makes the "next" link the head node
			head.previous = newLink;					//takes old head (start) and sets previous
			head = newLink;								//to the new start we just made
		}
		size++;
	}
	
	public void addAlphabetical(String color){ //Method to add Links in alphabetical order
		if(head == null){
			head = new Link(null, color, null); //If the list is empty the Link added is the first
		}
		else{
		Link temp = head;		
			if(temp.next == null){  //checks to see if there is only one item in the list and compares
				if(color.compareTo(temp.colorName) > 0){
					Link newLink = new Link(head, color, null);
					head.next = newLink;
		}					//The if else statement is used to determine where the second Link will go
				else {		//It will either be the new head or the next Link in the list
					Link newLink = new Link(null, color, head);
					head.previous = newLink;
					head = newLink;
		}
		}
			else{		//Now if there is more than one Link in the list, we iteratively check until
				int i = 0;	// we find the location that the Link needs to go
				while(i == 0){
					if(color.compareTo(temp.colorName) > 0){					
						if(temp.next != null){
							temp = temp.next;
						}
						else{
							Link newLink = new Link(temp, color, temp.next);
							Link temp2 = temp.next;
							temp2.previous = newLink;
							temp.next = newLink;
							i++;
						}
			}
				else{
						Link newLink = new Link(temp.previous, color, temp);
						if(temp.previous == null){
							head = newLink;
							temp.previous = newLink;
							head.next = temp;
						}
						else{
							temp.previous.next = newLink;
							temp.previous = newLink;
						}
						i++;
				}					
						
			}
		}
		}
				
			}
			
		
		
		
	
	
	
	public int size()
	{
		return size;
	}
	public void printListForward(){//iterates through the list and prints each Link
		Link current = head;
		if(current != null){
			while(current != null){
				System.out.println(current.colorName);
				current = current.next;
		}
		}
		else{
			System.out.println("Empty List");
		}
	}
	public void printListBackward(){//iterates forward through the list, then prints from back to front
		Link current = head;
		if(current != null){
		while(current.next != null){
			current = current.next;
		}
		System.out.println(current.colorName);
		while(current.previous != null){
			System.out.println(current.previous.colorName);
			current = current.previous;
		}
		}
		else{
			System.out.println("Empty List");
		}
	}
	
	public boolean isEmpty(){
		return head == null;	//returns true if head is null
	}
	

	
	public void deleteLink(String color){ //deletes a node base on the color name it contains
		Link temp = head;
		while(temp.colorName != color){
			temp = temp.next;
		}
		Link next = temp.next;
		Link previous = temp.previous;
		next.previous = previous;
		previous.next = next;
	}
	public String find(String color){
		Link temp = head;
		if(temp != null){
			while(temp.colorName != color){
				temp = temp.next;
			}
			return temp.colorName;
		}
		else{
			return "Link does not exist";
		}
		
		
	}
	public void destroyList(){
		Link temp = head;
		while(temp != null){
			head = null;
			Link temp2 = temp;
			temp = temp.next;
			temp2.previous = null;
			temp2.next = null;
			temp2 = null;
		}
	}
}
	
	
	
	
	

