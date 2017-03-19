
public class Link { //Class to for Links (Nodes)

	String colorName;	//Fields for data,
	public Link next;	//and previous/next links(nodes)
	public Link previous;
	
	public Link(String color) //Constructor initialializes link
	{							//
		previous = null;
		this.colorName = color;
		next = null;
	}
	public Link(Link previous, String colorName, Link next) { 
		this.previous = previous;  //
		this.colorName = colorName;
		this.next = next;	
	}
	
	public String ReturnColor() {  //Return link information
		return this.colorName;
	}
	
}
