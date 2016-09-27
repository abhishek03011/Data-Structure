	
	public class LinkedList
	{
	
	    private Node head;
	    private static int counter = 0;	
	
		public LinkedList() 
		{
			head = null;
		}
	
	public static int increment()
	{
		return counter++;
	}
	
	public void addfirst(int data)
	{
		if (head==null)
		{
			head= new Node(data);
		}
	  
	  Node current = head;
	  Node temp = new Node(data);
	  temp.setNext(current);
	  head = temp;
	  
	  increment();
	
	}
	
	public int countNodes()
	{
		int count = 0;
		Node current = head;
		while(current!=null)
		{
		count += 1;
		current = current.getNext();
		}
		
		return count;
	}
	
		public void addAtend(int data)
		{
			if(head==null)
			  head = new Node(data);
			Node current = head;
			Node temp = new Node(data);
			if(current!=null)
			{
			while(current.getNext()!=null)
			{
				current = current.getNext();
			}
			  current.setNext(temp);
			}
		  
			increment();
		}
	
	public void printList()
	{
		Node current = head;
		if (current!=null)
		{
		while(current!= null)
		{
			System.out.println(current.getData());
			current = current.getNext();
		}
		}
	}
	
	
	
	}
