
public class LinkedlistClass 
{

	public static int counter;
	private Node head;
	
	public LinkedlistClass() 
	{
	
	}
	
	private static void incrementcounter()
	{
		counter++;
	}

	public void appendAtfirst(Object data)
	{
		
		Node temp = new Node(data);
		temp.setNext(head);
		head = temp;
	}
	
	
	public void appendAtlast(Object data)
	{
		if(head == null)
		{
			head = new Node(data);
		}
		
		Node temp = new Node(data);
		Node current = head;
		
		if(current!= null)
		{
			while(current.getNext()!= null)
			{
				current = current.getNext();
			}
			
			current.setNext(temp);
		}
		incrementcounter();
	}

	public int sizeOflist()
{
	int counter1 = 0;
	while(head.getNext()!= null)
	{
		counter1++;
	}
	System.out.println(counter1);
	return counter1;
}

	
@Override public String toString()
{
	String output = "";
	if (head != null)
	{	
	Node current = head;
	while(current.getNext()!=null){
		output +="[" + current.getdata().toString() + "]";
		current = current.getNext();
		
	}
	}
	return output;
	
}


	
}
