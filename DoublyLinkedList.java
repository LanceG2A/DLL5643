
public class DoublyLinkedList {

	private Link head;
	private int size;
	
	public DoublyLinkedList()
	{
		head = null;
		size = 0;
	}
	
	public void addStart(String color)//to add a link in the list at the beggining
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
	}
	
	public boolean isEmpty(){
		return head == null;	//returns true if head is null
	}
	
	public void main(String[] args) //Main Method
	{
		
	}
	}
	
	
	
	
	
}
