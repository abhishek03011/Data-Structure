
public class Linklist 
{
private Node head;
private static int counter = 0;	
public Linklist() 
	{
	}
	
public static int increment()
{
	return counter++;
}

public void addfirstolist(int data)
{
	Node node = new Node(data);
	node.setNext(head);
	head = node;
	increment();
}

public void addtolast(int data)
{
	if(head == null)
	{
		head = new Node(data);
	}
	
	Node current = head;
	Node temp = new Node(data);
	if(current != null)
	{
		while(current.getNext()!=null)
		{
			current = current.getNext();
		}
		current.setNext(temp);
	}
   increment();	
}
	public void inmiddle(int data,int position)
	{
		if (head == null)
		{
			head = new Node(data);
		}
		Node current = head;
		Node temp = new Node(data);
		for(int k = 0; k<position;k++)
		{
			current = current.getNext();
		}
		Node nextplace = current.getNext();
		current.setNext(temp);
		temp.setNext(nextplace);
		increment();
	}

	public void printlist()
		{
		Node current = head;
		if(current!=null)
		{
			while(current.getNext()!=null)
			{
				
			current = current.getNext();
			System.out.println(current.getData());
			}
		}
		}
	public int alternateevensum()
	{
		int sum = 0;
		Node current = head;
		if(current!=null)
		{
			while(current.getNext()!=null)
			{
				current = current.getNext().getNext();
				sum = sum + current.getData();
			}
		
		}
		return sum;
	}
	public int alternateoddsum()
	{
		
		Node current = head;
		int sum =  0;
		if(current!=null)
		{
			int i = 0;
			while(current.getNext()!=null)
			{
				current = current.getNext();
				if(i%2==0)
				{
					sum += current.getData();
				}
	       	i++;
			}
			
		}
		return sum;
	}
}
