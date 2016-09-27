
public class LinkList {

	private Node head;
	private static int counter;
	
	public LinkList() {
	
	}
	
	public static int incerement()
	{
		return counter++;
	}
	
	public void addtostart(Object data)
	{
		if(head == null)
		{
			head = new Node(data);
		}
		
		Node temp = new Node(data);
		Node current = head;
		temp.setNext(current);
		head = temp;
	
		incerement();
		
	}

	public void insertAtEnd(Object data)
	{
		if(head==null)
		{
		 head = new Node(data);
		}
		Node temp = new Node(data);
		Node current = head;
		if(current!= null)
		{
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			
			current.setNext(temp);
		}
		incerement();
	}	
	public  void  printList()
	{
		
		while(head.getNext()!= null)
		{
			System.out.println(head.getData());
			
			head = head.getNext();
		}
		
	}
	
public void insertinmiddle(Object data,int position)
	{
  if(head == null)
   {
	head = new Node(data);
   }
if(position>incerement())
{
	Node temp = new Node(data);
	Node current = head;
	if(current!= null)
	{
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		current.setNext(temp);
	}
	incerement();
}

if(position>0 && position<incerement())
{
	int k = 0;
	Node temp = new Node(data);
	Node current = head;
	Node later = head.getNext();
    while(k<position-1)
    {
    	current = current.getNext();
    	
    	later = later.getNext();
    	k++;
    }
    current.setNext(temp);
    temp.setNext(later);
    
}
	}
	
public void deletefromend()
{
	Node current = head;
	Node temp = head.getNext();

	while(temp.getNext()!=null)
	{
		current = current.getNext();
		temp = temp.getNext();
	}
	temp.setNext(null);
}
	
public void listCount()
{
	int size = 0;
	Node current1 = head;
	
	while (current1.getNext() !=null)
	{
		current1 = current1.getNext();
	size++;
	}
 System.out.println(size);
}
	
public static void main(String...args)
{
	System.out.println("Jack was here");
}

}
