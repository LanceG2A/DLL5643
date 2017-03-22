
public class DoublyLinkedList {

	private Link head;
	private int size;
	
	public DoublyLinkedList(){
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
	
	public void addAlphabetical(String color){ //works now
		if(head == null){
			head = new Link(null, color, null);
		}
		else{
		Link temp = head;
			if(temp.next == null){
				if(color.compareTo(temp.colorName) > 0){
					Link newLink = new Link(head, color, null);
					head.next = newLink;
		}
				else {
					Link newLink = new Link(null, color, head);
					head.previous = newLink;
					head = newLink;
		}
		}
			else{
				int i = 0;
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
	public void printListForward(){
		Link current = head;
		while(current != null){
			System.out.println(current.colorName);
			current = current.next;
		}
	}
	public void printListBackward(){
		Link current = head;
		while(current.next != null){
			current = current.next;
		}
		System.out.println(current.colorName);
		while(current.previous != null){
			System.out.println(current.previous.colorName);
			current = current.previous;
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
		while(temp.colorName != color){
			temp = temp.next;
		}
		
		return temp.colorName;
	}
}
	
	
	
	
	

