
public class NodeQueue 
{
	private int data;
	private NodeQueue next;
	public NodeQueue(int data) 
	{

		this.data = data;
		next = null;
	}
	public int getData() 
	{
		return data;
	}
	public void setData(int data) 
	{
		this.data = data;
	}
	public NodeQueue getNext() 
	{
		return next;
	}
	public void setNext(NodeQueue next) 
	{
		this.next = next;
	}

}
