
public class DLinkList {

	private Dnode head;
	private Dnode tail;
	private static int length;
	public DLinkList() 
	{
	 head = new Dnode(Integer.MIN_VALUE,null,null);
	 tail = new Dnode(Integer.MIN_VALUE,head,null);
	 length = 0;
	 head.setNext(tail);
	 incerement();
	}
	public static int decrement()
	{
		return length--;
	}
	public static int incerement()
	{
		return length++;
		
	}
	public void addfirst(int data)
	{
		if(head==null)
		{
			head = new Dnode(data);
			tail = head;
			incerement();
		}
        Dnode temp = new Dnode(data);
        temp.setNext(head);
        head.setPrev(temp);
        head= temp;
        incerement();
		
	}
	
	public void insertafterhead(int data)
	{
		Dnode temp = head;
		Dnode newnode = new Dnode(data,temp,temp.getNext());
		newnode.getNext().setPrev(newnode);
		temp.setNext(newnode);
		incerement();
	}

	public void addinBetween(int data,int position)
	{
		if(position>incerement())
		{
			position = incerement();
		}
		
		if(position <0)
		{
			position = 0;
		}
		
		if (head==null)
		{
			head = new Dnode(data);
			tail = head;
			incerement();
		}
		
		else if (position == 0)
		{
			Dnode temp = new Dnode(data);
			temp.setNext(head);
			head.setPrev(temp);
			head = temp;
			incerement();
		}
		else
		{
			Dnode temp = head;
			for(int i = 1; i< position;i+=1)
			{
				temp = temp.getNext();
			}
			Dnode newnode = new Dnode(data);
			Dnode current = temp.getNext();
			temp.setNext(newnode);
			newnode.setPrev(temp);
			newnode.setNext(current);
			current.setPrev(newnode);
			
			incerement();
		}
	}
	public void insertatlast(int data)
	{
		Dnode newnode = new Dnode(data,tail,null);
		tail.setNext(newnode);
		tail = newnode;
		incerement();
	}
	
	public int findnodewithdata(int data)
	{
		int pos = 0;
		Dnode temp = head;
		
		while(temp!=null)
		{
		if(temp.getData()==data)
		{
			return pos;
		}
		pos+=1;
		temp=temp.getNext();
		}
		
		
        return pos;		
	}
	public void printlist()
	{
		Dnode temp = head;
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
		while(temp!=null)
		{
			System.out.print("<->"+temp.getData());
			temp = temp.getNext();
			
		}
		System.out.println("\n");
	}
	}	
	public void listlength()
	{
		int counter = 0;
		Dnode temp = head;
		while(temp!=null)
		{
			counter +=1;
			temp= temp.getNext();
		}
		System.out.println("The count of the link list is: "+counter);
	}
	
	public int finddatabeforecurrent(int data)
	{
		int value = 0;
		Dnode temp = head;
		while(temp!=null)
		{
			if(temp.getData()==data)
			{
				
				value = temp.getPrev().getData();
			}
			
			temp = temp.getNext();
		}
		return value;

    }
	
	public void deletefirstnode()
	{
		Dnode temp = head;
		Dnode current = temp.getNext();
		head = current;
		temp.setNext(null);
		decrement();
	}
	
	public void deletefromlast()
	{
		Dnode temp = head;
		while(temp.getNext()!=null)
		{			
			temp = temp.getNext();	
		}
		temp = temp.getPrev();
		tail = temp;
		temp.setNext(null);
		decrement();
	}
	
	public void printtail()
	{
		System.out.println("The tail value is: "+tail.getData());
	}
	public void printhead()
	{
		System.out.println("The head value is :" + head.getData());
	}
	
	public void deleteatposition(int position)
	{
	if(position<0)
	{
		position = 0;
	}
	if(position>incerement())
	{
		position = incerement();
	}
	
	if(head == null)
	{
		System.out.println("Nothing to delete");
	}
	else if(position == 0)
	{
		head= head.getNext();
		if(head == null)
		{
			head = tail;
		}
	}
	else
	{
		Dnode temp = head;
		for(int i = 1 ; i<position; i++)
		{
			temp=temp.getNext();
		}
		
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		
	}
		
	}
	
	public void deleteEntireList()
	{
		head = null;
	}
	
	public void deletewithavalue(int value)
	{
		int pos = 0;
		
		Dnode temp = head;
		while(temp.getNext()!=null)
		{
		if(temp.getData() == value)
		{
		deleteatposition(pos);
		}
		pos+=1;
		temp = temp.getNext();
	    }
	}
	
	public void printListinreverseorder()
	{

	
	Dnode temp = tail;
	while(temp.getPrev()!=null)
	{
		System.out.print(temp.getData()+"<->");
		temp = temp.getPrev();
	}
	}
}
