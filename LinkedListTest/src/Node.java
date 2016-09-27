
public class Node {
	private Node next;
   private Object data;
   
	public Node(Object datavalue) {
		data= datavalue;
		next = null;
	}
	
	public Node(Object datavalue,Node nextnode)
	{
		data = datavalue;
		next = nextnode;
	}

	public Object getdata()
	{
		return data;
	}
	public void setdata(Object datavalue)
	{
		data = datavalue;
	}
	public Node getNext()
	{
		return next;
	}
	public void setNext(Node nextNode)
	{
		next = nextNode;
	}
}
