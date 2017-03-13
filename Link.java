
public class Link {

	String colorName;	//Fields for data,
	public Link next;	//and previous/next links(nodes)
	public Link previous;
	
	public Link(String color)
	{
		previous = null;
		this.colorName = color;
		next = null;
	}
	public Link(Link previous, Link next, String colorName) {
		this.previous = previous;
		this.next = next;
		this.colorName = colorName;
	}
	
	public String ReturnColor() {
		return this.colorName;
	}
	
}
