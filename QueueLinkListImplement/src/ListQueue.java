
public class ListQueue 
{

	private NodeQueue front,rear;
	private int size;
	
	public ListQueue() 
	{
	size = 0;
	front = null;
	rear = null;
	}
	
	public void enqueqe(int data)
	{
	NodeQueue temp = new NodeQueue(data);
	if(isEmpty())
		front = temp;
	else
		rear.setNext(temp);
	rear = temp;
	size++;
	}
	
public int dequeue() throws Exception
{
	if(isEmpty())
		throw new Exception("Cannot deque: its empty");
int data = front.getData();
front = front.getNext();
size--;

if(isEmpty())
	rear = null;
return data;
}
	
	public String toString() {
		NodeQueue current = front;
		String result = "[";
		int count = 0;
		while(current != null)
		{
			
			result = result + current.getData();	
		 	count+=1;
		if(count<size)
			result+=",";
		 	
			current = current.getNext();
		}
		result +="]";
		return result;
	}
	
	public boolean isEmpty()
	{
		return (size==0);
	}
	
}
